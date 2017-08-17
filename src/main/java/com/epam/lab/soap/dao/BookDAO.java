package com.epam.lab.soap.dao;

import com.epam.lab.soap.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

    public static List<Book> bookList;

    static{
        bookList = new ArrayList<>();

        bookList.add(new Book("Чорний ворон", "Василь Шкляр" ,"Пригоди"));
            bookList.add(new Book("Воно", "Стівен кінг" ,"Жахи"));
        bookList.add(new Book("Маруся", "Василь Шкляр" ,"Пригоди"));
        bookList.add(new Book("Чорна рада", "Пантелеймон Куліш" ,"Пригоди"));
        bookList.add(new Book("Жовтий князь", "Василь Барка" ,"Історичний роман"));
        bookList.add(new Book("Гра престолів", "Джордж Мартін" ,"Фентезі"));
        bookList.add(new Book("Волода перстнів", "Толкінг" ,"фентезі"));
        bookList.add(new Book("Битва П'яти королів", "Джордж Мартін" ,"Фентезі"));
        bookList.add(new Book("Сім", "Стівен Кінг" ,"Детектив"));
        bookList.add(new Book("Інферно", "Ден Браун" ,"детектив"));
        bookList.add(new Book("Ангели та демони", "Ден Браун" ,"Детектив"));
        bookList.add(new Book("Код Давінчі", "Ден Браун" ,"Детектив"));
        bookList.add(new Book("Маренький принц", "Антуан де Сент Екзюпері" ,"Фантастика"));
        bookList.add(new Book("Алхімік", "Пауло Коельйо" ,"Містика"));
        bookList.add(new Book("Інтермецо", "Микола Хвильовий" ,"Пригоди"));

    }

    public static List<Book> getAllBooks() {
        return bookList;
    }

    public static Book getBookByName(String name) {
        Book myBook = null;
        for(Book book :bookList) {
            if(book.getName().equals(name)) {
                myBook=  book;
                break;
            }
        }

        return myBook;
    }

    public static boolean addBook(Book book) {
        if(bookList.contains(book)) {
            return false;
        } else {
            bookList.add(book);
            return true;
        }
    }
}
