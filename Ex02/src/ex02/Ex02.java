/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex02;

import java.util.Scanner;

/**
 *
 * @author giova
 */
public class Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int tam = 10;
        int v[] = new int[tam];
        
        for(int i = 0; i < 10; i++){
            System.out.println("Insira o número: ");
            v[i] = ler.nextInt();
        }
        
        for(int a = 0; a < 10; a++){
            System.out.println(v[a]);
        }
        
        
    }
    
}
