package com.lizhuhao.array;

import org.w3c.dom.ls.LSInput;

import java.util.Random;
import java.util.Scanner;

public class Test2 {
    //猜数字游戏3.0
    //1-20五个随机数，猜对一个返回索引和全部数字
    public static void main(String[] args) {
        int[] data = new int[5];
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < data.length; i++) {
            data[i] = r.nextInt(20) + 1;
        }
        boolean flag = true;
        while (flag){
            System.out.println("请输入1-20的整数进行猜测：");
            int guessNumber = sc.nextInt();
            for (int i = 0; i < data.length; i++) {
                if (data[i] == guessNumber){
                    System.out.println("猜对了，运气不错哦~你猜的数字在数组中的索引为：" + i);
                    flag = false;
                    break;
                }
            }
            if (flag)
                System.out.println("猜错了，别气馁，继续加油!");
        }
//        for (int i = 0; i < data.length; i++) {
//            System.out.print(data[i] + "\t");
//        }
        for (int datum : data) {
            System.out.print(datum + "\t");
        }
//
    }
}
