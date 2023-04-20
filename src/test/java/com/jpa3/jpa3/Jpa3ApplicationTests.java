package com.jpa3.jpa3;

import com.jpa3.jpa3.oneToManyUni.AuthorRepoUni;
import com.jpa3.jpa3.oneToManyUni.BookRepoUni;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.HashSet;

@SpringBootTest
class Jpa3ApplicationTests {

     @Autowired
	 AuthorRepoUni auRepo;
	 @Autowired
	 BookRepoUni bRepo;
/*
	 @Test
	 public void testCreate(){
		 HashSet<Book> bk = new HashSet<Book>();

		 Author author = new Author();
		 Book book = new Book();
		 author.setName("Chetan Bhagat");
		 author.setId(101);
		 book.setName("2 States");
		 book.setId(203);
		 book.setAuthor(author);
		 bk.add(book);

		 author.setBook(bk);
		 auRepo.save(author);

	 }*/
}