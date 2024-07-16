package com.polarbookshop.catalogservice.domain;

public class BookAlreadyExistsException extends RuntimeException {
    public BookAlreadyExistsException(String isbn) {
        super(String.format("A Book with ISBN %s already exists.", isbn));
    }
}
