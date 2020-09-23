/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex04;

import java.util.Scanner;

/**
 *
 * @author giova
 */
public class Ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner ler = new Scanner(System.in);
        
        int i[] = new int[10];
        
        for(int o = 0; o < 10; o++){
            i[o] = ler.nextInt();
        }
        
        int sum = 0;
        int big, less;
        
        for(int x = 0; x < 10; x++){
            sum = sum+i[x];
        }
        
        float avg = sum / 10;
        
        big = i[0];
        less = i[0];
        
        for(int k = 0; k < 10; k++){
            if(i[k] > big){
                big = i[k];
            } else if (i[k] < less){
                less = i[k];
            }
        }
        
        System.out.println("Media: " + avg);
        System.out.println("Maior: " + big);
        System.out.println("Menor: " + less);
        
        
    
    }
    
    
}
