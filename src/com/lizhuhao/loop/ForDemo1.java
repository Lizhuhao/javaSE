package com.lizhuhao.loop;

public class ForDemo1 {
    public static void main(String[] args) {
        //找出水仙花数
        int count=0;
        for(int i=100;i<=999;i++){
            int ge = i%10;
            int shi = i /10 % 10;
            int bai = i / 100;
            if(Math.pow(ge,3) + Math.pow(shi,3) + Math.pow(bai,3) == i){
                System.out.print(i+"\t");
                count++;
            }
        }
        System.out.println();
        System.out.println("水仙花的个数为："+count);
    }
}
