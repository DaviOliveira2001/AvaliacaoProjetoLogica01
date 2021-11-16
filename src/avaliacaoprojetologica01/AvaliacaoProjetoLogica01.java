/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliacaoprojetologica01;

import java.util.Scanner;

/**
 *
 * @author odavi
 */
public class AvaliacaoProjetoLogica01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int numHamburguer;
        double quantQueijo, quantPresunto, quantHamburguer, pesoQueijo, pesoPresunto, pesoHamburguer;
        
        pesoQueijo = 0.05;
        pesoPresunto = 0.05;
        pesoHamburguer = 0.1;
        
        System.out.println("Informe o número de hambúrgueres que se deseja fazer:");
        numHamburguer = teclado.nextInt();
        
        quantQueijo = 2*(numHamburguer * 0.05);
        quantPresunto = numHamburguer * 0.05;
        quantHamburguer = numHamburguer * 0.1;
        
        System.out.println("A quantidade de queijo necessário para se fazer os hambúrgueres é de: "+quantQueijo+"kg.");
        System.out.println("A quantidade de presunto necessário para se fazer os hambúrgueres é de: "+quantPresunto+"kg.");
        System.out.println("A quantidade de rodelas de hambúrguer necessárias para se fazer os hambúrgueres é de: "+quantHamburguer+"kg.");
    }
    
}
