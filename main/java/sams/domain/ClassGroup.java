package sams.domain;

public class ClassGroup
{
   private String classGroupId;
   private int year;

    public String getClassGroupId() {
        return classGroupId;
    }

    public int getYear() {
        return year;
    }

    private ClassGroup() {
    }

    public static class Builder
   {
       private String classGroupId;
       private int year;

       public Builder classGroupId(String value)
       {
            this.classGroupId = value;
            return this;
       }

       public Builder year(int value)
       {
           this.year = value;
           return this;
       }

       public ClassGroup build() {return new ClassGroup(this);}

   }

   private ClassGroup (Builder classGroupBuilder)
    {
        this.classGroupId = classGroupBuilder.classGroupId;
        this.year =classGroupBuilder.year;

    }


    @Override
    public boolean equals(Object obj)
    {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;

        ClassGroup classGroup = (ClassGroup) obj;

        return classGroupId.equals(classGroup.classGroupId);
    }

    @Override
    public int hashCode() {return classGroupId.hashCode();}

}
