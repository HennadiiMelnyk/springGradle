package com.ua.melnyk.model.mapper;

import com.ua.melnyk.model.Faculty;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;



public class FacultyMapper implements RowMapper<Faculty> {


    @Override
    public Faculty mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Faculty faculty=new Faculty();
        faculty.setId(resultSet.getInt(1));
        faculty.setName(resultSet.getString(2));
        faculty.setBudgetquantity(resultSet.getInt(3));
        faculty.setTotalamount(resultSet.getInt(4));

        return faculty;


    }
}
