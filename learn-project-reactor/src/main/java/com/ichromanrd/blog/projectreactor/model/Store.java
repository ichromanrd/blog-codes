package com.ichromanrd.blog.projectreactor.model;

import java.util.List;

public class Store {
    private int storeId;
    private String storeName;
    private List<Cashier> cashiers;
    private List<BookShelf> bookShelves;

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public List<Cashier> getCashiers() {
        return cashiers;
    }

    public void setCashiers(List<Cashier> cashiers) {
        this.cashiers = cashiers;
    }

    public List<BookShelf> getBookShelves() {
        return bookShelves;
    }

    public void setBookShelves(List<BookShelf> bookShelves) {
        this.bookShelves = bookShelves;
    }
}
