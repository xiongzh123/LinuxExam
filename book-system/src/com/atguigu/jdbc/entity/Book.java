package com.atguigu.jdbc.entity;

import java.io.Serializable;

public class Book implements Serializable {
    private Integer bookId;
    private String bookName;
    private String bookStatus;
    private String bookCopyriht;

    public Book(Integer bookId, String bookName, String bookStatus, String bookCopyriht) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookStatus = bookStatus;
        this.bookCopyriht = bookCopyriht;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(String bookStatus) {
        this.bookStatus = bookStatus;
    }

    public String getBookCopyriht() {
        return bookCopyriht;
    }

    public void setBookCopyriht(String bookCopyriht) {
        this.bookCopyriht = bookCopyriht;
    }

    @Override
    public String toString() {
        return "book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookStatus='" + bookStatus + '\'' +
                ", bookCopyriht='" + bookCopyriht + '\'' +
                '}';
    }
}
