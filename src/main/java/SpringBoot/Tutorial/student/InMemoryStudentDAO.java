package SpringBoot.Tutorial.student;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryStudentDAO {
    private final List<Student> studentList = new ArrayList<>();

    public List<Student> findAllStudents() {
        return studentList;
    }

    public Student findByEmail(String email) {
        return studentList.stream().filter(s -> email.equals(s.getEmail())).findFirst().orElse(null);
    }

    public Student save(Student s) {
        studentList.add(s);
        return s;
    }

    public Student update(Student s) {
        var studentIndex = IntStream.range(0, studentList.size())
                .filter(i -> studentList.get(i).getEmail().equals(s.getEmail()))
                .findFirst()
                .orElse(-1);
        if (studentIndex > -1) {
            studentList.set(studentIndex, s);
            return s;
        }
        return null;
    }

    public void delete(String email) {
        Student student = findByEmail(email);
        if (student != null) {
            studentList.remove(student);
        }
    }
}
