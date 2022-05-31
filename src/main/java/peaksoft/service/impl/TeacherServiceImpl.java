package peaksoft.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import peaksoft.model.Teacher;
import peaksoft.repository.repositoryInterface.TeacherRepository;
import peaksoft.service.TeacherService;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class TeacherServiceImpl implements TeacherService {
    private final TeacherRepository repo;

    @Autowired
    public TeacherServiceImpl(TeacherRepository repo) {
        this.repo = repo;
    }

    @Override
    public Teacher saveTeacher(Teacher teacher) {
        return repo.saveTeacher(teacher);
    }

    @Override
    public void removeTeacherById(Teacher teacher) {
        repo.removeTeacherById(teacher);
    }

    @Override
    public Teacher getById(Long id) {
        return repo.getById(id);
    }

    @Override
    public List<Teacher> getAllTeacher() {
        return repo.getAllTeacher();
    }

    @Override
    public void updateTeacher(Long id, Teacher teacher) {
        repo.updateTeacher(id, teacher);
    }
}
