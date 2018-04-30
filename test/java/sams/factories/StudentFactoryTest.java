package sams.factories;

import org.junit.Before;
import org.junit.Test;
import sams.domain.Student;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;


public class StudentFactoryTest {

    Map values;

    @Before
    public void setUp() throws Exception
    {
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
    public void getStudent()
    {
        Student student = StudentFactory.getStudent(values);
        assertEquals("Zuma",student.getSurname());


    }
}