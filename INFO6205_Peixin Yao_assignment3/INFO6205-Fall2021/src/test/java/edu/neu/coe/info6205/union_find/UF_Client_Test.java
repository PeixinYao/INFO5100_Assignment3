package edu.neu.coe.info6205.union_find;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class UF_Client_Test {
    public static int count(int n){
        int pairs=0;
        UF h=new UF_HWQUPC(n);
        while(h.components()!=1){
            Random rand1= new Random();
            int random1=rand1.nextInt(n);
            Random rand2= new Random();
            int random2=rand2.nextInt(n);
            if(!h.isConnected(random1,random2)){
                h.union(random1,random2);
                pairs++;
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
       int[] list=new int[args.length];
       for(int i=0;i<args.length;i++){
           list[i]=Integer.parseInt(args[i]);
           System.out.println(args[i]+" sites need "+count(list[i])+" connections");
       }
    }
}
