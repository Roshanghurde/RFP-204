import java.util.Scanner;
public class Day2_11 {
    public static void main(String[] args) {
        int m; 
        int d; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month number:- ");
        m = sc.nextInt();
        System.out.println("Enter Day:- ");
        d = sc.nextInt();

        boolean isSpringSeason = (m == 3 && d >= 20 && d <= 31) || (m == 4 && d >= 1 && d <= 30) || (m == 5 && d >= 1 && d <= 31) || (m == 6 && d >= 1 && d <= 20);
        System.out.println(isSpringSeason);
    }
}
