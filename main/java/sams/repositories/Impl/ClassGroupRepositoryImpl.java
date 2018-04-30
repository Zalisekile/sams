package sams.repositories.Impl;

import sams.domain.ClassGroup;
import sams.repositories.ClassGroupRepository;

import java.util.HashMap;
import java.util.Map;

public class ClassGroupRepositoryImpl implements ClassGroupRepository
{
    public static ClassGroupRepositoryImpl classGroupRepository = null;

    private Map<String,ClassGroup> classGroupTable;

    private ClassGroupRepositoryImpl() {classGroupTable = new HashMap<String, ClassGroup>();}

    public static ClassGroupRepositoryImpl getInstance()
    {
        if(classGroupRepository == null)
            classGroupRepository = new ClassGroupRepositoryImpl();
        return classGroupRepository;
    }

    public ClassGroup create(ClassGroup ClassGroup)
    {
        classGroupTable.put(ClassGroup.getClassGroupId(),ClassGroup);
        ClassGroup savedClassGroup = classGroupTable.get(ClassGroup.getClassGroupId());
        return savedClassGroup;
    }

    public ClassGroup read(String ClassGroupId)
    {
        ClassGroup classGroup = classGroupTable.get(ClassGroupId);
        return classGroup;
    }

    public ClassGroup update(ClassGroup classGroup)
    {
        classGroupTable.put(classGroup.getClassGroupId(),classGroup);
        ClassGroup savedClassGroup = classGroupTable.get(classGroup.getClassGroupId());
        return savedClassGroup;
    }

    public void delete(String ClassGroupId)
    {
        classGroupTable.remove(ClassGroupId);
    }
}
