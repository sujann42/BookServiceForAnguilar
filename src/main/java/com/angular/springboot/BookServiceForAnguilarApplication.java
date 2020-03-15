package com.angular.springboot;

import com.angular.springboot.dto.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
@RestController
@CrossOrigin("http://localhost:4200")
public class BookServiceForAngularApplication {

	public static void main(String[] args) {

		SpringApplication.run(BookServiceForAnguilarApplication.class, args);
	}
	@GetMapping("/findAllBooks")
	public List<Book> getBooks(){
		return  Stream.of(new Book(101, "World Tour",  785),
				new Book(222, "Gone With The Wind",  1499),
				new Book(333, "Hope",  325),
				new Book(888, "Happy",  125),
				new Book(999, "Will You?",  522)
				).collect(Collectors.toList());
		}

}
