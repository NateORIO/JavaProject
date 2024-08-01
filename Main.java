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
           
            
            if (point >= 85) {
                System.out.println("U got A in format :"+ (point)+ " = " +(point+ i+1) +" - "+(i + 1));
            } else if (point >= 70) {
                System.out.println("U got B in format :"+ (point)+ " = " +(point+ i+1) +" - "+(i + 1));
            } else if (point >= 60){
                System.out.println("U got C in format :"+ (point)+ " = " +(point+ i+1) +" - "+(i + 1));
            } else if (point >=50){
                System.out.println("U got D in format :"+ (point)+ " = " +(point+ i+1) +" - "+(i + 1));
            } else if (point <=49){
                System.out.println("U got F in format :"+ (point)+ " = " +(point+ i+1) +" - "+(i + 1));
            }
        }

        scanner.close();
    }
}
