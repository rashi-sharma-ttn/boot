package com.jpa3.jpa3.oneToManyUni;

import org.springframework.data.repository.CrudRepository;

public interface BookRepoUni extends CrudRepository<BookUni,Integer> {
}
