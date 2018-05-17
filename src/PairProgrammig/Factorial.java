package PairProgrammig;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Calc.popArray();
        MyClass.input();
    }
}

class Calc {
    public static void popArray() {
        int[] intArr = new int[10];
        for (int i = 0; i < 10; i++) {
            intArr[i] = i + 1;
            System.out.println(intArr[i]);
            MyClass.FactorialNum(intArr[i]);
        }
    }
}

class MyClass {
    private static int[] factorialArray= new int[10];

    public static void FactorialNum(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        factorialArray[num-1]=fact;
        System.out.println("Factorial of "+num+" is: "+factorialArray[num-1]);
    }


    public static void input(){
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        int i;
        for (i=0; i<10; i++)
        if (inputNum==factorialArray[i]){
            System.out.println("its a factor");
        }
    }
}