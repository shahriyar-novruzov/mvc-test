package developia.mvctest.controller;

import developia.mvctest.entity.Student;
import developia.mvctest.service.StudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/student")
@Api("Student Controller")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/{id}") // /student/{id}
    @ApiOperation("Get student by id, ex: 51, 74 etc.")
    public Student findById(@PathVariable Long id) {
        return studentService.findById(id);
    }

    @GetMapping("/name/{firstName}") // /student/name/{firstName}
    @ApiOperation("find by first name, ex: Namazov, Aliyev etc.")
    public Student findByFirstName(@PathVariable String firstName) {
        return studentService.findByFirstName(firstName);
    }

    @GetMapping("/email/{email}/{phone}") // /student/email/{id}
    public Student findByEmailAndPhone(@PathVariable String email, @PathVariable String phone) {
        return studentService.findByEmailAndPhone(email, phone);
    }

    @GetMapping("/list") // /student/all
    public List<Student> findAll() {
        return studentService.findAll();
    }

    @PostMapping("/create")
    @ApiOperation("Student create")
    public void create(@RequestBody Student student) {
        studentService.save(student);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        studentService.delete(id);
    }
}
