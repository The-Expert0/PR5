package com.company;
import java.util.Scanner;

public class Z3 {
    public int numA;
    public int numB;
    public Z3(){
        System.out.println("");
        System.out.println("Задача №3");
        input();
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число A: ");
        this.numA = scanner.nextInt();
        System.out.print("Введите число B: ");
        this.numB = scanner.nextInt();
        prov();
    }
    public void prov() {
        if (numB <= numA){
            System.out.println("Число B должго бытьь больше числа A");
            input();
        }
        else
            sort();
    }

    public void sort() {

        System.out.println("Числа от "+numA+" до "+numB);
        for (int i = numA; i <= numB; ++i)
            System.out.print(i+", ");
    }
}
