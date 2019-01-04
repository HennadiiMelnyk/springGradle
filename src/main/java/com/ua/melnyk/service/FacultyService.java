package com.ua.melnyk.service;

import com.ua.melnyk.model.Faculty;

import java.sql.SQLException;

public interface FacultyService {

    Faculty getById(int id) throws SQLException;
}
