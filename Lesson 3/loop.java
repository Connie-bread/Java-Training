public class loop {
    public static void main(String[] args) {
        int numberToGuess = 7;
        int userGuess; // creates variable, no value assigned
        // while = inf, for = finite
        // i only exists in for loop below
        // userGuess++; increases by one
        // runs 3 times
        // think - 0 loop, 1 loop, 2 loop below
        // use less than sign to (in this example) run three times
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);

        }
        int [] numbers = {1, 2, 3, 4, 5};
        // ternary statement
        // condesned if statement 
        // == equals comparison
        // the statement below means if numbers[0] is equal to 1, then sum = 10, else sum = 0
        int sum = numbers[0] == 1 ? 10 : 0;
        System.out.println(sum);


        //for (int i = 1; i < numbers.length; i++) {
          //  sum += numebrfwewfwe
        //}



        int total = 0;
        for (int number : numbers) {
            total += number; // total = total + number
        }
    
       // while (userGuess != numberToguess) {
        //    System.out.println("Hello,")
        //    userGuess = 5;
       // }
    }

}