package developia.mvctest.service.impl;

import developia.mvctest.entity.Student;
import developia.mvctest.exception.NotFoundException;
import developia.mvctest.repository.StudentRepository;
import developia.mvctest.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student findById(Long id) {
        try {
            return studentRepository.findById(id).get();
        } catch (Exception e) {
            throw new NotFoundException("Student id: " + id + " not found");
        }
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findByFirstName(String firstName) {
        return studentRepository.findByFirstName(firstName);
    }

    @Override
    public Student findByEmailAndPhone(String email, String phone) {
        return studentRepository.findByEmailOrPhone(email, phone);
    }

    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void delete(Long id) {
        Student student = studentRepository.findById(id).get();
        studentRepository.delete(student);
    }
}
