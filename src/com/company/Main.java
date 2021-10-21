package com.company;

public class Main {

    public static void main(String[] args) {
	int a=10;
    int b = 20;

        System.out.println("A = "+ a);
        System.out.println("B = "+ b);

    int[] switchArray = switcher.switcher(a,b);

    a= switchArray[1];
    b= switchArray[0];


        System.out.println("Everything is switched!");
        System.out.println("A = "+ a);
        System.out.println("B = "+ b);



    }
}
