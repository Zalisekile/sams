package sams.repositories;

import sams.domain.Subject;

public interface SubjectRepository
{
    Subject create(Subject subject);

    Subject read(String subjectCode);

    Subject update(Subject subject);

    void delete(String subjectCode);
}
