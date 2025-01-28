package org.hiromy.springpersonalweb;

import org.hiromy.springpersonalweb.model.Tasks;
import org.hiromy.springpersonalweb.repository.TasksRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.Date;
import java.util.List;

@SpringBootApplication
public class SpringPersonalWebApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringPersonalWebApplication.class, args);
        var repo = context.getBean(TasksRepository.class);
        List<Tasks>tasks = List.of(
                new Tasks(null, "Tarea1", "Esto es una tarea", new Date(System.currentTimeMillis())),
                new Tasks(null, "Tarea2", "Esto es una tarea 2", new Date(System.currentTimeMillis())),
                new Tasks(null, "Tarea3", "Esto es una tarea 3", new Date(System.currentTimeMillis())),
                new Tasks(null, "Tarea4", "Esto es una tarea 4", new Date(System.currentTimeMillis()))
        );
        repo.saveAll(tasks);
    }

}
