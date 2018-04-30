package sams.factories;

import org.junit.Before;
import org.junit.Test;
import sams.domain.ClassGroup;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ClassGroupFactoryTest
{
    Map values;
    @Before
    public void setUp() throws Exception
    {
        values = new HashMap();
        values.put("classGroupId",("SoftDev3"));
        values.put("year",3);
    }

    @Test
    public void getClassGroup()
    {
        ClassGroup classGroup = ClassGroupFactory.getClassGroup(values);
        assertEquals(3,classGroup.getYear());
    }
}