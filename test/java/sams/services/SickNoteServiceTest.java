package sams.services;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sams.domain.SickNote;
import sams.factories.SickNoteFactory;
import sams.services.Impl.SickNoteServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class SickNoteServiceTest {

    Map values;
    SickNoteService sickNoteService ;

    @Before
    public void setUp() throws Exception
    {
        sickNoteService = SickNoteServiceImpl.getInstance();
        values = new HashMap();
        values.put("sickNoteId",1);
        values.put("subjectCode","IRP3S");
        values.put("studentNumber",212205587);
        values.put("illness","Cancer");
        values.put("daysOfAbsence",10);
        values.put("lecturerId",212204381);
        values.put("validated",true);

    }

    @Test
    public void create()
    {
        SickNote sickNote = SickNoteFactory.getSickNote(values);
        sickNoteService.create(sickNote);
        Assert.assertEquals("IRP3S",sickNote.getSubjectCode());
    }

    @Test
    public void read()
    {
        create();
        SickNote sickNote = sickNoteService.read(1);
        Assert.assertEquals("IRP3S",sickNote.getSubjectCode());
    }

    @Test
    public void update()
    {
        read();
        SickNote newSickNote = new SickNote.Builder()
                .sickNoteId((Integer) values.get("sickNoteId"))
                .subjectCode((String) values.get("subjectCode"))
                .studentNumber((Integer) values.get("studentNumber"))
                .illness("AIDS")
                .daysOfAbsence((Integer) values.get("daysOfAbsence"))
                .lectureId((Integer) values.get("lecturerId"))
                .validated((Boolean) values.get("validated"))
                .build();
        sickNoteService.update(newSickNote);
        SickNote updatedSickNote = sickNoteService.read(1);
        Assert.assertEquals("AIDS",updatedSickNote.getIllness());
    }

    @Test
    public void delete()
    {
        update();
        sickNoteService.delete(1);
        SickNote sickNote = sickNoteService.read(1);
        Assert.assertNull(sickNote);
    }
}