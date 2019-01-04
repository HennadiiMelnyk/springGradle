package com.ua.melnyk.dao.entityDao.Impl;

import com.ua.melnyk.dao.entityDao.FacultyDao;
import com.ua.melnyk.model.Faculty;
import com.ua.melnyk.model.mapper.FacultyMapper;
import org.springframework.jdbc.core.JdbcTemplate;


import java.sql.SQLException;
import java.util.List;

public class MySqlFacultyDaoImpl implements FacultyDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    @Override
    public void addFaculty(Faculty faculty) {

    }

    @Override
    public void deleteFaculty(int id) {

    }

    @Override
    public void updateFaculty(Faculty faculty) {

    }

    @Override
    public List<Faculty> sortFacultyByAsc(Faculty faculty) {
        return null;
    }

    @Override
    public List<Faculty> sortFacultyByDesc(Faculty faculty) {
        return null;
    }

    @Override
    public boolean create(Object o) throws SQLException {
        return false;
    }

    @Override
    public Object update(int id, Object o) throws SQLException {
        return null;
    }

    @Override
    public Faculty getById(int id) throws SQLException {
        String sql="SELECT * from faculty where id=?";

        return jdbcTemplate.queryForObject(sql,new Integer[]{id},new FacultyMapper());
    }

    @Override
    public boolean delete(int id) throws SQLException {
        return false;
    }
}
