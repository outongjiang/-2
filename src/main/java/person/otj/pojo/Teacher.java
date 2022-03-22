package person.otj.pojo;



import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Objects;


@TableName("teacher")
public class Teacher {
    private int id;
    private String name;
    private String password;
    private Integer sex;
    private String birthday;
    private Integer courseId;
    private String professional;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }


    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }


    public String getProfessional() {
        return professional;
    }

    public void setProfessional(String professional) {
        this.professional = professional;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return id == teacher.id &&
                Objects.equals(name, teacher.name) &&
                Objects.equals(password, teacher.password) &&
                Objects.equals(sex, teacher.sex) &&
                Objects.equals(birthday, teacher.birthday) &&
                Objects.equals(courseId, teacher.courseId) &&
                Objects.equals(professional, teacher.professional);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, password, sex, birthday, courseId, professional);
    }
}
