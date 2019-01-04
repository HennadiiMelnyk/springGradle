package com.ua.melnyk.dao.entityDao;

import com.ua.melnyk.dao.CrudDao;
import com.ua.melnyk.model.Faculty;

import java.util.List;

public interface FacultyDao extends CrudDao {

    public void addFaculty(Faculty faculty);

    public void deleteFaculty(int id);

    public void updateFaculty(Faculty faculty);

    public List<Faculty> sortFacultyByAsc(Faculty faculty);

    public List<Faculty> sortFacultyByDesc(Faculty faculty);
}
