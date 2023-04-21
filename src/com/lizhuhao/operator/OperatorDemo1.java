package com.lizhuhao.operator;

public class OperatorDemo1 {
    public static void main(String[] args) {
        int a = 10;
        int b =3;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b); //3
        System.out.println(3 / 2); //1
        System.out.println(3 * 1.0 / 2); //1.5
        System.out.println(3 / 2 *1.0); //1
        System.out.println(a % b); //1

        //拆分三位数
        int data = 589;
        //个位
        int ge = data % 10;
        //十位
        int shi = data / 10 % 10;
        //百位
        int bai = data / 100;
    }
}
