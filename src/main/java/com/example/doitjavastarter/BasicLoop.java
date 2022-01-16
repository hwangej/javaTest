package com.example.doitjavastarter;

public class BasicLoop {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

        while (num <= 10){
            sum += num;
            num++;
        }
        System.out.println(String.format("1부터 3까지의 합은 %d 입니다.",num));

    }
}
