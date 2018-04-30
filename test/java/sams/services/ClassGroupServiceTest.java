package sams.services;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sams.domain.ClassGroup;
import sams.factories.ClassGroupFactory;
import sams.services.Impl.ClassGroupServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class ClassGroupServiceTest {

    Map values;
    ClassGroupService classGroupService;

    @Before
    public void setUp() throws Exception
    {
        classGroupService = ClassGroupServiceImpl.getInstance();
        values = new HashMap();
        values.put("classGroupId",("SoftDev3"));
        values.put("year",3);
    }

    @Test
    public void create()
    {

        ClassGroup classGroup = ClassGroupFactory.getClassGroup(values);
        classGroupService.create(classGroup);
        Assert.assertEquals(3,classGroup.getYear());
    }

    @Test
    public void read()
    {
        create();
        ClassGroup classGroup = classGroupService.read("SoftDev3");
        Assert.assertEquals(3,classGroup.getYear());
    }

    @Test
    public void update()
    {
        read();
        ClassGroup newClassGroup = new ClassGroup.Builder()
                .classGroupId((String) values.get("classGroupId"))
                .year( 4)
                .build();
        classGroupService.update(newClassGroup);
        ClassGroup updatedClasGroup =  classGroupService.read("SoftDev3");
        Assert.assertEquals(4,updatedClasGroup.getYear());
    }

    @Test
    public void delete()
    {
        update();
        classGroupService.delete("SoftDev3");
        ClassGroup classGroup = classGroupService.read("SoftDev3");
        Assert.assertNull(classGroup);
    }
}