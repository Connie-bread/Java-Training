public class Dog {
    String name;
    int age;
    String favoriteTreat;

    // no "void" below b/c not return smth you defined

    // passing the traits of a dog when creating a new Dog object
    // below is called a constructor
    // static means no instance is created (can't be changed)
    // ex: dog is set to (john, 34, milk) blueprint is fixed (only one value)

    public Dog(String name, int age, String favoriteTreat) {
        // "this" refers to the intial variable defined outside of this method
        // we do this.name b/c (in this, get the name value) (this is how you can use the same variable name)
        this.name = name;
        this.age = age;
        this.favoriteTreat = favoriteTreat;
    }

// void means no return statement needed
    public void begForTreat(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("I want " + favoriteTreat);
        }
    }

}