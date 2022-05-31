package peaksoft.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import peaksoft.model.Course;
import peaksoft.repository.repositoryInterface.CourseRepository;
import peaksoft.service.CourseService;


import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class CourseServiceImpl implements CourseService {
    private final CourseRepository repo;

    @Autowired
    public CourseServiceImpl(CourseRepository repo) {
        this.repo = repo;
    }

    @Override
    public Course saveCourse(Course course) {
        return repo.saveCourse(course);
    }

    @Override
    public void removeCourseById(Long id) {
        repo.removeCourseById(id);
    }

    @Override
    public Course getById(Long id) {
        return repo.getById(id);
    }

    @Override
    public List<Course> getAllCourse() {
        return repo.getAllCourse();
    }

    @Override
    public void updateCourse(Course course) {
        repo.updateCourse(course);
    }
}
