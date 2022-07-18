public class Main {
    public static void main(String[] args) {
        numberDevided(8, 3);
    }
    public static void numberDevided(int max, int arg) {
        for(int a = 0; a<max; a +=arg) {
            System.out.println(a);
        }
    }
}