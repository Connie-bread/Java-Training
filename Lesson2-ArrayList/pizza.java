import java.util.ArrayList;
import java.util.Scanner;
public class pizza {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> Pizzas= new ArrayList<>();

    
        System.out.println("How many pizzas did person 1 eat?: ");
        Pizzas.add(scanner.nextInt());

        System.out.println("How many pizzas did person 2 eat?: ");
        Pizzas.add(scanner.nextInt());

        System.out.println("How many pizzas did person 3 eat?: ");
        Pizzas.add(scanner.nextInt());

        int total = Pizzas.get(0) + Pizzas.get(1) + Pizzas.get(2);

        System.out.println(Pizzas);
        if (total < 10) {
            System.out.println("EAT MORE PIZZA!!!");
        } else if (10 <= total && total <=15) {
            System.out.println("NOT BAD");
        } else {
            System.out.println("WoW");
        }

    }
}