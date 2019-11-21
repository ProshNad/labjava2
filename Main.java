package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Integer[] money=new Integer[]{20,2,4,1};
        Integer mymillion =40;

        ArrayList<Integer> sum = new ArrayList<>();
        Arrays.sort(money, Collections.reverseOrder());
        System.out.println(money[0]);
        int x=0;
        for(int i=0;i<money.length;i++)
            x=x+money[i];
        if(x<=mymillion)
            Recursion.Givemoney(money,mymillion,sum);
        else
            System.out.println("I can't give you money!");

    }
}
