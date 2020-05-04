package developia.mvctest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository repository;

    @GetMapping("/school/students") // request
    public List<Student> students() {
        return repository.findAll(); // response
    }

    @GetMapping("/school") // request
    public School school() {
        School school = new School();
        List<Student> students = repository.findAll();
        school.setName("e39");
        school.setStudents(students);
        return school;
    }
}
