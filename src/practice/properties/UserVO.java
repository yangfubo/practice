package practice.properties;

public class UserVO {
    String userName;
    String mobileNo;
    Integer age;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "UserVO{" +
                "userName='" + userName + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", age=" + age +
                '}';
    }
}
