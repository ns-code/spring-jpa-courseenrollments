
package com.example.studentmanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EnrollmentDTO {
    private Integer enrollmentId;
    private Integer studentId;
    private String studentName;
    private Integer courseId;
    private String courseName;
    private String courseCode;
    private LocalDate enrollmentDate;
    private String grade;
}