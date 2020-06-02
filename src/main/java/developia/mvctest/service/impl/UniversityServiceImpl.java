package developia.mvctest.service.impl;

import developia.mvctest.entity.University;
import developia.mvctest.repository.UniversityRepository;
import developia.mvctest.service.UniversityService;
import org.springframework.stereotype.Service;

@Service
public class UniversityServiceImpl implements UniversityService {

    private UniversityRepository universityRepository;

    public UniversityServiceImpl(UniversityRepository universityRepository) {
        this.universityRepository = universityRepository;
    }

    @Override
    public void create(University university) {
        universityRepository.save(university);
    }

    @Override
    public University findById(Long id) {
        return universityRepository.findById(id).get();
    }
}
