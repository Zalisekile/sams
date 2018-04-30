package sams.services;

import sams.domain.ClassGroup;

public interface ClassGroupService
{

    ClassGroup create(ClassGroup classGroup);
    ClassGroup read(String classGroupId);
    ClassGroup update(ClassGroup classGroup);
    void delete (String classGroupId);
}
