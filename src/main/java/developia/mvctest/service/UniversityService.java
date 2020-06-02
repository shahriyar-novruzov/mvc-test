package developia.mvctest.service;

import developia.mvctest.entity.University;
import org.springframework.stereotype.Service;

@Service
public interface UniversityService {
    void create(University university);

    University findById(Long id);
}
