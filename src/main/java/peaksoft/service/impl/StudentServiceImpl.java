package peaksoft.service.impl;

import org.springframework.stereotype.Service;
import peaksoft.model.Student;
import peaksoft.repository.repositoryInterface.StudentRepository;
import peaksoft.service.StudentService;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository repo;


    public StudentServiceImpl(StudentRepository repo) {
        this.repo = repo;
    }

    @Override
    public Student saveStudent(Student student) {
        return repo.saveStudent(student);
    }

    @Override
    public void removeStudentById(Long id) {
        repo.removeStudentById(id);
    }

    @Override
    public Student getById(Long id) {
        return repo.getById(id);
    }

    @Override
    public List<Student> getAllStudent() {
        return repo.getAllStudent();
    }

    @Override
    public void updateStudent( Long id,Student student) {
        repo.updateStudent(id,student);
    }

}
