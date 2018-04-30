package sams.services.Impl;

import sams.domain.SickNote;
import sams.repositories.Impl.SickNoteRepositoryImpl;
import sams.repositories.SickNoteRepository;
import sams.services.SickNoteService;

public class SickNoteServiceImpl implements SickNoteService
{
    private static SickNoteServiceImpl service = null;

    SickNoteRepository repository = SickNoteRepositoryImpl.getInstance();

    public static SickNoteServiceImpl getInstance()
    {
        if(service == null)
            service = new SickNoteServiceImpl();
        return service;
    }

    public SickNote create(SickNote sickNote)
    {
        return repository.create(sickNote);
    }

    public SickNote read(int sickNoteId)
    {
        return repository.read(sickNoteId);
    }

    public SickNote update(SickNote sickNote) {
        return repository.update(sickNote);
    }

    public void delete(int sickNoteId)
    {
        repository.delete(sickNoteId);

    }
}
