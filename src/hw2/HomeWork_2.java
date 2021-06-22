package hw2;

public class HomeWork_2 {
    public static void main(String[] args) {
           System.out.println(within10and20(8, 1));
            isPositiveOrNegative(-90);
            System.out.println(isNegative(0));
            printWordNTimes("Hello world", 5);
            for (int i = 1000; i <= 3000; i += 1){
                System.out.println("Год высокосный " + i + " - " +  isLeapYear(i));
            }

        }

        public static boolean within10and20(int a, int b){
            if ((a + b) >= 10 && (a + b) <= 20){
                return true;
            } else {
                return false;
            }
        }

        public static void isPositiveOrNegative(int a){
            if (a >= 0){
                System.out.println("Положительное");
            } else {
                System.out.println("Отрицательное");
            }
        }

        public static boolean isNegative(int a){
            if (a < 0) {
                return true;
            } else {
                return false;
            }
        }

        public static void printWordNTimes(String word, int times){
            for (int i = 1; i <= times; i++ ){
                System.out.println(word);
            }
        }


        public static boolean isLeapYear(int a){
            if (a % 4 == 0 && a % 100 != 0){
                return true;
            } else if (a % 100 == 0 && a % 400 == 0){
                return true;
            } else {
                return false;
            }
        }

    }