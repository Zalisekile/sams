package sams.factories;

import org.junit.Before;
import org.junit.Test;
import sams.domain.Subject;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class SubjectFactoryTest {
    Map values;
    @Before
    public void setUp() throws Exception
    {
        values = new HashMap();
        values.put("lecturerId",212205486);
        values.put("subject","Technical Programming");
        values.put("subjectCode","TPG2");

    }

    @Test
    public void getSubject()
    {
        Subject subject = SubjectFactory.getSubject(values);
        assertEquals("Technical Programming",subject.getSubject());
    }
}