package person.otj.pojo;


import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Objects;

@TableName("score")
public class Score {
    private int id;
    private Integer studentId;
    private Integer courseId;
    private Double score;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }


    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Score score1 = (Score) o;
        return id == score1.id &&
                Objects.equals(studentId, score1.studentId) &&
                Objects.equals(courseId, score1.courseId) &&
                Objects.equals(score, score1.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, studentId, courseId, score);
    }
}
