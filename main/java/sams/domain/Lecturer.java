package sams.domain;

import java.io.Serializable;

public class Lecturer implements Serializable
{
    private int lecturerId;
    private String name;
    private String surname;

    public int getLecturerId() {
        return lecturerId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    private Lecturer() {
    }

    public static class Builder {
        private int lecturerId;
        private String name;
        private String surname;

        public Builder lecturerId(int value) {
            this.lecturerId = value;
            return this;
        }

        public Builder name(String value) {
            this.name = value;
            return this;
        }

        public Builder surname(String value) {
            this.surname = value;
            return this;
        }

        public Lecturer build() {return new Lecturer(this);}
    }

    private Lecturer(Builder lecturerBuilder) {
        this.lecturerId = lecturerBuilder.lecturerId;
        this.name = lecturerBuilder.name;
        this.surname = lecturerBuilder.surname;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Lecturer lecturer = (Lecturer) obj;

        return lecturerId == lecturer.lecturerId;
    }

    @Override
    public int hashCode()
    {
        return lecturerId;
    }
}