package practice.enums;

public enum Week {
    //默认index从0开始
    Mon("Monday"), Tue("Tuesday"), Wed("Wednesday"), Thu("Thursday"), Fri( "Friday"), Sat("Saturday"), Sun("Sunday");

    private final String fullName;

     Week(String name){
        this.fullName=name;
    }

    public static Week getByName(String fullname){
        for (Week week:Week.values()){
            if (week.getFullName().equals(fullname)){
                return week;
            }
        }
        return null;
    }

    public String getFullName(){
        return this.fullName;
    }

}

