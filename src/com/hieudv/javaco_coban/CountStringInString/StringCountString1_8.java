package com.hieudv.javaco_coban.CountStringInString;

import java.util.HashMap;

public class StringCountString1_8 {
    public static void main(String[] args) {
        //characterCount("Alive is Awesome");
    }
    static void characterCount(String inputString){
       // khởi tạo chứa valuse
        HashMap<Character,Integer> eachCharCountMap = new HashMap<Character, Integer>();
        //chuyển đổi inputString sang mảng
        char[] charArray = inputString.toCharArray();
        for(char c : charArray){
            if(eachCharCountMap.containsKey(c)){
                //neu phan tu xuat hien tang them 1
                eachCharCountMap.put(c,eachCharCountMap.get(c)+1);
            }
        }
    }
}
