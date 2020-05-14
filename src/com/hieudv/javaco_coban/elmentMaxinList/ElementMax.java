package com.hieudv.javaco_coban.elmentMaxinList;

public class ElementMax {
    public static void main(String[] args) {
        // su dụng ham
        int[] arr = {1,3,4,5,10};
      int max =max(arr ,arr.length);
        System.out.println("so lon nhat" + max);


    }
    public static int max(int[] a, int n){
        int temp =a[0];
        for(int i =0 ; i <a.length; i++){
            if(a[i] > temp){
                temp = a[i] ;
            }
        }
        return temp;
    }
}
