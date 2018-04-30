package sams.services;

import sams.domain.Lecturer;

public interface LecturerService
{

    Lecturer create(Lecturer lecturer);
    Lecturer read(int lectureId);
    Lecturer update(Lecturer lecturer);
    void delete (int lecturerId);
}
