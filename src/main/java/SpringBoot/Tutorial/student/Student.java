package SpringBoot.Tutorial.student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String firstname;
    private String lastname;
    private LocalDate dob;
    private String email;
    private int age;
}
