package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        revertArray();
        fillArray();
        upSmallIntArray();
        fillMatrix();
        int[] arResult = createArray(8,1);
        checkbalance(arResult);
        shiftArray(arResult,2);
    }

    //lesson 3
    public static void revertArray() {
        int[] aNums = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };

        for (int i = 0; i < aNums.length; i++) {
            if( aNums[i] == 0){
                aNums[i] = 1;
            }else{
                aNums[i] = 0;
            }
        }
    }

    public static void fillArray() {
        int[] aNums; // объявление массива
        aNums = new int[100];
        for (int i = 0; i < 100; i++) {
            aNums[i] = i+1;
        }
    }

    public static void upSmallIntArray() {
        int[] aNums = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < aNums.length; i++) {
            if( aNums[i] < 6){
                aNums[i] = aNums[i]*2;
            }
        }
    }

    public static void fillMatrix() {
        int[][] myTwoDimentionalArray = new int [8][8];

        for (int i = 0; i < 8; i++) {
            //Основная
            myTwoDimentionalArray[i][i] = 1;
            //вспомогательная
            myTwoDimentionalArray[i][8-i] = 1;
        }

    }

    public static int[] createArray(int len , int initialValue) {
        int[] aNums; // объявление массива
        aNums = new int[len];
        for (int i = 0; i < len; i++) {
            aNums[i] = initialValue;
        }
        return aNums;
    }

    public static void findMaxAndMin(int[] aNums) {
        int indexOfMax = 0;
        int indexOfMin = 0;
        for (int i = 0; i < aNums.length; i++)
        {
            if (aNums[i] > aNums[indexOfMax])
            {
                indexOfMax = i;
            }
            else if (aNums[i] < aNums[indexOfMin])
            {
                indexOfMin = i;
            }
        }
        System.out.println(aNums[indexOfMax] + " " + aNums[indexOfMin]);

    }

    public static boolean checkbalance(int[] array){
        int leftSum = 0;
        for(int i = 0; i < array.length; i++){
            leftSum += array[i];
            int rightSum = 0;
            for (int j = 0; j < array.length; j++){
                rightSum += (j > i)? array[j] : 0;
            }
            if(leftSum == rightSum){
                return true;
            }
        }
        return false;
    }

    public static void shiftArray(int[] array, int value) {
        boolean direction;
        if (value < 0) {
            direction = true;
            value = -value;
        } else {
            direction = false;
        }
        value %= array.length;
        int last = array.length - 1;
        for (int i = 0; i < value; i++) {
            int temp = (direction) ? array[0] : array[last];

            for (int j = 0; j < last; j++) {
                if (direction)
                    array[j] = array[j + 1];
                else
                    array[last - j] = array[last - j - 1];
            }

            if (direction)
                array[last] = temp;
            else
                array[0] = temp;
        }
    }

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
