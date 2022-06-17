/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arbol;

import java.util.Scanner;

/**
 *
 * @author Torrev_101
 */
public class Arbol {
    static Scanner sc=new Scanner(System.in);
    public static void main (String [] args){
        Nodo p;
        Nodo q=new Nodo();
        Nodo raiz=new Nodo();
        
        
        p=new Nodo();
        System.out.println("raiz");
        p.dato=sc.nextInt();
        raiz=p;
        q=p;
        q=nodosIzquierda(q);
        q=raiz;
        q=nodosDerecha(q);
        q=raiz;
        impresionDerecha(q);
        System.out.println("-------------------");
        impresionIzquierda(q);
    }
    
    private static Nodo nodosIzquierda(Nodo n){
        System.out.println("Digite los datos del lado izquierdo");
        for(int i=0;i<2;i++){
            Nodo p=new Nodo();
            p.dato=sc.nextInt();
            n.ei=p;
            n=p;
        }
        return n;
    }
    private static Nodo nodosDerecha(Nodo n){
        System.out.println("Digite los datos del lado derecho");
        for(int i=0;i<2;i++){
            Nodo p=new Nodo();
            p.dato=sc.nextInt();
            n.ed=p;
            n=p;
        }
        return n;
    }
    private static void impresionDerecha(Nodo n){
        for(int i=0;i<3;i++){
            System.out.println("dato izquierdo "+(i+1)+": "+n.dato);
            n=n.ed;
        }
    }
    private static void impresionIzquierda(Nodo n) {
        for(int i=0;i<3;i++){
            System.out.println("dato derecho "+(i+1)+": "+n.dato);
            n=n.ei;
        }
    }
}
class Nodo{
    Nodo ei;
    int dato;
    Nodo ed;
}
        
