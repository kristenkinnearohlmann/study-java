public class Jarvis {

    // public void sayHi(String firstGuest) {
    //     System.out.println("Good evening, " + firstGuest + ". How are you?");
    // }

    // public void sayHi(String firstGuest, String secondGuest) {
    //     System.out.println("Good evening, " + firstGuest + " and " + secondGuest + ". How are you?");
    // }

    // String...names indicates a collection of strings will be passed to the method
    public void sayHi(String...names) {

        for (String name: names) {
            System.out.println("Good evening, " + name + ". How are you?");
        }
    }

    public static void main(String[] args) {
        Jarvis jarvis = new Jarvis();
        // jarvis.sayHi("Tony Stark");
        jarvis.sayHi("Tony Stark","Captain America","Black Widow","Hulk");
    }
}