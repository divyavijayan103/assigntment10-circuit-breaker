package com.example

import com.example.domain.Book;
import io.micronaut.retry.annotation.Fallback;
import io.reactivex.Flowable

import javax.inject.Inject;

@Fallback
class BooksService {

    @Inject
    Service2Client service2Client

    Flowable<ArrayList<Book>> findBooks() {
        return Flowable.just(new ArrayList<>());
    }
}