package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee[] empCorp = new Employee[5];
        empCorp[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312",50000,41);
        empCorp[1] = new Employee("Petrov Petr", "Creator", "petrov@mailbox.com", "892312314",50000,32);
        empCorp[2] = new Employee("Sidorov Sidr", "Water pot", "sidorov@mailbox.com", "892312315",10000,43);
        empCorp[3] = new Employee("Pupkina Nadegda", "EnvelopeLicker", "pupkina@mailbox.com", "892312316",5000,18);
        empCorp[4] = new Employee("Juk J", "GrinderPencil", "juk@mailbox.com", "892312317",3000,21);
        for (Employee employee : empCorp)
            if (employee.getAge()>40)
                System.out.println(employee);
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
