package com.ichromanrd.blog.projectreactor.model;

import java.util.List;

public class BookShelf {
    private int shelfId;
    private String type;
    private List<Book> books;

    public int getShelfId() {
        return shelfId;
    }

    public void setShelfId(int shelfId) {
        this.shelfId = shelfId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
