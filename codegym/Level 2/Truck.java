public class Truck {

    int length;
    int width;
    int height;

    int weight;

    // must return an int by definition
    public int getVolume() {
        int volume = length * width * height;
        return volume;
    }
}