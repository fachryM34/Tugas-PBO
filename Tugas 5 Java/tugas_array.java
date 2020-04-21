package com.mycompany.java_new;
import java.util.Arrays;
/**
 *
 * @author fachryM34
 */
public class tugas_array {
     public static void main(String[] args) 
    { 
  
        //method binary search
        int intArr[] = { 10, 20, 15, 22, 35 }; 
        Arrays.sort(intArr); 
        int intKey = 22; 
        System.out.println(intKey + " ditemukan di index = "+ Arrays.binarySearch(intArr, intKey)); 
    
        // method equals
        int intArr1[] = { 10, 20, 15, 22, 35 }; 
        int intArr2[] = { 10, 15, 22 }; 
        System.out.println("Integer Arrays tentang perbandingan : " + Arrays.equals(intArr1, intArr2)); 
    
        //method fill
        int intArr3[] = { 10, 20, 15, 22, 35 }; 
        int intKey2 = 22; 
        Arrays.fill(intArr3, intKey); 
        System.out.println("Integer Array pada pengisian : "+ Arrays.toString(intArr3)); 
        
        //method sort
        int intArr4[] = { 10, 20, 15, 22, 35 }; 
        Arrays.sort(intArr4); 
        System.out.println("Integer Array: "+ Arrays.toString(intArr4)); 
    } 
     
    
}
