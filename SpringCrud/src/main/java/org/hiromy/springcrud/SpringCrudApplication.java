package org.hiromy.springcrud;

import org.hiromy.springcrud.model.Book;
import org.hiromy.springcrud.repository.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringCrudApplication {

    public static void main(String[] args) {
        ApplicationContext context= SpringApplication.run(SpringCrudApplication.class, args);
        var repo = context.getBean(BookRepository.class);
        List<Book> books = List.of(
                new Book(null, "book1","author1",10.0),
                new Book(null, "book2","author2",15.0),
                new Book(null, "book3","author3",20.0),
                new Book(null, "book4","author4",25.0)
        );
        repo.saveAll(books);
    }

}
