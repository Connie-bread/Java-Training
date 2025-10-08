import java.util.Scanner;
public class appleCalc {  
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many apples u want?: ");
        double apples = scanner.nextDouble();
        
        System.out.print("How many oranges u want?: "); // dont put ln so that you type in number of oranges in the same line
        double oranges = scanner.nextDouble();
        
        double applePrice = apples * 0.5;
        double orangePrice = oranges * 0.75;  
        double totalCost = applePrice + orangePrice;
        
        System.out.println("cost of apples: $" + applePrice + " cost of oranges: $" + orangePrice);
        if (apples + oranges > 10) {
            totalCost -= 2;
        }
        System.out.println("total cost: $" + totalCost);
        System.out.println("Have a nice day!");
 
    }
}

// git pull - remember 