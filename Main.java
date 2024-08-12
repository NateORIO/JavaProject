import java.util.Scanner;

/**
 * java
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
         
        for (int i = 0; i < 50; i++ ) {
            System.out.print("point time" + (i + 1) + ": ");
            int point = scanner.nextInt();
            point += i;
            point -= i;
            
            if (point >= 85) {
                System.out.println("U got A ");
            } else if (point >= 70) {
                System.out.println("U got B ");
            } else if (point >= 60){
                System.out.println("U got C ");
            } else if (point >=50){
                System.out.println("U got D ");
            } else if (point <=49){
                System.out.println("U got F ");
            }
        }

        scanner.close();
    }
}
