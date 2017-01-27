/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.ncortesd.t01p2;
import java.util.Scanner;
/**
 *
 * @author Nohely
 */
public class SPPNCortesDT01P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Calculadora de Áreas y perímetros de rectángulo");
        // Declaración de variables
        double b, h, A, P;
        //Indicar el uso de kb
        Scanner kb = new Scanner (System.in);
        System.out.println("Introduce la medida de la base");
        b= kb.nextDouble();
        System.out.println("Introduce la medida de la altura");
        h= kb.nextDouble();
        
        P= (2*b) + (2*h);
        A= b*h;
        //Mostrar resultados
        System.out.println("Área=" + A);
        System.out.println("Perímetro=" + P);
    }
    
}
