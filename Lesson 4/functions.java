public class  functions {
    public static void main(String args[]) {
        boolean test = true;
        System.out.println(greeting(test));

        Dog myFirstDog = new Dog("John", 89, "takiz");
        // grab a method from myFirstDog which comes from Dog
        // myFirstDog.begForTreat(60);

        RobotState state = RobotState.OUTAKING;
        switch (state) {
            case IDLE:
                System.out.println("affirmmaxing");
                break;
            case OUTAKING:
                System.out.println("sob emoji wilting rose");
                break;
            case INTAKING:
                System.out.println("cooked");
                break;
                // "else" statement below
                // break equals stop the case
            default:
                break;
                
        }
    }

    // ennum = electronic number (represents different options)
    // say, only option is north south east west



    public static String greeting(boolean happy) {
        if (happy) {
            return "Hello, nice to see you!";
        } else {
            return "Oh, it's you again...";
        }
    }

}