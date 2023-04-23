package com.lizhuhao.array;

public class Test1 {
    public static void main(String[] args) {
        //找数组中的最大值
        int[] faceScore = {15,9000,10000,20000,9500,-5};
        int max = faceScore[0];
        for (int i = 1; i < faceScore.length; i++) {
//            max = (max > faceScore[i]) ? max : faceScore[i];
//            if (max > faceScore[i]) max = max;
//            else max = faceScore[i];
            max = Math.max(max, faceScore[i]);
        }
        System.out.println(max);
    }
}
