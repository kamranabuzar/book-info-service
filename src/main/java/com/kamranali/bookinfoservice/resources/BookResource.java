package com.kamranali.bookinfoservice.resources;

import com.kamranali.bookinfoservice.models.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookResource {

    @RequestMapping("/{bookId}")
    public Book getBookInfo(@PathVariable("bookId") String bookId) {

        return new Book(bookId, "Jaffery Archer's Cane & Abel");
    }

}
