/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.aavaloso.a03.pkg2;
import java.util.Scanner;
/**
 *
 * @author Angel Avalos
 */
public class SPPAAvalosOA032 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double a,b,c,d,e,f,g,h,pro,red;
       Scanner kb= new Scanner(System.in);
        System.out.println("Calculamos su promedio redondeando el resultado");
        System.out.println("Introduzca su primera calificacion");
        a=kb.nextDouble();
        System.out.println("Introduzca su Segunda calificacion");
        b=kb.nextDouble();
        System.out.println("Introduzca su tercera calificacion");
        c=kb.nextDouble();
        System.out.println("Introduzca su cuarta calificacion");
        d=kb.nextDouble();
        System.out.println("Introduzca su quinta calificacion");
        e=kb.nextDouble();
        System.out.println("Introduzca su sexta calificacion");
        f=kb.nextDouble();
        System.out.println("Introduzca su septima calificacion");
        g=kb.nextDouble();
        System.out.println("Introduzca su octava calificacion");
        h=kb.nextDouble();
        pro=(a+b+c+d+e+f+g+h)/8;
        red=Math.round(pro);
        System.out.println("Usted cuenta con un rpomedio de "+pro);
        System.out.println("Su promedio redondeado es de "+red);
        
    }
    
}
