package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a =5;
        int b =5;

        checkSum(a,b);
        checkPositive(a);
        boolean res = checkNegative(a);
        System.out.println(res);
        printString("ibc here!", a);
        isLeapYear(2022);
    }

    //////////////////////////////////////
    // lesson 2
    public static boolean checkSum(int a,int b) {
        if (a+b>10 && a+b<=20){
            return true;
        }else{
            return false;
        }
    }

    public static void checkPositive(int a) {
        if (a>=0){
            System.out.println("Is Positive");
        }else{
            System.out.println("Isn't Positive");
        }
    }

    public static boolean checkNegative(int a) {
        if (a<0){
            return true;
        }else{
            return false;
        }
    }

    public static void printString(String str,int a) {
        for (int life = a; life >= 1; life--)
            System.out.println("String");
    }

    public static void isLeapYear(int year) {
        if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
        {
            System.out.println(year +"is a leap year.");
        }
        else
        {
            System.out.println(year + " is not a leap year.");
        }
    }

    //////////////////////////////////////
    // lesson 1
    public static void printThreeWords() {
         System.out.println("Orange");
         System.out.println("Banana");
         System.out.println("Apple");
     }

    public static void checkSumSign() {
        int a = 5;
        int b = 10;
        if (a+b>0){
            System.out.println("Сумма положительная");
        }else{
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value  = 10;
        if (value <= 0){
            System.out.println("Красный");
        }else if(value > 0 && value <= 100){
            System.out.println("Желтый");
        }else{
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 5;
        int b = 10;
        if (a >= b){

            System.out.println("a >= b");
        }else{
            System.out.println("a < b");
        }
    }
}
