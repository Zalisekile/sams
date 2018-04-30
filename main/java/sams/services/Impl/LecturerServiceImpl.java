package sams.services.Impl;

import sams.domain.Lecturer;
import sams.repositories.Impl.LecturerRepositoryImpl;
import sams.repositories.LecturerRepository;
import sams.services.LecturerService;

public class LecturerServiceImpl implements LecturerService
{
    private static LecturerServiceImpl service = null;

    LecturerRepository repository = LecturerRepositoryImpl.getInstance();

    public static LecturerServiceImpl getInstance()
    {
        if(service == null)
            service = new LecturerServiceImpl();
        return service;
    }

    public Lecturer create(Lecturer lecturer)
    {
        return repository.create(lecturer);
    }

    public Lecturer read(int lecturerId)
    {
        return repository.read(lecturerId);
    }

    public Lecturer update(Lecturer lecturer) {
        return repository.update(lecturer);
    }

    public void delete(int lecturerId)
    {
        repository.delete(lecturerId);

    }
}
