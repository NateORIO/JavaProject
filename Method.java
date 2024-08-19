import java.util.Scanner;

/**
 * Method
 */
public class Method {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] member = {"Silver", "Gold", "Platinum"};

        System.out.println("Select type:");
        for (int i = 0; i < member.length; i++) {
            System.out.println((i) + ": " + member[i]);
        }

        System.out.print("number of your type: ");
        int choice = scanner.nextInt();
       // System.out.println(member[choice]);
       System.out.println("how much ur price");
        int priceall = scanner.nextInt();
        scanner.close();
        
        int discountP = mathdis(choice, priceall);
        System.out.println("Discount: " + discountP + " for " + member[choice]);
    }


    public static int mathdis(int choice, int priceall){
        int i;
        if (choice == 2){
            i = (int)(priceall *0.05);
            priceall -= i ;
                
        }

        if (choice == 1) {
            if (priceall >= 1000) {
                i = (int)(priceall *0.03);
                priceall -= i ;
            }
            
        }
        if (choice == 0) {
            if (priceall >=1000) {
                i = (int)(priceall *0.02);
                priceall -= i ;
                
            }
            
        }return priceall;
    }

 
    }
