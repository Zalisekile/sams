package sams.factories;

import sams.domain.ClassGroup;

import java.util.Map;

public class ClassGroupFactory
{
    public static ClassGroup getClassGroup(Map values)
    {
        ClassGroup classGroup = new ClassGroup.Builder()
                .classGroupId((String) values.get("classGroupId"))
                .year((Integer) values.get("year"))
                .build();
        return classGroup;
    }
}
