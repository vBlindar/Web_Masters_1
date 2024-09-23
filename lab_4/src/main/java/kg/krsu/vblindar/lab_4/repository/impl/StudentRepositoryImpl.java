package kg.krsu.vblindar.lab_4.repository.impl;

import kg.krsu.vblindar.lab_4.domain.Student;
import kg.krsu.vblindar.lab_4.entity.StudentData;
import kg.krsu.vblindar.lab_4.repository.StudentRepository;
import kg.krsu.vblindar.lab_4.repository.jpa.JpaStudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class StudentRepositoryImpl implements StudentRepository {

    private final JpaStudentRepository repository;

    @Override
    public Student save(Student student) {
        return repository.save(StudentData.from(student)).fromThis();
    }

    @Override
    public Student findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Not found")).fromThis();
    }

    @Override
    public void delete(Student student) {
        repository.delete(StudentData.from(student));
    }

    @Override
    public List<Student> findAll() {
        return repository.findAll().stream()
                .map(StudentData::fromThis)
                .collect(Collectors.toList());
    }


}
