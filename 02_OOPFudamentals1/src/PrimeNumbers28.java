import java.util.*;

public class PrimeNumbers28 {
    void num(int num) {
        int count;
        for (int i = 1; i < num; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    count++;
            }
            if (count == 2)
                System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = sc.nextInt(); 
        sc.close();
        PrimeNumbers28 obj = new PrimeNumbers28();
        obj.num(num);
    }

}