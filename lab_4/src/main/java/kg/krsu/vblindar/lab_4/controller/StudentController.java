package kg.krsu.vblindar.lab_4.controller;


import kg.krsu.vblindar.lab_4.domain.Student;
import kg.krsu.vblindar.lab_4.dto.NewStudentDTO;
import kg.krsu.vblindar.lab_4.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @GetMapping("/student-form")
    public String showForm() {
        return "studentForm";
    }

    @GetMapping("/{id}")
    public String findById(@PathVariable Long id, Model model){
        var student = studentService.findById(id);
        model.addAttribute("student",student);
        return "studentInfo";
    }

    @PostMapping
    public String addStudent(@ModelAttribute NewStudentDTO studentDTO) {
        var student = studentService.create(studentDTO);
        return "redirect:/student/" + student.getId();
    }

    @PutMapping
    public String updateStudent(@ModelAttribute Student student, Model model){
        var updated = studentService.update(student);
        model.addAttribute("student",updated);
        return "studentInfo";
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id, Model model){
        studentService.delete(id);
        var students = studentService.findAll();
        model.addAttribute("students",students);
        return "redirect:/student";
    }

    @GetMapping
    public String allStudents(Model model){
        var students = studentService.findAll();
        model.addAttribute("students",students);
        return "students";
    }

}