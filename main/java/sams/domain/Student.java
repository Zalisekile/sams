package sams.domain;

import java.math.BigInteger;

public class Student
{
    private int studentId;
    private String name;
    private String surname;
    private String email;
    private String course;
    private String phoneNumber;
    private String password;
    private boolean verified;

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getCourse() {
        return course;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public boolean isVerified() {
        return verified;
    }

    private Student() {
    }

    private Student(Builder studentBuilder)
    {
        this.studentId = studentBuilder.studentId;
        this.name = studentBuilder.name;
        this.surname = studentBuilder.surname;
        this.email = studentBuilder.email;
        this.course = studentBuilder.course;
        this.phoneNumber = studentBuilder.phoneNumber;
        this.password = studentBuilder.password;
        this.verified = studentBuilder.verified;
    }

    public static class Builder {
        private int studentId;
        private String name;
        private String surname;
        private String email;
        private String course;
        private String phoneNumber;
        private String password;
        private boolean verified;


        public Builder studentId(int studentId) {
            this.studentId = studentId;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder course(String course) {
            this.course = course;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder verified(boolean verified) {
            this.verified = verified;
            return this;
        }

        public Student build() {return new Student(this);}
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Student student = (Student) obj;

        return studentId == student.studentId;
    }

    @Override
    public int hashCode()
    {
        return studentId;
    }

}
