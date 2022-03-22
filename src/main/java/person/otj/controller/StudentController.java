package person.otj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import person.otj.pojo.Student;
import person.otj.service.StudentService;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.net.HttpCookie;
import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;
    @RequestMapping(value = "/add.do",method ={ RequestMethod.POST,RequestMethod.GET})
    public String add(Student student){
        studentService.insert(student);
        return "index";
    }

    @RequestMapping(value = "/add",method ={ RequestMethod.POST,RequestMethod.GET})
    public String add(){
        return "add";
    }

    @RequestMapping(value = "/findAll",method ={ RequestMethod.POST,RequestMethod.GET})
    public ModelAndView findAll(ModelAndView modelAndView){
        modelAndView.setViewName("studentList");
        modelAndView.addObject("students",studentService.findAll());
        System.out.println(studentService.findAll());
        System.out.println("进来了");
        return modelAndView;
    }

    @RequestMapping(value = "/goto",method ={ RequestMethod.POST,RequestMethod.GET})
    public String _goto(String page){
        return page;
    }

    @RequestMapping(value = "/testCookie",method = {RequestMethod.POST,RequestMethod.GET})
    public ModelAndView testCookie(ModelAndView modelAndView,HttpServletResponse response,HttpServletRequest httpServletRequest){
        Cookie cookie=new Cookie("name","令狐冲");
        response.addCookie(cookie);
        httpServletRequest.setAttribute("req","value");
        HttpSession session =httpServletRequest.getSession();
        session.setAttribute("age",20);
        modelAndView.setViewName("testCookie");
        return modelAndView;
    }

}
