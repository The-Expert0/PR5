package com.company;

import java.util.Scanner;

public class Z2 {
    public int number;
    public Z2(){
        System.out.println("");
        System.out.println("Задача №2");
        input();
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        this.number = scanner.nextInt();
        sort();
    }
    public void sort() {
        System.out.println("Числа от 1 до "+number);
        for (int i = 1; i != this.number; i++){
            System.out.print(i+", ");
        }
    }
}
