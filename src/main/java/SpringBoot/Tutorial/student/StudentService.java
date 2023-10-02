package SpringBoot.Tutorial.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public interface StudentService {
    List<Student> findAllStudents();

    Student findByEmail(String email);

    Student save(Student s);

    Student update(Student s);

    void delete(String email);


}
