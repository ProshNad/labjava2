package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public class Recursion {



    public static void Givemoney(Integer[] money, Integer mymillion, ArrayList<Integer> sum) {
        if (mymillion > 0) {
            int mymillionow=mymillion;
            for (int i = 0; i < money.length; i++) {
                if (mymillion >= money[i]) {
                    mymillion = mymillion - money[i];
                    sum.add(money[i]);
                }
            }
            if(mymillion==mymillionow){
                System.out.println("It unpossible!");
            }else{
            Givemoney(money,mymillion,sum);}
        }else{
            for(int i=0;i<money.length;i++){
            int mon = Collections.frequency(sum, money[i]);
            System.out.println(money[i]+":"+mon);
            }
        }




    }




}
