package firstlesson;

public class FirstLesson {

    public static void main(String[] args) {
        double sum = add(3.9, 5);
        double subtract = sub(9, 8);
        double multi = multi(5, 4);
        double divide = divide(9, 3);
        System.out.println(sum);
        String name = "chinmayee";
        System.out.println(sum);
        System.out.println(multi);
        System.out.println(divide);
        System.out.println(subtract);
        // System.out.println("Hello world");

    }

    public static double add(double number1, double number2) {
        return number1 + number2;

    }

    public static double sub(double number1, double number2) {
        return number1 - number2;
    }

    public static double multi(double number1, double number2) {
        return number1 * number2;
    }

    public static double divide(double number1, double number2) {
        return number1 / number2;
    }

}


