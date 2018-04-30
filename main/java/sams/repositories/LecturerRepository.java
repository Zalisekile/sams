package sams.repositories;

import sams.domain.Lecturer;

public interface LecturerRepository
{
    Lecturer create(Lecturer Lecturer);

    Lecturer read(int LecturerId);

    Lecturer update(Lecturer Lecturer);

    void delete(int LecturerId);
}
