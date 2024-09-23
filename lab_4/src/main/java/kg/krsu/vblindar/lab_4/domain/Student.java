package kg.krsu.vblindar.lab_4.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    Long id;
    String name;
    Integer course;
    String group;
    String speciality;
}
