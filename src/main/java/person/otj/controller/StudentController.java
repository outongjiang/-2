package person.otj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
    @RequestMapping("/findAll")
    public String findAll(){
        return "studentList";
    }

    @RequestMapping("/add")
    public String add(){
        return "studentAdd";
    }
}
