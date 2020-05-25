package developia.mvctest.repository;

import developia.mvctest.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findByFirstName(String firstName);

    Student findByEmailOrPhone(String email, String phone);
}
