package sams.domain;

public class Subject
{
    private int lecturerId;
    private String subjectCode;
    private String subject;

    public int getLecturerId() {
        return lecturerId;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public String getSubject() {
        return subject;
    }

    private Subject() {
    }

    public static class Builder
    {
        private String subjectCode;
        private String subject;
        private int lecturerId;


        public Builder lecturerId(int value)
        {
            this.lecturerId = value;
            return this;
        }

        public Builder subjectCode(String value)
        {
            this.subjectCode = value;
            return this;
        }

        public Builder subject(String value)
        {
            this.subject = value;
            return this;
        }

        public Subject build() {return new Subject(this);}
    }

    private Subject (Builder subjectBuilder)
    {
        this.lecturerId = subjectBuilder.lecturerId;
        this.subjectCode = subjectBuilder.subjectCode;
        this.subject = subjectBuilder.subject;
    }


    @Override
    public boolean equals(Object obj)
    {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;

        Subject subject = (Subject) obj;

        return subjectCode.equals(subject.subjectCode);
    }

    @Override
    public int hashCode() {return subjectCode.hashCode();}

}
