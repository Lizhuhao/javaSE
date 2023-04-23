package com.lizhuhao.random;

import java.util.Random;
import java.util.Scanner;

public class RandomDemo2 {
    public static void main(String[] args) {
        //猜数字游戏1-100
        Random r = new Random();
        int luckNumber = r.nextInt();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入你猜测的数字（1-100）：");
            int guessNumber = sc.nextInt();
            if(guessNumber > luckNumber){
                System.out.println("不对哦~，猜测的数字过大");
            } else if (guessNumber < luckNumber) {
                System.out.println("不对哦~，猜测的数字过小");
            }else {
                System.out.println("恭喜你猜对了！！！");
                break;
            }
        }
    }
}
