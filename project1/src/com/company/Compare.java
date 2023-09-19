package com.company;

public class Compare {
    public void compareValues(int a, int b){
        if(a == b){
            System.out.println("Wartość " + a + " = " + b);
        }
        else if(a>b) {
            System.out.println("Wartość " + a + " jest wieksza od " + b);
        }

    }
    public void compareValues(float a, float b){
        System.out.println("Wartość " + a + " = " + b);
    }
    public void compareValues(double a, double b){
        System.out.println("Wartość " + a + " = " + b);
    }
    public void compareValues(String a, String b){
        System.out.println("Wartość " + a + " = " + b);
    }
    public void compareValues(Byte a, Byte b){
        System.out.println("Wartość " + a + " = " + b);
    }

}
