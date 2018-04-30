package sams.services.Impl;

import sams.domain.Subject;
import sams.repositories.Impl.SubjectRepositoryImpl;
import sams.repositories.SubjectRepository;
import sams.services.SubjectService;

public class SubjectServiceImpl implements SubjectService
{
    private static SubjectServiceImpl service = null;

    SubjectRepository repository = SubjectRepositoryImpl.getInstance();

    public static SubjectServiceImpl getInstance()
    {
        if(service == null)
            service = new SubjectServiceImpl();
        return service;
    }

    public Subject create(Subject subject)
    {
        return repository.create(subject);
    }

    public Subject read(String subjectCode)
    {
        return repository.read(subjectCode);
    }

    public Subject update(Subject subject) {
        return repository.update(subject);
    }

    public void delete(String subjectCode)
    {
        repository.delete(subjectCode);

    }
}
