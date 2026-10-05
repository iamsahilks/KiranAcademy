import java.util.Scanner;

public class voting {
        static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();

        if(num>0 && num<100){
            if(num>18){
                System.out.println("Eligible for voting");
            }else{
                System.out.println("Not eligible for voting");
            }
        }

    }
}
