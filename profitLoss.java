import java.util.Scanner;

public class profitLoss {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Cost Price: ");
        int cp = in.nextInt();

        System.out.print("Enter Selling Price: ");
        int sp = in.nextInt();

        if (cp < sp) {
            int profit = sp - cp;
            System.out.println("Profit is: " + (profit * 100.0f) / cp + "%");
        } 
        else if (cp > sp) {
            int loss = cp - sp;
            System.out.println("Loss is: " + (loss * 100.0f) / cp + "%");
        } 
        else {
            System.out.println("No Profit, Not even a Loss");
        }

        in.close();
    }
}
