package firstlesson;

import java.util.Scanner;

public class Greet {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("vad heter du?");
        String name = sc.nextLine();

        System.out.println("vad är din år");
        int age=sc.nextInt();

        System.out.println("Hej " + name+ " "+age+" is a good age");
        System.out.println("hej"+age);

    }

}
