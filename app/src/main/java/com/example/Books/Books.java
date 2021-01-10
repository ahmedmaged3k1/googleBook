package com.example.google_books.Books;

public class Books {
    private String book_name ;
    private String book_author ;
    private int book_imgurl;
    private String book_pages ;
    private String book_reviews;
    private String book_description;


    public Books(String book_name, String book_author, int book_imgurl, String book_pages, String book_reviews, String book_description) {
        this.book_name = book_name;
        this.book_author = book_author;
        this.book_imgurl = book_imgurl;
        this.book_pages = book_pages;
        this.book_reviews = book_reviews;
        this.book_description = book_description;
    }

    public String getBook_description() {
        return book_description;
    }

    public void setBook_description(String book_description) {
        this.book_description = book_description;
    }

    public String getBook_name() {
        return book_name;
    }

    public String getBook_author() {
        return book_author;
    }

    public int getBook_imgurl() {
        return book_imgurl;
    }

    public String getBook_pages() {
        return book_pages;
    }

    public String getBook_reviews() {
        return book_reviews;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public void setBook_author(String book_author) {
        this.book_author = book_author;
    }

    public void setBook_imgurl(int book_imgurl) {
        this.book_imgurl = book_imgurl;
    }

    public void setBook_pages(String book_pages) {
        this.book_pages = book_pages;
    }

    public void setBook_reviews(String book_reviews) {
        this.book_reviews = book_reviews;
    }
}
