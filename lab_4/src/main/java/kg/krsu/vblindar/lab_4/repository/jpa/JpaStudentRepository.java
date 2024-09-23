package kg.krsu.vblindar.lab_4.repository.jpa;

import kg.krsu.vblindar.lab_4.entity.StudentData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaStudentRepository extends JpaRepository<StudentData,Long> {

}
