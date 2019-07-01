package dataAccessObjectPattern;

import java.util.List;

/**
 * @author zhangh
 * @create 2019-07-01
 */
public interface StudentDao {

    public List<Student> getAllStudents();
    public Student getStudent(int rollNo);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);

}
