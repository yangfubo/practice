package practice.enums;

public class EnumTest {

    public static void main(String[] args) {
        Week tomorow=Week.getByName("Friday");
        switch (tomorow){
            case Mon:
                System.out.println("doSomthing");
                System.out.println(tomorow.getFullName());
                break;
            case Tue:
                System.out.println("doSomthing");
                System.out.println(tomorow.getFullName());
                break;
            case Thu:
                System.out.println("doSomthing");
                System.out.println(tomorow.getFullName());
                break;
            case Fri:
                System.out.println("doSomthing");
                System.out.println(tomorow.getFullName());
                System.out.println(tomorow.name());
                break;
            default:
                System.out.println("doNothing");

        }
    }
}
