package sams.factories;

import sams.domain.SickNote;

import java.util.Map;

public class SickNoteFactory
{
    public static SickNote getSickNote(Map values)
    {
        SickNote sickNote = new SickNote.Builder()
                .sickNoteId((Integer) values.get("sickNoteId"))
                .subjectCode((String) values.get("subjectCode"))
                .studentNumber((Integer) values.get("studentNumber"))
                .illness((String) values.get("illness"))
                .daysOfAbsence((Integer) values.get("daysOfAbsence"))
                .lectureId((Integer) values.get("lecturerId"))
                .validated((Boolean) values.get("validated"))
                .build();
        return sickNote;

    }
}
