/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleinheritance;

/**
 *
 * @author fachryM34
 */
public class binatang {
     void makan(){System.out.println("sedang makan...");} 
    } 

    class Anjing extends Binatang{ 
    void gonggong(){System.out.println("guk guk...");} 
    }

    public class Pewarisan {
    public static void main(String args[]){ 
    Anjing d=new Anjing(); 
    d.gonggong(); 
    d.makan(); 
    }
}
