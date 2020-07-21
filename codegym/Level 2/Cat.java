public class Cat {

    // instance variables
    String name;
    int age;

    // static variable - belongs to the class
    static int count = 0;

    // Constructor for the Cat class
    // For cats with owners
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // For feral cats
    public Cat() {
        count++;
        this.name = "Street cat No. " + count;
    }

    public void sayMeow() {
        System.out.println("Meow!");
    }

    public void jump() {
        System.out.println("Pounce!");
    }

    // main is static and belongs to the class as a whole, not to individual instances
    public static void main(String[] args){
        // Cat smudge = new Cat();
        // smudge.age = 3;
        // smudge.name = "Smudge";
        Cat smudge = new Cat("Smudge",3);
        count++;

        // Cat fluffy = new Cat();
        // fluffy.age = 5;
        // fluffy.name = "Fluffy";
        Cat fluffy = new Cat("Fluffy", 5);
        count++;

        System.out.println("We created a cat named " + smudge.name + ". His age is " + smudge.age + ".");
        System.out.println("We created a cat named " + fluffy.name + ". His age is " + fluffy.age + ".");

        System.out.println("Total number of cats = " + count);

        smudge.sayMeow();
        smudge.jump();
    }
}