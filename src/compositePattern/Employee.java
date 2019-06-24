package compositePattern;

import java.io.PipedReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangh
 * @create 2019-06-24
 */
public class Employee {

    private String name;
    private String dept;
    private int salary;

    private List<Employee> subordinates;

    public Employee(String name,String dept,int salary){
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subordinates = new ArrayList<>();
    }

    public void add(Employee e){
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    @Override
    public String toString() {
        return ("Employee :[ Name : "+ name
                +", dept : "+ dept + ", salary :"
                + salary+" ]");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(List<Employee> subordinates) {
        this.subordinates = subordinates;
    }
}
