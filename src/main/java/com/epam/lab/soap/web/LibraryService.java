package com.epam.lab.soap.web;

import com.epam.lab.soap.model.Book;
import com.epam.lab.soap.web.faults.ServiceException;

import javax.jws.WebService;
import java.util.List;

@WebService
public interface LibraryService {
    public List<Book> getAllBooks();

    public Book getBook(String name) throws ServiceException;

    public boolean turnBackBook(Book book);

    public Book exchangeBook(Book book, String requiredBookName) throws ServiceException;

    public List<Book> getAuthorBooks(String authorName);
}
