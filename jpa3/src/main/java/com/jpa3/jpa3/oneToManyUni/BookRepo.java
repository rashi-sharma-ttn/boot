package com.jpa3.jpa3.oneToMany;

import com.jpa3.jpa3.oneToMany.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepo extends CrudRepository<Book,Integer> {
}
