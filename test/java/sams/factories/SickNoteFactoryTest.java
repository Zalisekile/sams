package sams.factories;

import org.junit.Before;
import org.junit.Test;
import sams.domain.SickNote;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class SickNoteFactoryTest
{
    Map values;
    @Before
    public void setUp() throws Exception
    {
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
    public void getSickNote()
    {
        SickNote sicknote =  SickNoteFactory.getSickNote(values);
        assertEquals("IRP3S",sicknote.getSubjectCode());
    }
}