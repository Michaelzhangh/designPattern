package dataAccessObjectPattern;

/**
 * @author zhangh
 * @create 2019-07-01
 */
public class DaoPatternDemo {

    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImpl();

        //输出所有的学生
        for (Student student : studentDao.getAllStudents()) {
            System.out.println("Student: [RollNo : "
                    +student.getRollNo()+", Name : "+student.getName()+" ]");
        }


        //更新学生
        Student student =studentDao.getAllStudents().get(0);
        student.setName("Michael");
        studentDao.updateStudent(student);

        //获取学生
        studentDao.getStudent(0);
        System.out.println("Student: [RollNo : "
                +student.getRollNo()+", Name : "+student.getName()+" ]");

        /**
         * 执行结果如下：
         * Student: [RollNo : 0, Name : Robert ]
         * Student: [RollNo : 1, Name : John ]
         * Student: Roll No 0, updated in the database
         * Student: [RollNo : 0, Name : Michael ]
         */
    }
}
