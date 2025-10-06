import java.util.Scanner;
public class app2 {  // change the name of app2 to the file name, then use javac app2.java
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine(); // Line gets string
        //scanner.nextDouble
        //scanner.nextInt
        //scanner.next etc.
        System.out.println("Hello " + name + "!");
        scanner.close(); // use this to reduce computer resources
    }
}
