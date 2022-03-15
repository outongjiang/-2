package person.otj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/student")
public class StudentController {
    @RequestMapping(value = "/findAll")
    public String findAll(){
        return "studentList";
    }

    @RequestMapping(value = "/add",method ={ RequestMethod.POST,RequestMethod.GET})
    public ModelAndView add(String username, String password){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("studentList");
        modelAndView.addObject("username",username);
        modelAndView.addObject("password",password);
        System.out.println(username);
        System.out.println(password);
        return modelAndView;
    }
    @RequestMapping(value = "/test")
    public String test(String data){
        System.out.println(data);
        return "test";
    }

}
