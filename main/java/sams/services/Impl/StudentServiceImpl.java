package sams.services.Impl;

import sams.domain.Student;
import sams.repositories.Impl.StudentRepositoryImpl;
import sams.repositories.StudentRepository;
import sams.services.StudentService;

public class StudentServiceImpl implements StudentService
{
    private static StudentServiceImpl service = null;

    StudentRepository repository = StudentRepositoryImpl.getInstance();

    public static StudentServiceImpl getInstance()
    {
        if(service == null)
            service = new StudentServiceImpl();
        return service;
    }

    public Student create(Student student)
    {
        return repository.create(student);
    }

    public Student read(int studentId)
    {
        return repository.read(studentId);
    }

    public Student update(Student student) {
        return repository.update(student);
    }

    public void delete(int studentId)
    {
        repository.delete(studentId);

    }
}
