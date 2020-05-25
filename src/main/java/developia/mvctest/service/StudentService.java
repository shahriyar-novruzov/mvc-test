package developia.mvctest.service;

import developia.mvctest.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    Student findById(Long id);

    List<Student> findAll();

    Student findByFirstName(String firstName);

    Student findByEmailAndPhone(String email, String phone);

    void create(Student student);

    void delete(Long id);
}
