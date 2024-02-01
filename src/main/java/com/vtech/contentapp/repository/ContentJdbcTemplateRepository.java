package com.vtech.contentapp.repository;

import com.vtech.contentcalendar.model.Content;
import com.vtech.contentcalendar.model.Status;
import com.vtech.contentcalendar.model.Type;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ContentJdbcTemplateRepository {

    private  final JdbcTemplate jdbcTemplate;

    public ContentJdbcTemplateRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate= jdbcTemplate;
    }

    public static Content mapRow(ResultSet rs,int rowNum) throws SQLException{
        return  new Content(rs.getInt("id"),
                rs.getString("title"),
                rs.getString("desc"),
                Status.valueOf(rs.getString("status")),
                Type.valueOf(rs.getString("content_type")),
                rs.getTimestamp("date_created").toLocalDateTime(),
                rs.getTimestamp("date_updated").toLocalDateTime(),
                rs.getString("url")
        );
    }

    public List<Content> getAllContent() {
        String sql ="SELECT * FROM Content";
        List<Content> contents =jdbcTemplate.query(sql, ContentJdbcTemplateRepository::mapRow);
        return contents;
    }







}
