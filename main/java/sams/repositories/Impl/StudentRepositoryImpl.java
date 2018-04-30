package sams.repositories.Impl;

import sams.domain.Student;
import sams.repositories.StudentRepository;

import java.util.HashMap;
import java.util.Map;

public class StudentRepositoryImpl implements StudentRepository
{
    public static StudentRepositoryImpl studentRepository = null;

    private Map<Integer,Student> studentTable;

    private StudentRepositoryImpl() {studentTable = new HashMap<Integer, Student>();}

    public static StudentRepositoryImpl getInstance()
    {
        if(studentRepository == null)
            studentRepository = new StudentRepositoryImpl();
        return studentRepository;
    }

    public Student create(Student student)
    {
        studentTable.put(student.getStudentId(),student);
        Student savedStudent = studentTable.get(student.getStudentId());
        return savedStudent;
    }

    public Student read(int studentId)
    {
        Student student = studentTable.get(studentId);
        return student;
    }

    public Student update(Student student)
    {
        studentTable.put(student.getStudentId(),student);
        Student savedStudent = studentTable.get(student.getStudentId());
        return savedStudent;
    }

    public void delete(int studentId)
    {
        studentTable.remove(studentId);
    }
}
