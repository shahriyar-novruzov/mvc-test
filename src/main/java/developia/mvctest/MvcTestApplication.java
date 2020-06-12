package developia.mvctest;

import developia.mvctest.entity.Course;
import developia.mvctest.entity.Student;
import developia.mvctest.repository.CourseRepository;
import developia.mvctest.service.StudentService;
import developia.mvctest.service.UniversityService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class MvcTestApplication implements CommandLineRunner {

    private StudentService studentService;
    private UniversityService universityService;
    private CourseRepository courseRepository;

    public MvcTestApplication(StudentService studentService, UniversityService universityService,
                              CourseRepository courseRepository) {
        this.studentService = studentService;
        this.universityService = universityService;
        this.courseRepository = courseRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(MvcTestApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        String s = ""; // empty
        System.out.println(s.length());
    }
}
