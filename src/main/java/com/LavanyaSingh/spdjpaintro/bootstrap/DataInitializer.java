package com.LavanyaSingh.spdjpaintro.bootstrap;

import com.LavanyaSingh.spdjpaintro.domain.Book;
import com.LavanyaSingh.spdjpaintro.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final BookRepository bookRepository;


    public DataInitializer(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Book bookDDD = new Book("Domain Driven Design", "123", "RandomHouse");

        Book savedDDD = bookRepository.save(bookDDD);
        System.out.println("Id: "+ savedDDD.getId());

        Book bookSIA = new Book("Spring In Action", "23456", "OReily");
        Book savedSIA = bookRepository.save(bookSIA);
        System.out.println("Id: "+savedSIA.getId());

//        bookRepository.findAll().forEach(book -> {
//            System.out.println("Book ID: "+ book.getId());
//            System.out.println("Book Title: "+ book.getTitle());
//        });

    }
}
