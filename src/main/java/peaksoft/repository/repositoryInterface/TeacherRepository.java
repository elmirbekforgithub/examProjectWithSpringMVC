package peaksoft.repository.repositoryInterface;

import peaksoft.model.Teacher;

import java.util.List;

public interface TeacherRepository {

    Teacher saveTeacher(Teacher teacher);

    void removeTeacherById(Teacher teacher);

    Teacher getById(Long id);

    List<Teacher> getAllTeacher();

    void updateTeacher(Long id,Teacher teacher);
}
