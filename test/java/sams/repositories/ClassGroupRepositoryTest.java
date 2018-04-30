package sams.repositories;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sams.domain.ClassGroup;
import sams.factories.ClassGroupFactory;
import sams.repositories.Impl.ClassGroupRepositoryImpl;

import java.util.HashMap;
import java.util.Map;

public class ClassGroupRepositoryTest
{
    Map values;
    ClassGroupRepository classGroupRepository;

    @Before
    public void setUp() throws Exception
    {
        classGroupRepository = ClassGroupRepositoryImpl.getInstance();
        values = new HashMap();
        values.put("classGroupId",("SoftDev3"));
        values.put("year",3);
    }

    @Test
    public void create()
    {

       ClassGroup classGroup = ClassGroupFactory.getClassGroup(values);
       classGroupRepository.create(classGroup);
        Assert.assertEquals(3,classGroup.getYear());
    }

    @Test
    public void read()
    {
        create();
        ClassGroup classGroup = classGroupRepository.read("SoftDev3");
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
        classGroupRepository.update(newClassGroup);
        ClassGroup updatedClasGroup =  classGroupRepository.read("SoftDev3");
        Assert.assertEquals(4,updatedClasGroup.getYear());
    }

    @Test
    public void delete()
    {
        update();
        classGroupRepository.delete("SoftDev3");
        ClassGroup classGroup = classGroupRepository.read("SoftDev3");
        Assert.assertNull(classGroup);
    }
}