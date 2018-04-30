package sams.services;

import sams.domain.Student;

public interface StudentService
{
    Student create(Student person);
    Student read(int id);
    Student update(Student person);
    void delete (int id);
}
