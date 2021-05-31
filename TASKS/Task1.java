package TASKS;
import java.util.Scanner;

public class Task1 {
    /** Task 1 **/
    public static int convert(int digit) {
        return digit * 60;
    }

    /** Task 2 **/
    public static int points(int p2, int p3) {
        return p2 * 2 + p3 * 3;
    }

    /** Task 3 **/
    public static int footballPoints(int a, int b, int lose) {
        return a * 3 + b;
    }

    /** Task 4 **/
    public static boolean divisibleByFive(int digit) {
        return digit % 5 == 0;
    }

    /** Task 5 **/
    public static boolean and(boolean a, boolean b) {
        return a && b;
    }

    /** Task 6 **/
    public static int howManyWalls(int n, int w, int h) {
        return n / (w * h);
    }

    /** Task 7 **/
    public static int squared(int b) {
        return b * b;
    }

    /** Task 8 **/
    public static boolean profitableGamble(double prob, int prize, int pay) {
        return prob * prize > pay;
    }

    /** Task 9 **/
    public static int frames(int frames, int minute) {
        return frames * minute * 60;
    }

    /** Task 10 **/
    public static int mod(int a, int b) {
        while (a - b > 0) a -= b;
        return a;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println(convert(in.nextInt()));
        System.out.println(points(in.nextInt(), in.nextInt()));
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(footballPoints(a, b, in.nextInt()));
        System.out.println(divisibleByFive(in.nextInt()));
        System.out.println(and(in.nextBoolean(),in.nextBoolean()));
        System.out.println(howManyWalls(a, b, in.nextInt()));
        System.out.println(squared(in.nextInt()));
        System.out.println(profitableGamble(a, b, in.nextInt()));
        System.out.println(frames(a, b));
        System.out.println(mod(a, b));

    }

}
