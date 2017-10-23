/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classificartriangulo;

/**
 *
 * @author Usuario
 */

import java.util.Scanner;


public class ClassificarTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
       Scanner input=new Scanner(System.in);

        double A = nextDouble(), double B = nextDouble(), double C = nextDouble(),
                a=0, b=0, c=0;

        if(A>=B & A>=C){
            if(B<=C){
            a=A; b=C; c=B;
            }else{
            a=A; b=B; c=C;
            }
        }else if(C>=A & C>=B){
                if(A<=B){
                    a=C; b=B; c=A;
                }else{
                a=C; b=A; c=B;
                }
        }else if(B>=A & B>=C){
            if(A<=C){
            a=B; b=C; c=A;
            }else{
                a=B; b=A; c=C;
            }
        }

        if(a*a==(b*b+c*c))
            System.out.println("TRIANGULO RETANGULO");
        if(a>=(b+c))
            System.out.println("NAO FORMA TRIANGULO");
        if(a!=(b+c) && a*a>(b*b+c*c))
            System.out.println("TRIANGULO OBTUSANGULO");
        if(a*a<(b*b+c*c))
            System.out.println("TRIANGULO ACUTANGULO");
        if(a==b && c==b && a==a)
            System.out.println("TRIANGULO EQUILATERO");
        else if(a==b || b==c || a==c)
            System.out.println("TRIANGULO ISOSCELES");
        }
    }