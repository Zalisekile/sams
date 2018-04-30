package sams.domain;

import java.io.Serializable;

public class SickNote implements Serializable
{
    private int sickNoteId;
    private String subjectCode;
    private int studentNumber;
    private String illness;
    private int daysOfAbsence;
    private int lecturerId;
    private boolean validated;

    public int getSickNoteId() {
        return sickNoteId;
    }

    public String getSubjectCode()
    {
        return subjectCode;
    }

    public int StudentNumber()
    {
        return studentNumber;
    }

    public String getIllness() {
        return illness;
    }

    public int getDaysOfAbsence() {
        return daysOfAbsence;
    }

    public int getLecturerId() {
        return lecturerId;
    }

    public boolean isValidated() {
        return validated;
    }



    private SickNote() {
    }

    public static class Builder
    {
        private int sickNoteId;
        private String subjectCode;
        private int studentNumber;
        private String illness;
        private int daysOfAbsence;
        private int lecturerId;
        private boolean validated;


        public Builder sickNoteId(int value)
        {
            this.sickNoteId  = value;
            return this;
        }

        public Builder subjectCode(String value)
        {
            this.subjectCode = value;
            return this;
        }

        public Builder studentNumber(int value)
        {
            this.studentNumber = value;
            return this;
        }

        public Builder illness(String value)
        {
            this.illness = value;
            return this;
        }

        public Builder daysOfAbsence(int value)
        {
            this.daysOfAbsence = value;
            return this;
        }

        public Builder lectureId(int value)
        {
            this.lecturerId = value;
            return this;
        }
        public Builder validated(boolean value)
        {
            this.validated = value;
            return this;
        }

        public SickNote build() {return new SickNote(this);}
    }

   private SickNote (Builder sickNoteBuilder)
    {
        this.sickNoteId = sickNoteBuilder.sickNoteId;
        this.subjectCode = sickNoteBuilder.subjectCode;
        this.studentNumber = sickNoteBuilder.studentNumber;
        this.illness = sickNoteBuilder.illness;
        this.daysOfAbsence = sickNoteBuilder.daysOfAbsence;
        this.lecturerId = sickNoteBuilder.lecturerId;
        this.validated = sickNoteBuilder.validated;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;

        SickNote sickNote = (SickNote) obj;

        return sickNoteId == sickNote.sickNoteId;
    }

    @Override
    public int hashCode() {return sickNoteId;}


}
