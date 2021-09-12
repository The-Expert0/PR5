package com.company;

import java.util.Scanner;

public class Z5 {
    public int num;
    public int number;
    public int sum;
    public Z5(){
        System.out.println("");
        System.out.println("Задача №5");
        input();
    }
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        this.num = scanner.nextInt();
        this.number = num;
        prov();
    }
    public void prov(){
        if (num == 0)
            System.out.println("Сумма цифр в числе "+number+" равна :"+sum);
        else
            sort();
    }
    public void sort(){
        sum += num % 10;
        num /= 10;
        prov();
    }
}
