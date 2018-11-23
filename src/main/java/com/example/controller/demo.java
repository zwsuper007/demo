package com.example.controller;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Auther: wei.zhao
 * @Date: Create in  2018/11/3 14:58
 * @Description:
 * @Modified By:
 */
public class demo {

    public static void main(String[] args){

        Demo1 demo1 = new Demo1();
        for (int i = 0;i < 10;i ++){
            new Thread(demo1).start();
        }

    }






}
 class Demo1 implements  Runnable{

    private AtomicInteger num = new AtomicInteger();

     @Override
     public void run() {
         try {
             Thread.sleep(200);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
        System.out.println(getNum());
     }

     public int  getNum (){
       return num.getAndIncrement();
     }

 }
