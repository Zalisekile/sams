package sams.factories;

import sams.domain.Subject;

import java.util.Map;

public class SubjectFactory
{
    public static Subject getSubject(Map values)
    {
        Subject subject = new Subject.Builder()
            .lecturerId((Integer)values.get("lecturerId"))
            .subject((String) values.get("subject"))
            .subjectCode((String) values.get("subjectCode"))
            .build();
        return subject;
    }

}
