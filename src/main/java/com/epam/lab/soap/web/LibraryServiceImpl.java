package com.epam.lab.soap.web;

import com.epam.lab.soap.dao.BookDAO;
import com.epam.lab.soap.model.Book;

import javax.jws.WebService;
import java.util.List;

@WebService(endpointInterface = "com.epam.lab.soap.web.LibraryService")
public class LibraryServiceImpl implements LibraryService {
    @Override
    public List<Book> getAllBooks() {
        return BookDAO.getAllBooks();
    }

    @Override
    public Book getBook(String name) {
        return BookDAO.getBookByName(name);
    }

    @Override
    public boolean turnBackBook(Book book) {

        return BookDAO.addBook(book);
    }

    @Override
    public Book exchangeBook(Book book, String requiredBookName) {
        BookDAO.addBook(book);

        return BookDAO.getBookByName(requiredBookName);
    }

    @Override
    public List<Book> getAuthorBooks(String authorName) {
        return null;
    }
}
