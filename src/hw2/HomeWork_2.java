package hw2;

public class HomeWork_2 {
    public static void main(String[] args) {
        System.out.println(within10and20(8,1));

    }
    public static boolean within10and20(int a, int b){
        if ((a + b) >= 10 && (a + b) <= 20){
            return true;
        } else {
            return false;
        }
    }
}
