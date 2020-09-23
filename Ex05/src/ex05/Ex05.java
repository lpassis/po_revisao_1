/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

/**
 *
 * @author giovanninibarbosa
 */
public class Ex05 {

    /**
     * @param args the command line arguments
     */
    public static void somaMatriz(int matriz[][], int matriz2[][]) throws IOException {
        int matrix[][] = new int[10][10];
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                matrix[i][j] = matriz[i][j] + matriz2[i][j];
            }
        }
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void Arquivo(String path) throws IOException {
        try (BufferedReader buffRead = new BufferedReader(new FileReader(path))) {
            String linha = "";
            String[] str;
            int matriz[][][] = new int[2][10][10];
            int i = 0;
            int q = 0;
            while (true) {
                if ((linha != null)) {
                    if (linha.length() >= 1) {
                        if (linha.charAt(0) == '#') {
                            q++;
                            i = 0;
                        } else {
                            str = linha.split(" ");
                            for (int j = 0; j <= str.length - 1; j++) {
                                matriz[q - 1][i][j] = Integer.parseInt(str[j]);
                            }
                            i++;
                        }
                    }
                    linha = buffRead.readLine();
                } else {
                    break;
                }
            }
            somaMatriz(matriz[0], matriz[1]);
        }
    }

    public static void main(String[] args) throws IOException {
        Arquivo("./matriz.txt");

    }
}
