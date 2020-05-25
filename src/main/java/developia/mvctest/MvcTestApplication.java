package developia.mvctest;

import developia.mvctest.entity.Student;
import developia.mvctest.service.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MvcTestApplication implements CommandLineRunner {

    private StudentService studentService;

    public MvcTestApplication(StudentService studentService) {
        this.studentService = studentService;
    }

    public static void main(String[] args) {
        SpringApplication.run(MvcTestApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Student student1 = studentService.findById(51L);
        Student student2 = studentService.findById(61L);

        System.out.println(student1);
        System.out.println(student2);

        System.out.println(student1.equals(student2));

    }
}
