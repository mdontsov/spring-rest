package demo.rest.controller;

import demo.pojo.Student;
import demo.rest.ObjectNotFoundException;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> students;

    @PostConstruct // <- will load the data only once
    public void loadData() {
        students = new ArrayList<>();
        students.add(new Student("Maksim", "Dontsov"));
        students.add(new Student("Igor", "Dontsov"));
        students.add(new Student("Irina", "Dontsova"));
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }

    @GetMapping("/students/{id}") // <- path variable name MUST match method argument name
    public Student getStudent(@PathVariable("id") int id) { // <- will return an ArrayList index
        if (id >= students.size() || id < 0) {
            throw new ObjectNotFoundException("Student with given id not found: " + id);
        }
        return students.get(id);
    }
}
