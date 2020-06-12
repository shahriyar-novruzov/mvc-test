package developia.mvctest.repository;

import developia.mvctest.entity.Course;
import developia.mvctest.entity.University;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
