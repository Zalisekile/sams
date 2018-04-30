package sams.services;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sams.domain.Student;
import sams.factories.StudentFactory;
import sams.services.Impl.StudentServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class StudentServiceTest {

    Map values;
    StudentService studentService;


    @Before
    public void setUp() throws Exception
    {
        studentService = new StudentServiceImpl();
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
        studentService.create(student);
        Assert.assertEquals("Zuma",student.getSurname());
    }

    @Test
    public void read()
    {
        create();
        Student readStudent = studentService.read(212205587);
        Assert.assertEquals("Jacob",readStudent.getName());
    }

    @Test
    public void update()
    {
        read();
        Student student = studentService.read(212205587);

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
        studentService.update(newStudent);
        Student updatedStudent = studentService.read(212205587);
        Assert.assertEquals("Mbeki",updatedStudent.getSurname());
    }


    @Test
    public void delete()
    {
        update();
        studentService.delete(212205587);
        Student student = studentService.read(212205587);
        Assert.assertNull(student);
    }
}
