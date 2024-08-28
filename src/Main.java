import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
/*        double num1 = 10;
        double num2 = 3;
        double res1 = num1 / num2;
        double res2 = num1 * num2;
        double res3 = num1 - num2;
        double res4 = num1 + num2;
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);
        double res5 = num1 % num2;
        System.out.println(res5);*/


       /* byte smallestNumber;
        Scanner input = new Scanner(System.in);
        smallestNumber=input.nextByte();
        System.out.println("input number ");*/

        System.out.print("Enter radius :");
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();



        double area =  ( Math.PI * Math.pow(radius, 2));
        System.out.println(" Display the area : " + area);


    }
}