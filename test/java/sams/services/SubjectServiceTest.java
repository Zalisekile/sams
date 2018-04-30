package sams.services;

import org.junit.Before;
import org.junit.Test;
import sams.domain.Subject;
import sams.factories.SubjectFactory;
import sams.services.Impl.SubjectServiceImpl;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class SubjectServiceTest {

    Map values;
    SubjectService subjectService;

    @Before
    public void setUp() throws Exception
    {
        subjectService = SubjectServiceImpl.getInstance();
        values = new HashMap();
        values.put("lecturerId",212205486);
        values.put("subject","Technical Programming");
        values.put("subjectCode","TPG2");

    }

    @Test
    public void create()
    {
        Subject subject = SubjectFactory.getSubject(values);
        subjectService.create(subject);
        assertEquals("Technical Programming",subject.getSubject());
    }

    @Test
    public void read()
    {
        create();
        Subject subject = subjectService.read("TPG2");

    }

    @Test
    public void update()
    {
        read();
        Subject subject = subjectService.read("TPG2");
        Subject newSubject = new Subject.Builder()
                .lecturerId((Integer)values.get("lecturerId"))
                .subject((String) "Technical Programming 2")
                .subjectCode((String) values.get("subjectCode"))
                .build();
        subjectService.update(newSubject);
        Subject updatedSubject = subjectService.read("TPG2");
        assertEquals("Technical Programming 2",updatedSubject.getSubject());

    }

    @Test
    public void delete()
    {
        update();
        subjectService.delete("TPG2");
        Subject subject = subjectService.read("TPG2");
        assertNull(subject);
    }
}