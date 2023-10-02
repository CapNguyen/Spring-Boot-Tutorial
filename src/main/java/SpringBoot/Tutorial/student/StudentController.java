package SpringBoot.Tutorial.student;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    @Autowired
    private StudentService service;

    @PostMapping
    public Student save(@RequestBody Student s) {
        return service.save(s);
    }
    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable("email") String e){
        //Same as:  public Student findByEmail(@PathVariable String email){
        return service.findByEmail(e);
    }
    @GetMapping
    public List<Student> findAllStudents() {
        return service.findAllStudents();
    }
    @PutMapping
    public Student updateStudent(@RequestBody Student student){
        return service.update(student);
    }
    @DeleteMapping("/{email}")
    public void deleteStudent(@PathVariable String email){
        service.delete(email);
    }
}
