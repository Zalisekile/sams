package sams.repositories.Impl;

import sams.domain.Lecturer;
import sams.repositories.LecturerRepository;

import java.util.HashMap;
import java.util.Map;

public class LecturerRepositoryImpl implements LecturerRepository
{
    public static LecturerRepositoryImpl lecturerRepository = null;

    private Map<Integer,Lecturer> lecturerTable;

    private LecturerRepositoryImpl() {lecturerTable = new HashMap<Integer, Lecturer>();}

    public static LecturerRepositoryImpl getInstance()
    {
        if(lecturerRepository == null)
            lecturerRepository = new LecturerRepositoryImpl();
        return lecturerRepository;
    }

    public Lecturer create(Lecturer Lecturer)
    {
        lecturerTable.put(Lecturer.getLecturerId(),Lecturer);
        Lecturer savedLecturer = lecturerTable.get(Lecturer.getLecturerId());
        return savedLecturer;
    }

    public Lecturer read(int LecturerId)
    {
        Lecturer lecturer = lecturerTable.get(LecturerId);
        return lecturer;
    }

    public Lecturer update(Lecturer lecturer)
    {
        lecturerTable.put(lecturer.getLecturerId(),lecturer);
        Lecturer savedLecturer = lecturerTable.get(lecturer.getLecturerId());
        return savedLecturer;
    }

    public void delete(int LecturerId)
    {
        lecturerTable.remove(LecturerId);
    }
}
