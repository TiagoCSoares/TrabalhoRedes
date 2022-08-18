package com.school.management.model.dto;

import java.sql.Timestamp;
import java.time.Instant;

public class CourseStudentDto {

    private Long id;

    private Long idStudent;

    private Long idCourse;

    private Timestamp createdAt;

    public CourseStudentDto() {

    }

    public CourseStudentDto(Long idStudent, Long idCourse) {
        Timestamp ts = Timestamp.from(Instant.now());
        this.id = 0L;
        this.idStudent = idStudent;
        this.idCourse = idCourse;
        this.createdAt = ts;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(Long idStudent) {
        this.idStudent = idStudent;
    }

    public Long getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(Long idCourse) {
        this.idCourse = idCourse;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
}
