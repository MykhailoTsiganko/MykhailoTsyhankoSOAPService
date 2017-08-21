package com.epam.lab.soap.web;

import com.epam.lab.soap.dao.BookDAO;
import com.epam.lab.soap.model.Book;
import com.epam.lab.soap.web.faults.LibraryServiceExeption;

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
    public Book getBook(String name) throws LibraryServiceExeption {

        Book book;
        book = BookDAO.getBookByName(name);

        if (Objects.isNull(book)) {
            throw new LibraryServiceExeption("there is no such book!");
        }
        return book;
    }

    @Override
    public boolean turnBackBook(Book book) {

        return BookDAO.addBook(book);
    }

    @Override
    public Book exchangeBook(Book book, String requiredBookName) throws LibraryServiceExeption {
        BookDAO.addBook(book);
        Book requiredBook = BookDAO.getBookByName(requiredBookName);

        if (Objects.isNull(requiredBook)) {
            throw new LibraryServiceExeption("there is no such Book");
        }
        return book;
    }

    @Override
    public List<Book> getAuthorBooks(String authorName) {
        return null;
    }
}
