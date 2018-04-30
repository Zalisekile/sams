package sams.repositories.Impl;

import sams.domain.Subject;
import sams.repositories.SubjectRepository;

import java.util.HashMap;
import java.util.Map;

public class SubjectRepositoryImpl implements SubjectRepository
{
    public static SubjectRepositoryImpl subjectRepository = null;

    private Map<String,Subject> subjectTable;

    private SubjectRepositoryImpl() {subjectTable = new HashMap<String, Subject>();}

    public static SubjectRepositoryImpl getInstance()
    {
        if(subjectRepository == null)
            subjectRepository = new SubjectRepositoryImpl();
        return subjectRepository;
    }

    public Subject create(Subject Subject)
    {
        subjectTable.put(Subject.getSubjectCode(),Subject);
        Subject savedSubject = subjectTable.get(Subject.getSubjectCode());
        return savedSubject;
    }

    public Subject read(String subjectCode)
    {
        Subject subject = subjectTable.get(subjectCode);
        return subject;
    }

    public Subject update(Subject subject)
    {
        subjectTable.put(subject.getSubjectCode(),subject);
        Subject savedSubject = subjectTable.get(subject.getSubjectCode());
        return savedSubject;
    }

    public void delete(String SubjectCode)
    {
        subjectTable.remove(SubjectCode);
    }
}
