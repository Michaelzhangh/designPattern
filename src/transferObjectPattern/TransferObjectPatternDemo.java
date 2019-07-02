package transferObjectPattern;

/**
 * @author zhangh
 * @create 2019-07-02
 */
public class TransferObjectPatternDemo {

    public static void main(String[] args) {
        StudentBO studentBusinessObject = new StudentBO();

        //输出所有的学生
        for (StudentVO student : studentBusinessObject.getAllStudents()) {
            System.out.println("Student: [RollNo : "
                    +student.getRollNo()+", Name : "+student.getName()+" ]");
        }

        //更新学生
        StudentVO student =studentBusinessObject.getAllStudents().get(0);
        student.setName("Michael");
        studentBusinessObject.updateStudent(student);

        //获取学生
        studentBusinessObject.getStudent(0);
        System.out.println("Student: [RollNo : "
                +student.getRollNo()+", Name : "+student.getName()+" ]");

        /**
         * 执行结果如下：
         * Student: [RollNo : 0, Name : Robert ]
         * Student: [RollNo : 1, Name : John ]
         * Student: Roll No 0, updated in the database
         * Student: [RollNo : 0, Name : Michael ]         *
         */
    }
}
