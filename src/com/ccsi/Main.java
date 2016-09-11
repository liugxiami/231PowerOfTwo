package com.ccsi;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo4(1));
    }
    //Given an integer,write a function to determine if it is a power of two
    //1.所有2^n的数在二进制上有且仅有一个1. 如果这个数m对m-1求&的结果为0，则为2的n次方
    public static boolean isPowerOfTwo1(int n){
        if(n<=0) return false;
        return (n&(n-1))==0;
    }
    //2.>>
    public static boolean isPowerOfTwo2(int n){
        if(n<=0) return false;
        while(n!=0){
            if((n&1)==1)break;
            else n>>=1;
        }
        return n==1;
    }
    //3.>> and counter                          //适用power of 2的n次方；对2的n次方-1 取&
    public static boolean isPowerOfTwo3(int n){
        if(n<=0) return false;
        int counter=0;
        while(n!=0){
            if((n&1)==1) counter++;             //如&3，&7,&15等等；
            n>>=1;
        }
        return counter==1;
    }
    //4.%2                                       //适用power of N;
    public static boolean isPowerOfTwo4(int n){
        if(n<=0) return false;
        while(n!=0){
            if(n%2==0) n/=2;
            else break;
        }
        return n==1;
    }
}
