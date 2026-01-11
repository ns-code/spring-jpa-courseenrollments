package com.example.studentmanagement.repository;

import com.example.studentmanagement.entity.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Integer> {
    List<Enrollment> findByStudent_StudentId(Integer studentId);
    List<Enrollment> findByCourse_CourseId(Integer courseId);
    Optional<Enrollment> findByStudent_StudentIdAndCourse_CourseId(Integer studentId, Integer courseId);
}
