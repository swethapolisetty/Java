/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leftrotationarray;

/**
 *
 * @author swas
 */


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LeftRotationArray {

    public static int[] arrayLeftRotation(int[] a, int n, int k) {
        int b[] = new int[n];
       
        int i=0;
        int pntr = k;
        while(pntr<n && i<n)
        {
            b[i] = a[pntr];
            i++;
            pntr++;
        }
        if(pntr>=n)
            pntr=0;
        while(pntr<k && i<n)
        {
            
            b[i]=a[pntr];
            i++;
            pntr++;
        }
                   return b;
        }
        
      
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
      
        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");
      
        System.out.println();
      
    }
}

