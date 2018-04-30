package sams.factories;

import sams.domain.Lecturer;

import java.util.Map;

public class LecturerFactory {
    public static Lecturer getLecturer(Map values)
    {
        Lecturer lecturer = new Lecturer.Builder()
                .lecturerId((Integer) values.get("lecturerId"))
                .name((String) values.get("name"))
                .surname((String) values.get("surname"))
                .build();
        return lecturer;
    }
}
