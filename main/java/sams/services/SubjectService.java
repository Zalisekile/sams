package sams.services;

import sams.domain.Subject;

public interface SubjectService
{
    Subject create(Subject person);
    Subject read(String subjectCode);
    Subject update(Subject person);
    void delete (String subjectCode);
}
