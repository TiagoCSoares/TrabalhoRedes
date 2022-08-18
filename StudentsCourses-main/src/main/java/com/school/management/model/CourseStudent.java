package com.school.management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class CourseStudent {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private Long idStudent;

        private Long idCourse;

        private Timestamp createdAt;

        public CourseStudent(Long id, Long idStudent, Long idCourse) {
            this.id = id;
            this.idStudent = idStudent;
            this.idCourse = idCourse;
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
