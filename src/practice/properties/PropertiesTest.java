package practice.properties;

public class PropertiesTest {

    public static void  main(String[] args){
        User user=new User();
        user.setAge(18);
        user.setName("yangfubo");
        user.setPhone("123456789");
        UserVO userVo =new UserVO();
        FieldsCopyUtil.copy(user,userVo, "practice/properties/UserToUserVO.properties");
        System.out.println(userVo.toString());
    }
}
