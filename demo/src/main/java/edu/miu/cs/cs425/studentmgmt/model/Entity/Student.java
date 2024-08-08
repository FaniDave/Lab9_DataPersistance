package edu.miu.cs.cs425.studentmgmt.model.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;
    @Column(name = "student_number")
    private String studentNumber;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "middle_name")
    private String middleName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "current_gpa")
    private Double cgpa;
    @Column(name = "date_of_enrollment")
    private LocalDate dateOfEnrollment;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="transcript_id")
    private Transcript transcript;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="student_id")
    private List<ClassRoom> classRooms;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
            @JoinTable(name = "Student_Course",
                    joinColumns = @JoinColumn(name = "student_id"),
                    inverseJoinColumns = @JoinColumn(name = "course_id")
            )
    List<Course> courses;
}
