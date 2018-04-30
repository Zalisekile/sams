package sams.repositories;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sams.domain.SickNote;
import sams.factories.SickNoteFactory;
import sams.repositories.Impl.SickNoteRepositoryImpl;

import java.util.HashMap;
import java.util.Map;

public class SickNoteRepositoryTest {
    Map values;
    SickNoteRepository sickNoteRepository ;

    @Before
    public void setUp() throws Exception
    {
        sickNoteRepository = SickNoteRepositoryImpl.getInstance();
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
        sickNoteRepository.create(sickNote);
        Assert.assertEquals("IRP3S",sickNote.getSubjectCode());
    }

    @Test
    public void read()
    {
        create();
        SickNote sickNote = sickNoteRepository.read(1);
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
        sickNoteRepository.update(newSickNote);
        SickNote updatedSickNote = sickNoteRepository.read(1);
        Assert.assertEquals("AIDS",updatedSickNote.getIllness());
    }

    @Test
    public void delete()
    {
        update();
        sickNoteRepository.delete(1);
        SickNote sickNote = sickNoteRepository.read(1);
        Assert.assertNull(sickNote);
    }
}