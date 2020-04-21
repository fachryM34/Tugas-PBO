package com.mycompany.java_new;
import java.util.Vector;

/**
 *
 * @author fachryM34
 */
public class tugas_vector {
    public static void main (String[] args){
        Vector<Integer> deret = new Vector<Integer>();
        
        //add()
        System.out.println("Panjang deret awal: "+deret.size());

        for (int i = 0; i < 10; i++){
            deret.add(i * 10);
        }
        
        //size()
        System.out.println("\nPanjang deret setelah ditambah elemen: "+deret.size());

        for (int i = 0; i < deret.size(); i++){
            System.out.println("elemen ke - " + i + " : " + deret.get(i));
        }
        
        //isEmpty()
        System.out.println("\nMemeriksa apakah vector kosong: ");
        System.out.println(deret.isEmpty());    
        
        //indexOf()
        System.out.println("\nMencari indeks dari suatu nilai di dalam vector: ");
        System.out.println(deret.indexOf(60));  
        System.out.println(deret.indexOf(70));  
        System.out.println(deret.indexOf(80));  

        //Contsins()
        System.out.println("\nMemeriksa keberadaan suatu nilai di dalam vector: ");
        System.out.println(deret.contains(60)); 
        System.out.println(deret.contains(70)); 
        System.out.println(deret.contains(80)); 

        //firtsElement() dan lastElement()
        System.out.println("\nMencari elemen pertama dan terakhir di dalam vector: ");
        System.out.println(deret.firstElement());   
        System.out.println(deret.lastElement());    

        //set()
        System.out.println("\nUpdate suatu nilai di dalam vector: ");
        deret.set(6, 600);  
        deret.set(7, 700);  
        deret.set(8, 800);  

        System.out.println(deret.get(6));   
        System.out.println(deret.get(7));   
        System.out.println(deret.get(8));   
        
        //remove()
        System.out.println("\nMenghapus suatu nilai di dalam vector... ");
        deret.remove(6);    
        deret.remove(6);    
        deret.remove(6);    
        
        
        System.out.println("\nPanjang deret setelah menghapus beberapa elemen: "+deret.size());

        for (int i = 0; i < deret.size(); i++){
            System.out.println("elemen ke - " + i + " : " + deret.get(i));
        }

        //insertElemen()
        System.out.println("\nMenyisipkan suatu nilai di dalam vector... ");
        deret.insertElementAt( 35005, 3 );

        System.out.println("\nPanjang deret setelah menyisipkan elemen: "+deret.size());

        for (int i = 0; i < deret.size(); i++){
            System.out.println("elemen ke - " + i + " : " + deret.get(i));
        }
    }
}
    