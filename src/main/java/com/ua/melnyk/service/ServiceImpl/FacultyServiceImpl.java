package com.ua.melnyk.service.ServiceImpl;

import com.ua.melnyk.dao.entityDao.FacultyDao;
import com.ua.melnyk.model.Faculty;
import com.ua.melnyk.service.FacultyService;

import java.sql.SQLException;

public class FacultyServiceImpl implements FacultyService {

    private FacultyDao facultyDao;

    public void setFacultyDao(FacultyDao facultyDao) {
        this.facultyDao = facultyDao;
    }

    @Override
    public Faculty getById(int id) throws SQLException {
        return (Faculty) facultyDao.getById(id);
    }
}
