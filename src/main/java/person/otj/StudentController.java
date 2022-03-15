package person.otj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class StudentController {
    @RequestMapping("/student/findAll")
    public String findAll(){
        return "studentList";
    }
}
