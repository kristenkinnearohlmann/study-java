public class Multiplication{
    public static void main(String[] args){
        int i = 1;
        int j = 1;
        System.out.println("Testing");
        while ( i <= 10 ){
            while ( j <= 10 ) {
                System.out.print((i*j) + " ");
                j++;
            }
            i++;
            j = 1;
            System.out.println("\n");
        }
    }
}