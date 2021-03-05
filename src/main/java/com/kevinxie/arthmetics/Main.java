package com.kevinxie.arthmetics;


/**
 * Author: xiekun
 * Date: 2021/2/23 12:56
 * Description:
 */
public class Main {
    public static void main(String[] args) {
        String str = "hahah";
        new Runnable(){
            @Override
            public void run() {
                System.out.println(str);
            }
        };
    }
}