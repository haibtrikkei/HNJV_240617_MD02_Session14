package demo_lambda;

import java.util.Arrays;
import java.util.List;

public class TaoLambda {
    public static void main(String[] args) {
        MyInterface obj = (a,b)->a+b;
        System.out.println("Ham cong: "+obj.cong(2,6));


        List<Integer> ds = Arrays.asList(6,2,4,5,3,54,6,3,5,4,5,4);
        //Sap xep giam dan bang bieu thuc lambda
        ds.sort((i1,i2)->i2.compareTo(i1));
        for(int i: ds){
            System.out.print(i+"\t");
        }
        System.out.println();
    }
}

interface MyInterface{
    int cong(int a, int b);
}