package sams.services.Impl;

import sams.domain.ClassGroup;
import sams.repositories.Impl.ClassGroupRepositoryImpl;
import sams.repositories.ClassGroupRepository;
import sams.services.ClassGroupService;

public class ClassGroupServiceImpl implements ClassGroupService
{
    private static ClassGroupServiceImpl service = null;

    ClassGroupRepository repository = ClassGroupRepositoryImpl.getInstance();

    public static ClassGroupServiceImpl getInstance()
    {
        if(service == null)
            service = new ClassGroupServiceImpl();
        return service;
    }

    public ClassGroup create(ClassGroup classGroup)
    {
        return repository.create(classGroup);
    }

    public ClassGroup read(String classGroupId)
    {
        return repository.read(classGroupId);
    }

    public ClassGroup update(ClassGroup classGroup) {
        return repository.update(classGroup);
    }

    public void delete(String classGroupId)
    {
        repository.delete(classGroupId);

    }
}
