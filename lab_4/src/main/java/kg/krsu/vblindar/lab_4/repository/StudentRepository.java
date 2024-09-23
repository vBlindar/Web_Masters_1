package kg.krsu.vblindar.lab_4.repository;

import kg.krsu.vblindar.lab_4.domain.Student;
import kg.krsu.vblindar.lab_4.entity.StudentData;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository {
    Student save(Student student);

    Student findById(Long id);

    void delete(Student student);

    List<Student> findAll();
}
