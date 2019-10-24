package practice.reflection;

public class Admin extends User {
    private String pwd;

    public Admin(String name,Integer age,String pwd) {
        super(name,age);
        this.pwd = pwd;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
