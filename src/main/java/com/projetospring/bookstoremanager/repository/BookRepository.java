package com.projetospring.bookstoremanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetospring.bookstoremanager.entity.Book;

public interface BookRepository extends JpaRepository<Book,Long>{

}
