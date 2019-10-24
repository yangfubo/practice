package practice.fors;

public class ForLabel {
    public static void main(String[] args){
        // 标签
        label_i:
        for (int i=0;i<5;i++){
            if (i==2){
                break;
            }
            label_j:
            for (int j=0;i<5;j++){
                if (j==2){
                    break;
                }
                for (int k=0;k<5;k++){
                    if (k==2){
                        break label_j; //在第三重循环直接跳出第二重循环
                    }
                    System.out.println("("+i+" "+j+" "+k+")");
                }
            }
        }

        System.out.println(Integer.toString(255,2));

    }
}
