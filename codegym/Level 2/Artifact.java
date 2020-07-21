public class Artifact {

    int serialNbr;
    String culture;
    int century;

    public Artifact(int serialNbr) {
        this.serialNbr = serialNbr;
    }

    public Artifact(int serialNbr, String culture) {
        this.serialNbr = serialNbr;
        this.culture = culture;
    }

    public Artifact(int serialNbr, String culture, int century) {
        this.serialNbr = serialNbr;
        this.culture = culture;
        this.century = century;
    }

    public static void main(String args[]){
        Artifact art1 = new Artifact(123456);
        Artifact art2 = new Artifact(456789, "Mayan");
        Artifact art3 = new Artifact(789123, "Hopi", 19);

        System.out.println("Artifact: " + Integer.toString(art1.serialNbr));
        System.out.println("Artifact: " + Integer.toString(art2.serialNbr) +", " + art2.culture);
        System.out.println("Artifact: " + Integer.toString(art3.serialNbr) + ", " + art3.culture + ", " + Integer.toString(art3.century));;                

    }
}