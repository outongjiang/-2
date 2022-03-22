package person.otj.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import person.otj.mapper.StudentMapper;
import person.otj.pojo.Student;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentMapper studentMapper;
    public List<Student>findAll(){
        return studentMapper.selectList(null);
    }

    public void deleteById(int id){
        studentMapper.deleteById(id);
    }

    public void updateById(Student student){
        studentMapper.updateById(student);
    }
    public void insert(Student student){
        studentMapper.insert(student);
    }
}
