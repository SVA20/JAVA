package TASKS;

import java.util.Scanner;

public class Task2 {
    // task1
    public static int oppositeHouse(int house, int streetLength) {
        return streetLength * 2 - (house - 1);
    }
   // task2
    public static String nameShuffle(String str) {
        String[] words = str.split(" ");
        return words[1] + " " + words[0];
    }
    // task3
    public static float discount(int a, int b) {
        return a - (b * (a/ 100));
    }
    // task4
    public static int differenceMaxMin(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(max <= arr[i]){
                max = arr[i];
            }

            if(min >= arr[i]){
                min = arr[i];
            }
        }

        return max - min;
    }
    // task5
    public static int equal(int a, int b, int c) {
        if (a == b && a == c) {
            return 3;
        } else if (a == b || b == c || a == c) {
            return 2;
        }
        return 0;
    }
    // task6
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    // task7
    public static int programmers(int a, int b, int c) {
        int max = a;
        int min = a;

        if (b > max) max = b;
        if (c > max) max = c;

        if (b < min) min = b;
        if (c < min) min = c;

        return max - min;
    }
    // task8
    public static boolean getXO(String str) {
        String[] arr = str.split("");
        int countX  = 0;
        int countO = 0;

        for (String item : arr) {
            if (item == "x") countX++;
            if (item == "o") countO++;
        }

        return countO == countX ? true : false;
    }
    // task9
    public static String bomb(String str) {
        return str.toLowerCase().contains("bomb") ? "DUCK!" : "Relax, there's no bomb.";
    }
    // task10
    public static boolean sameAscii(String str1, String str2) {
        int sum1 = 0;
        int sum2 = 0;


        for (int i = 0; i < str1.length(); i++) {
            char character = str1.charAt(i);
            int ascii = (int) character;
            sum1 += ascii;
        }

        for (int i = 0; i < str2.length(); i++) {
            char character = str2.charAt(i);
            int ascii = (int) character;
            sum2 += ascii;
        }

        return sum1 == sum2 ? true : false;
    }
    public static void main (String args [])
    {
        Scanner in = new Scanner(System.in);
        System.out.println(oppositeHouse(in.nextInt(),in.nextInt()));;

        int a=in.nextInt();
        int b=in.nextInt();
        System.out.print( discount(a,b));
        int[] arr = new int[a];
        System.out.println(differenceMaxMin(arr));
        System.out.println(equal(in.nextInt(),in.nextInt(),in.nextInt()));
        System.out.println(reverse(in.nextLine()));
        System.out.println(programmers (in.nextInt(),in.nextInt(),in.nextInt()));
        System.out.println(getXO(in.nextLine()));
        System.out.println(bomb(in.nextLine()));
        System.out.println(sameAscii(in.nextLine(),in.nextLine()));

    }
}
