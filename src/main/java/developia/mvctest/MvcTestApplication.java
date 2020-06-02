package developia.mvctest;

import developia.mvctest.entity.Student;
import developia.mvctest.entity.University;
import developia.mvctest.service.StudentService;
import developia.mvctest.service.UniversityService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MvcTestApplication implements CommandLineRunner {

    private StudentService studentService;
    private UniversityService universityService;

    public MvcTestApplication(StudentService studentService, UniversityService universityService) {
        this.studentService = studentService;
        this.universityService = universityService;
    }

    public static void main(String[] args) {
        SpringApplication.run(MvcTestApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

//        University university = universityService.findById(76L);
//
//        Student student = studentService.findById(78L);
//        student.setUniversity(university);
//
//        studentService.save(student);
    }
}
