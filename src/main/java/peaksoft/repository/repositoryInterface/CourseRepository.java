package peaksoft.repository.repositoryInterface;


import peaksoft.model.Course;

import java.util.List;

public interface CourseRepository {
    Course saveCourse(Course course);

    void removeCourseById(Long id);

    Course getById(Long id);

    List<Course> getAllCourse();

    void updateCourse( Course course);
}
