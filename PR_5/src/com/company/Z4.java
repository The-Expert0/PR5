package com.company;

import java.util.Scanner;

public class Z4 {
    public int numK;
    public int numS;
    public Z4(){
        System.out.println("");
        System.out.println("Задача №4");
        input();
    }
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число K: ");
        this.numK = scanner.nextInt();
        System.out.print("Введите число S: ");
        this.numS = scanner.nextInt();
        prov();
    }
    public void prov() {
        if (numK == 0){
            System.out.println("Число K не может быть равным 0");
            input();
        }
        else
            sort();
    }
    public void sort() {
        System.out.println(numK+" значные числа с суммой цифр "+numS+":");
        for (int i = (int) Math.pow(10, numK-1); i < (int) Math.pow(10, numK); i++) {
            int i2 = i;
            int sum = 0;
            while(i2 != 0){
                sum += (i2 % 10);
                i2/=10;
            }
            if (sum == numS)
                System.out.print(i + ", ");
        }
    }

}
