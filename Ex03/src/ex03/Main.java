/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex03;

import java.util.Scanner;

/**
 *
 * @author giovanninibarbosa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner ler = new Scanner(System.in);

        int tam = 3;
        int m[][] = new int[tam][tam];

        for (int i = 0; i < 3; i++) {
            for (int q = 0; q < 3; q++) {
                m[i][q] = ler.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int q = 0; q < 3; q++) {
                System.out.println("\t" + m[i][q]);
            }

        }
    }
}