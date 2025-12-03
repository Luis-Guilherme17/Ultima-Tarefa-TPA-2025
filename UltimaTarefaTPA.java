
package com.mycompany.ultimatarefatpa;

import java.util.Scanner; 

public class UltimaTarefaTPA { 
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[][] estoque = new String[1][4];
        
        System.out.println("=== SISTEMA DE ESTOQUE ===");
        System.out.print("Digite o produto:\n");
            
            System.out.print("Nome do produto: ");
            estoque[0][0] = scanner.nextLine();
            
            System.out.print("Quantidade: ");
            estoque[0][1] = scanner.nextLine();
            
            System.out.print("Preço por unidade (sem descontos): ");
            estoque[0][2] = scanner.nextLine();
        
            try {
                //Professor, essa parte eu pesquisei sobre como fazer essa conversão de uma String para um valor, ou quebrado ou inteiro, de forma mais simplificada, por isso esse Integer.parseInt e a mesma coisa com o Double.
                int quantidade = Integer.parseInt(estoque[0][1]);
                double preco = Double.parseDouble(estoque[0][2]);
                double valorTotal = quantidade * preco;
                
                //Esse String.format pelo o que eu pesquisei serve para definir a quantidade de casas decimais do valor final, e como na tarefa esta 2 eu deixei 2.
                estoque[0][3] = String.format("%.2f", valorTotal);
                
            //Usei try e catch para pegar valores invalidos, e esse NumberFormatException é um erro especifico onde a conversão de valores é invalida.
            } catch (NumberFormatException e) {
                System.out.println("Erro, Digite valores numéricos para quantidade e preço!");
                estoque[0][3] = "0.00";
            }
           
            System.out.println();
        
        System.out.println("\n==================== TABELA DE ESTOQUE ====================");

        System.out.printf("%-20s %-10s %-9s %-12s\n", "| Produto |", "|Quantidade| ", " |Preço| ", " |Valor Total|");

        for (int i = 0; i < 1; i++) {
            System.out.printf("%-20s %-14s %-9s R$ %-12s\n", estoque[i][0], estoque[i][1], "R$ " + estoque[i][2], estoque[i][3]);
        }
        
        scanner.close();
        
    }
} 