package com.lizhuhao.type;

public class TypeDemo1 {
    //理解自动类型转换
    public static void main(String[] args) {
        byte a=20;
        int b=a;
        System.out.println(a);
        System.out.println(b);

        int age = 23;
        double db = age;
        System.out.println(db);

        char c = 'a';
        int code = c;
        System.out.println(code);
    }
}
