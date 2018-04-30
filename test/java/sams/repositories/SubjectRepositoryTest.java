package sams.repositories;

import org.junit.Before;
import org.junit.Test;
import sams.domain.Subject;
import sams.factories.SubjectFactory;
import sams.repositories.Impl.SubjectRepositoryImpl;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


public class SubjectRepositoryTest {
    Map values;
    SubjectRepository subjectRepository;

    @Before
    public void setUp() throws Exception
    {
        subjectRepository = SubjectRepositoryImpl.getInstance();
        values = new HashMap();
        values.put("lecturerId",212205486);
        values.put("subject","Technical Programming");
        values.put("subjectCode","TPG2");

    }

    @Test
    public void create()
    {
        Subject subject = SubjectFactory.getSubject(values);
        subjectRepository.create(subject);
        assertEquals("Technical Programming",subject.getSubject());
    }

    @Test
    public void read()
    {
        create();
        Subject subject = subjectRepository.read("TPG2");

    }

    @Test
    public void update()
    {
        read();
        Subject subject = subjectRepository.read("TPG2");
        Subject newSubject = new Subject.Builder()
                .lecturerId((Integer)values.get("lecturerId"))
                .subject((String) "Technical Programming 2")
                .subjectCode((String) values.get("subjectCode"))
                .build();
        subjectRepository.update(newSubject);
        Subject updatedSubject = subjectRepository.read("TPG2");
        assertEquals("Technical Programming 2",updatedSubject.getSubject());

    }

    @Test
    public void delete()
    {
        update();
        subjectRepository.delete("TPG2");
        Subject subject = subjectRepository.read("TPG2");
        assertNull(subject);
    }
}