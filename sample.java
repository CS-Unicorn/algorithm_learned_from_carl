package com.advancex.sort_bubble;

import java.util.Random;

public class sample {
    public static void main(String[] args) {
        /*
            冒泡排序:;
            每次确定一个元素的位置
            每次循环长度减 1 (因为每次循环都能确定一个元素的位置, 故将其排除)
        */

        Random rd = new Random();

        //定义一个初始数组
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            // 存入0 - 9 之间的随机数
            arr[i] = rd.nextInt(10);
        }
        // 输出初始数组
        System.out.println("初始数组为:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // 进行bubble sort
        // 按从小到大的顺序
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println();

        //输出排序后的数组
        System.out.println("排序后的数组为: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
