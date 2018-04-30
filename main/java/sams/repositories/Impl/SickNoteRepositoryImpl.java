package sams.repositories.Impl;

import sams.domain.SickNote;
import sams.repositories.SickNoteRepository;

import java.util.HashMap;
import java.util.Map;

public class SickNoteRepositoryImpl implements SickNoteRepository
{
    public static SickNoteRepositoryImpl sickNoteRepository = null;

    private Map<Integer,SickNote> sickNoteTable;

    private SickNoteRepositoryImpl() {sickNoteTable = new HashMap<Integer, SickNote>();}

    public static SickNoteRepositoryImpl getInstance()
    {
        if(sickNoteRepository == null)
            sickNoteRepository = new SickNoteRepositoryImpl();
        return sickNoteRepository;
    }

    public SickNote create(SickNote SickNote)
    {
        sickNoteTable.put(SickNote.getSickNoteId(),SickNote);
        SickNote savedSickNote = sickNoteTable.get(SickNote.getSickNoteId());
        return savedSickNote;
    }

    public SickNote read(int SickNoteId)
    {
        SickNote sickNote = sickNoteTable.get(SickNoteId);
        return sickNote;
    }

    public SickNote update(SickNote sickNote)
    {
        sickNoteTable.put(sickNote.getSickNoteId(),sickNote);
        SickNote savedSickNote = sickNoteTable.get(sickNote.getSickNoteId());
        return savedSickNote;
    }

    public void delete(int SickNoteId)
    {
        sickNoteTable.remove(SickNoteId);
    }
}
