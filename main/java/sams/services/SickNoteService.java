package sams.services;

import sams.domain.SickNote;

public interface SickNoteService
{

    SickNote create(SickNote sickNote);
    SickNote read(int sickNoteId);
    SickNote update(SickNote sickNote);
    void delete (int sickNoteId);
}
