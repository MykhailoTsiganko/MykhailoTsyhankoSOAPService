package com.epam.lab.soap.web;

import com.epam.lab.soap.dao.BookDAO;
import com.epam.lab.soap.model.Book;
import com.epam.lab.soap.web.faults.FaultMessageExpression;
import com.epam.lab.soap.web.faults.ServiceException;
import com.epam.lab.soap.web.faults.ServiceFaultInfo;

import javax.jws.WebService;
import java.util.List;
import java.util.Objects;

@WebService(endpointInterface = "com.epam.lab.soap.web.LibraryService")
public class LibraryServiceImpl implements LibraryService {
    @Override
    public List<Book> getAllBooks() {
        return BookDAO.getAllBooks();
    }

    @Override
    public Book getBook(String name) throws ServiceException {

        Book book;
        book = BookDAO.getBookByName(name);

        if (Objects.isNull(book)) {
            throw new ServiceException(new ServiceFaultInfo(FaultMessageExpression.NO_BOOK_WITH_NAME,name));
        }
        return book;
    }

    @Override
    public boolean turnBackBook(Book book) {

        return BookDAO.addBook(book);
    }

    @Override
    public Book exchangeBook(Book book, String requiredBookName) throws ServiceException {
        BookDAO.addBook(book);
        Book requiredBook = BookDAO.getBookByName(requiredBookName);

        if (Objects.isNull(requiredBook)) {
            throw new ServiceException(new ServiceFaultInfo(FaultMessageExpression.NO_BOOK_WITH_NAME,requiredBookName));
        }
        return book;
    }

    @Override
    public List<Book> getAuthorBooks(String authorName) {
        return null;
    }
}
