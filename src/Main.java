import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
/*        double num1 = 10;
        double num2 = 3;
        double res1 = num1 / num2;
        double res2 = num1 * num2;
        double res3 = num1 - num2;



        +
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

      /*  System.out.print("Enter radius :");
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();



        double area =  ( Math.PI * Math.pow(radius, 2));
        System.out.println(" Display the area : " + area);

*/

  /*      long totalMilliSecond = System.currentTimeMillis();
        long totalSecond = totalMilliSecond / 1000;
        long currentSecond = totalSecond % 60;
        long totalMinute = totalSecond / 60;
        long currentMinute = totalMinute % 60;
        long totalHour = totalMinute / 60;
        long currentHour = totalHour % 24;
        System.out.println("Current time is " + " " + currentHour + ":" + currentMinute + ":" + currentSecond);*/

  /*      double number = Math.random();
        Random random = new Random();
        int a = random.nextInt(1, 30);
        System.out.println(a);
        System.out.println((int) (number * 10));*/

     /*   double a = 6.5;
        a += 1;
        System.out.println(a);
*/


        int number1=(int)(System.currentTimeMillis()%10);
        int number2=(int)(System.currentTimeMillis()/10%10);
        System.out.println("What will"+number1+"+ "+number2+"?");
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        int i = (number2 > number1) ? 1 : 2;
        System.out.println();






    }
}