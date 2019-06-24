package filterPattern;

/**
 * @author zhangh
 * @create 2019-06-24
 */
public class Person {
    //姓名
    private String name;
    //性别
    private String gender;
    //婚姻状态
    private String maritalStatus;


    public Person(String name,String gender,String maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
}
