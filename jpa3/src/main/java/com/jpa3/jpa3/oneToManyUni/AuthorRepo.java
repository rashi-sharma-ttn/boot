package com.jpa3.jpa3.oneToMany;

import com.jpa3.jpa3.oneToMany.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepo extends CrudRepository<Author,Integer>{
}
