package kg.krsu.vblindar.lab_4.service.impl;

import kg.krsu.vblindar.lab_4.domain.Student;
import kg.krsu.vblindar.lab_4.dto.NewStudentDTO;
import kg.krsu.vblindar.lab_4.entity.StudentData;
import kg.krsu.vblindar.lab_4.repository.StudentRepository;
import kg.krsu.vblindar.lab_4.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository repository;

    @Override
    public Student create(NewStudentDTO studentDTO) {
        Student student = new Student();
        student.setName(studentDTO.getName());
        student.setGroup(studentDTO.getGroup());
        student.setCourse(studentDTO.getCourse());
        student.setSpeciality(studentDTO.getSpeciality());
        return repository.save(student);
    }

    @Override
    public Student update(Student student) {

        Student updated = repository.findById(student.getId());
        if (student.getCourse() != null)
            updated.setCourse(student.getCourse());
        if (student.getName() != null && !student.getName().isEmpty())
            updated.setName(student.getName());
        if (student.getSpeciality() != null && !student.getSpeciality().isEmpty())
            updated.setSpeciality(student.getSpeciality());
        if (student.getGroup() != null && !student.getGroup().isEmpty())
            updated.setGroup(student.getGroup());

        return repository.save(updated);
    }

    @Override
    public void delete(Long id) {
        var student = repository.findById(id);
        repository.delete(student);
    }

    @Override
    public List<Student> findAll() {
        return repository.findAll();
    }

    @Override
    public Student findById(Long id) {
        return repository.findById(id);
    }
}
