package sams.repositories;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sams.domain.Lecturer;
import sams.factories.LecturerFactory;
import sams.repositories.Impl.LecturerRepositoryImpl;

import java.util.HashMap;
import java.util.Map;

public class LecturerRepositoryTest
{
    Map values;
    LecturerRepository lecturerRepository;

    @Before
    public void setUp() throws Exception
    {
        lecturerRepository = LecturerRepositoryImpl.getInstance();
        values = new HashMap();
        values.put("lecturerId",212205548);
        values.put("name","Arinze");
        values.put("surname","Anikwue");
    }

    @Test
    public void create()
    {
        Lecturer lecturer = LecturerFactory.getLecturer(values);
        lecturerRepository.create(lecturer);
        Assert.assertEquals("Anikwue",lecturer.getSurname());
    }

    @Test
    public void read()
    {
        create();
        Lecturer lecturer = lecturerRepository.read(212205548);
        Assert.assertEquals("Anikwue",lecturer.getSurname());
    }

    @Test
    public void update()
    {
        read();
        Lecturer newLecturer = new Lecturer.Builder()
                .lecturerId((Integer) values.get("lecturerId"))
                .name("Boniface")
                .surname("Khabaso")
                .build();
        lecturerRepository.update(newLecturer);
        Lecturer updatedLecturer = lecturerRepository.read(212205548);
        Assert.assertEquals("Khabaso",updatedLecturer.getSurname());
    }

    @Test
    public void delete()
    {
        update();
        lecturerRepository.delete(212205548);
        Lecturer lecturer = lecturerRepository.read(212205548);
        Assert.assertNull(lecturer);
    }
}