package com.jpa3.jpa3.ManyToMany;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorManyRepo extends JpaRepository<AuthorMany,Integer> {
}
