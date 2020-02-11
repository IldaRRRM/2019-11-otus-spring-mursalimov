package ru.otus.homework.springlibrary.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.otus.homework.springlibrary.domain.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
