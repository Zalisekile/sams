package sams.repositories;

import sams.domain.Student;

public interface StudentRepository
{
    Student create(Student student);

    Student read(int studentId);

    Student update(Student student);

    void delete(int studentId);
}
