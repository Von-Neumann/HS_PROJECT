package com.faine.sort;

import java.util.Arrays;

/**
 * author: faine
 *
 * this is a Bubble Sort code
 *
 * XXXgi
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {3,8,6,1,9,4};
        BubbleSort bb = new BubbleSort();
        bb.bubbleSort(arr);

    }

    //升序
    public void bubbleSort(int[] target){

        for(int i=0; i<target.length-1; i++){
            for (int j=0; j<target.length-i-1; j++){
                if (target[j]>target[j+1]){
                    int temp  = target[j];
                    target[j] = target[j+1];
                    target[j+1
                            ] =temp;
                }
            }
            System.out.println(Arrays.toString(target));
        }
    }
}
