package com.example.a_recyceleview;

import java.util.List;

public class Catalog {
    private String catalogName;

    private List<Book> bookList;

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public Catalog(String catalogName, List<Book> bookList) {
        this.catalogName = catalogName;
        this.bookList = bookList;
    }
}
