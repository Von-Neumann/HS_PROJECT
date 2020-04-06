package com.faine.sort;

import java.util.Arrays;

public class InsertSort {

    public static void main(String[] args) {
        int [] arr = {6,1,8,2,4,9};
        insert_sort(arr);

    }

    public static void insert_sort(int[] target){
        for(int i=0; i<target.length-1; i++){
            for (int j=i+1; j>0; j--){   //这里一一和有序表中的元素比较，i=0时，有序表中有一个元素
                if(target[j]<target[j-1]){
                    int temp = target[j];
                    target[j] =target[j-1];
                    target[j-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(target));
    }
}
