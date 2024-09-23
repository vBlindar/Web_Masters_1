package kg.krsu.vblindar.lab_4.entity;

import jakarta.persistence.*;
import kg.krsu.vblindar.lab_4.domain.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Integer course;
    @Column(name = "student_group")
    private String group;
    private String speciality;

    public Student fromThis() {
        return new Student(
                id,
                name,
                course,
                group,
                speciality);
    }

    public static StudentData from(Student student){
        return new StudentData(
                student.getId(),
                student.getName(),
                student.getCourse(),
                student.getGroup(),
                student.getSpeciality()
        );
    }
}
