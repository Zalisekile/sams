package sams.factories;

import sams.domain.Student;

import java.util.Map;

public class StudentFactory
{

    public static Student getStudent(Map values)
    {

            Student student = new Student.Builder()
                    .studentId((Integer) values.get("studentId"))
                    .name((String) values.get("name"))
                    .surname((String) values.get("surname"))
                    .email((String) values.get("email"))
                    .course((String) values.get("course"))
                    .phoneNumber((String) values.get("phoneNumber"))
                    .password((String) values.get("password"))
                    .verified((Boolean) values.get("verified"))
                    .build();
            return student;
    }
}
