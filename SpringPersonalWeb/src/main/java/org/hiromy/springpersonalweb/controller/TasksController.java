package org.hiromy.springpersonalweb.controller;

import org.hibernate.annotations.IdGeneratorType;
import org.hiromy.springpersonalweb.model.Tasks;
import org.hiromy.springpersonalweb.repository.TasksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Date;
import java.text.SimpleDateFormat;

@Controller
public class TasksController {
    @Autowired
    private TasksRepository repository;

    @GetMapping("/")
    public String home() {
        return "redirect:/tasks";
    }

    @GetMapping("/tasks")
    public String findAll(Model model){
        model.addAttribute("tasks", repository.findAll());
        return "tasks-list";
    }

    @GetMapping("/tasks/view/{id}")
    public String findById(@PathVariable long id, Model model){
        model.addAttribute("task", repository.findById(id).get());
        return "tasks-view";
    }
    @GetMapping("/tasks/form")
    public String getEmptyForm(Model model){
        model.addAttribute("task", new Tasks());
        return "tasks-form";
    }

    @GetMapping("/tasks/edit/{id}")
    public String taskEditForm(@PathVariable long id, Model model){
        if (repository.existsById(id)){
            repository.findById(id).ifPresent(t -> {
                model.addAttribute("task", t);

            });
            return "tasks-form";
        }else{
            return "redirect:/tasks";
        }
    }

    @PostMapping("/tasks")
    public String create(@ModelAttribute Tasks task){
        if (task.getId() != null){
            repository.findById(task.getId()).ifPresent(t -> {
                t.setTitle(task.getTitle());
                t.setDescription(task.getDescription());
                t.setDueDate(task.getDueDate());
                repository.save(t);
            });
        }else{
            repository.save(task);
        }
        return "redirect:/tasks";
    }

    @GetMapping("/tasks/delete/{id}")
    public String delete(@PathVariable long id){
        if (repository.existsById(id)){
            repository.deleteById(id);
        }
        return "redirect:/tasks";
    }

}
