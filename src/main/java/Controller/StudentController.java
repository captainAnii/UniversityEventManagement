package Controller;

import Model.Student;
import Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    @PutMapping("/{studentId}")
    public Student updateStudentDepartment(@PathVariable Long studentId, @RequestBody Student student) {
        Student s = studentRepository.findById(studentId).get();
        s.setDepartment(student.getDepartment());
        return studentRepository.save(s);
    }

    @DeleteMapping("/{studentId}")
    public void deleteStudent(@PathVariable Long studentId) {
        studentRepository.deleteById(studentId);
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @GetMapping("/{studentId}")
    public Student getStudentById(@PathVariable Long studentId) {
        return studentRepository.findById(studentId).get();
    }
}
