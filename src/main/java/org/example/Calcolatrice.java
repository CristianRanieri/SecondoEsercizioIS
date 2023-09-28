package org.example;

public class Calcolatrice {
    public Calcolatrice(int a,int b){
        this.a=a;
        this.b=b;
    }

    public int somma(int a,int b) {
        return a+b;
    }

    public int prodotto(int a,int b) {
        return a*b;
    }

    public int sottrazione(int a,int b) {
        return a-b;
    }

    public int divisione(int a,int b) {
        if(b!=0)
            return a/b;
        return 0;
    }
    
    private Integer a;
    private Integer b;
}
