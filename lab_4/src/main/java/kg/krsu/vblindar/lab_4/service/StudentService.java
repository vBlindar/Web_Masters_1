package kg.krsu.vblindar.lab_4.service;


import kg.krsu.vblindar.lab_4.domain.Student;
import kg.krsu.vblindar.lab_4.dto.NewStudentDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    Student create(NewStudentDTO studentDTO);

    Student update(Student student);

    void delete(Long id);

    List<Student> findAll();

    Student findById(Long id);
}
