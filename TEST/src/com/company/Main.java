package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*String a = "Введите своё имя: ";
        int i;
        System.out.println(a);
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        if (i%2 ==0) {
            System.out.println(i + "- четное число");
        }
    else {
            System.out.println(i + "- нечетное число");
        }*/

//упр 6.1 (доделать)
       /*for (int i=1; i<10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);}
            }
        for (int i=1; i<10; i++) {
            if (i % 2 == 1) {
                System.out.println(i);}
        }*/

// 1 упражнение:
      /* String a = "Введите своё имя: ";
        String b;
        System.out.println(a);
        Scanner sc = new Scanner(System.in);
        b = sc.next();
        System.out.println("Привет: " + b);*/


//2 упражнение
        /*System.out.println(Arrays.toString(args));
        Arr.sort(args);
        System.out.println(Arrays.toString(args));*/
// 3 упражнение
       /* Random r = new Random();
        int [] arr = new int[10];
        for(int i = 0; i < arr.length; i++){
            arr[i] = r.nextInt();
            System.out.println(arr[i]+ "\n");
        }*/
// 4 упражнение
      /*  String b = "qwerty";
   String a = "Введите свой пароль: ";
        String i;
        System.out.println(a);
        Scanner sc = new Scanner(System.in);
        i = sc.next();
        if (i.equals(b)) {
            System.out.println(i + "- true");
        }
    else {
            System.out.println(i + "- false");
        }*/
 // 5 упражнение

        /*String a = "Введите числа через пробел: ";
        String b;
        System.out.println(a);
        Scanner sc = new Scanner(System.in);
        b = sc.nextLine();
        int sum =0;
        String strArr[] = b.split(" ");
        int numArr[] = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            numArr[i] = Integer.parseInt(strArr[i]);
        }

        for (int num:numArr) {
            sum = sum + num;
        }
        System.out.println("Сумма элементов массива равна: " + sum);*/
       // 6,1 упражнение
     /*Random r = new Random();
        int [] arr = new int[10];
        for(int i = 0; i < arr.length; i++){
            arr[i] = r.nextInt();
            if (arr[i] % 2 == 1){
                System.out.println(arr [i]);}
        }*/
       /* Random r = new Random();
        int [] arr = new int[10];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt();
            if (arr[i] % 7 == 0) {
                System.out.println(arr[i]);
            }
        }*/

    }
}
