package sams.repositories;

import sams.domain.ClassGroup;

public interface ClassGroupRepository
{
    ClassGroup create(ClassGroup ClassGroup);

    ClassGroup read(String ClassGroupId);

    ClassGroup update(ClassGroup ClassGroup);

    void delete(String ClassGroupId);
}
