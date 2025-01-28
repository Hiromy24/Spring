package org.hiromy.springweb;

import org.hiromy.springweb.model.Manufacturer;
import org.hiromy.springweb.repository.ManufacturerRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringWebApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringWebApplication.class, args);
		var repo =context.getBean(ManufacturerRepository.class);
		repo.save(new Manufacturer(null, "manufacturer1", 1000, 1990));

	}

}
