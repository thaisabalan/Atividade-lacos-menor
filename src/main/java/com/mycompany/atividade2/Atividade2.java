package com.mycompany.atividade2;

import java.util.Scanner;

public class Atividade2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Scanner teclado = new Scanner(System.in);   
       
        int i, pergunta;
        int menor = 1;
        
        for(i = 0; i <= 10; i++){
            System.out.printf("Insira o %d valor:\n", i + 1);
            pergunta = teclado.nextInt();
            
            if(pergunta < menor){
                menor = pergunta;
            }
        }
        System.out.printf("O menor numero e: %d \n", menor); 
    }
}
