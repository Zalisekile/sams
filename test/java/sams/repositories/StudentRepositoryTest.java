package sams.repositories;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sams.domain.Student;
import sams.factories.StudentFactory;
import sams.repositories.Impl.StudentRepositoryImpl;

import java.util.HashMap;
import java.util.Map;


public class StudentRepositoryTest {
    Map values;
    StudentRepository studentRepository;

    @Before
    public void setUp() throws Exception
    {
        studentRepository = StudentRepositoryImpl.getInstance();
        values = new HashMap();
        values.put("studentId",212205587);
        values.put("name","Jacob");
        values.put("surname","Zuma");
        values.put("email","jacobzuma@nkandla.com");
        values.put("course","Political Science");
        values.put("phoneNumber","0813418680");
        values.put("password","MshiniWam");
        values.put("verified",false);
    }


    @Test
    public void create()
    {
        Student student = StudentFactory.getStudent(values);
        studentRepository.create(student);
        Assert.assertEquals("Zuma",student.getSurname());
    }

    @Test()
    public void read()
    {
        create();
        Student readStudent = studentRepository.read(212205587);
        Assert.assertEquals("Jacob",readStudent.getName());
    }

    @Test
    public void update()
    {
        read();
        Student student = studentRepository.read(212205587);

        Student newStudent = new Student.Builder()
                .studentId((Integer) values.get("studentId"))
                .name( "Thabo")
                .surname( "Mbeki")
                .email((String) values.get("email"))
                .course((String) values.get("course"))
                .phoneNumber((String) values.get("phoneNumber"))
                .password((String) values.get("password"))
                .verified((Boolean) values.get("verified"))
                .build();
        studentRepository.update(newStudent);
        Student updatedStudent = studentRepository.read(212205587);
        Assert.assertEquals("Mbeki",updatedStudent.getSurname());
    }

    @Test
    public void delete()
    {
        update();
        studentRepository.delete(212205587);
        Student student = studentRepository.read(212205587);
        Assert.assertNull(student);
    }
}