package sams.factories;

import org.junit.Before;
import org.junit.Test;
import sams.domain.Lecturer;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class LecturerFactoryTest {
    Map values;
    @Before
    public void setUp() throws Exception
    {
        values = new HashMap();
        values.put("lecturerId",212205548);
        values.put("name","Arinze");
        values.put("surname","Anikwue");
    }

    @Test
    public void getLecturer()
    {
        Lecturer lecturer = LecturerFactory.getLecturer(values);
        assertEquals("Anikwue",lecturer.getSurname());
    }
}