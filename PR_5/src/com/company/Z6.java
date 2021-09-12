package com.company;

import java.util.Scanner;

public class Z6 {
    public int num;
    public Z6(){
        System.out.println("");
        System.out.println("Задача №6");
        input();
    }
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        this.num = scanner.nextInt();
        prov();
    }
    public void prov(){
        int divider = 1;
        for(int i = 2; i < num; i++){
            if (num % i == 0){
                divider = i;
                break;
            }
        }
        if(divider == 1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }

}
