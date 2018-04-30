package sams.repositories;

import sams.domain.SickNote;

public interface SickNoteRepository
{
    SickNote create(SickNote SickNote);

    SickNote read(int SickNoteId);

    SickNote update(SickNote SickNote);

    void delete(int SickNoteId);
    
}
