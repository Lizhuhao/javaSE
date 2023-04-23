package com.lizhuhao.array;

import java.util.Random;
import java.util.Scanner;

public class Test3 {
    //随机打乱数组
    public static void main(String[] args) {
        int[] codes = new int[5];
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        System.out.println("请输入工号：");
        for(int i = 0; i< codes.length; i++){
            codes[i] = in.nextInt();
        }
        int index;
        int temp;
        for (int i = 0; i < codes.length; i++) {
            index = r.nextInt(codes.length);
            temp = codes[index];
            codes[index] = codes[i];
            codes[i] = temp;
        }
        for (int i = 0; i < codes.length; i++) {
            System.out.print(codes[i] + "\t");
        }
    }
}
