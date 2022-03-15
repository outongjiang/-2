package person.otj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping(value = "/add")
    public String add(){
        return "studentAdd";
    }

    @RequestMapping(value = "/findAll",method ={ RequestMethod.POST,RequestMethod.GET})
    public ModelAndView findAll(String username, String password){
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
