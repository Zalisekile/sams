package sams.services;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sams.domain.Lecturer;
import sams.factories.LecturerFactory;
import sams.services.Impl.LecturerServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class LecturerServiceTest
{
    Map values;
    LecturerService lecturerService;

    @Before
    public void setUp() throws Exception
    {
        lecturerService = LecturerServiceImpl.getInstance();
        values = new HashMap();
        values.put("lecturerId",212205548);
        values.put("name","Arinze");
        values.put("surname","Anikwue");
    }

    @Test
    public void create()
    {
        Lecturer lecturer = LecturerFactory.getLecturer(values);
        lecturerService.create(lecturer);
        Assert.assertEquals("Anikwue",lecturer.getSurname());
    }

    @Test
    public void read()
    {
        create();
        Lecturer lecturer = lecturerService.read(212205548);
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
        lecturerService.update(newLecturer);
        Lecturer updatedLecturer = lecturerService.read(212205548);
        Assert.assertEquals("Khabaso",updatedLecturer.getSurname());
    }

    @Test
    public void delete()
    {
        update();
        lecturerService.delete(212205548);
        Lecturer lecturer = lecturerService.read(212205548);
        Assert.assertNull(lecturer);
    }
}