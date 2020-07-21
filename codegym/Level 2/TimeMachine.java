public class TimeMachine {

    // change in value doesn't work for year because primitives are passed by value.
    public void goToFuture(int currentYear) {

        currentYear = currentYear + 10;
    }

    public void goToPast(int CurrentYear) {

        CurrentYear = CurrentYear - 10;
    }

    // it does work for Cats because objects are passed by reference.
    public void goToFuture(Cat cat) {
        // if a new Cat object is created here, then the changes would be applied to it and not the one passed in by reference.
        cat.age += 10;
    }

    public void goToPast(Cat cat) {

        cat.age -= 10;
    }    

    public static void main(String[] args) {

        TimeMachine timemachine = new TimeMachine();
        int currentYear = 2018;

        Cat smudge = new Cat("Smudge",5);

        System.out.println("What year is it?");
        System.out.println(currentYear);

        timemachine.goToPast(currentYear);;
        System.out.println("How about now?");
        System.out.println(currentYear);

        System.out.println("How old was Smudge when the program started?");
        System.out.println(smudge.age);

        timemachine.goToFuture(smudge);;
        System.out.println("How about now?");
        System.out.println(smudge.age);

        System.out.println("Holy smokes! Smudge has aged 10 years! Back up quickly!");
        timemachine.goToPast(smudge);
        System.out.println("Did it work? Have we returned the cat to its original age?");
        System.out.println(smudge.age);
    }
}