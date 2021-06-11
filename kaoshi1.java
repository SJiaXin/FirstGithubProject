package com.kgc.KaoShi;

import java.util.Arrays;

public class kaoshi1 {
    /**
     * 快速排序
     */
    public static void main(String[] args) {
        int[] arr = {2,100,5,3,19,15,26,27,36,38,47,46,44,50,48};
        kuaisupaixu(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    public static void kuaisupaixu(int[] arr,int left,int right){

        //最终判断条件
        if (left>=right)
            return;
        //注意这儿有个=

        int base = arr[left];

        int low = left;
        int high = right;

        while (low<high){
            while (base<=arr[high] && low<high){
                high--;
            }
            while (base>=arr[low] && low<high){
                low++;
            }
            if (low<high){
                //这儿你可以随便赋值
                int temp = arr[high];
                arr[high] = arr[low];
                arr[low] = temp;
            }
        }
        //基准和每一轮重合处互换
        //这儿的顺序一定不能变,先把中间的弄走,再把基准赋给中间的
        arr[left] = arr[low];
        arr[low] = base;

        kuaisupaixu(arr,left,low-1);
        kuaisupaixu(arr,low+1,right);

    }
}
