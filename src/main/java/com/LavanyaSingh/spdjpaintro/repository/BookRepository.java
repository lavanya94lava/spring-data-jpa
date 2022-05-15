package com.LavanyaSingh.spdjpaintro.repository;

import com.LavanyaSingh.spdjpaintro.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
