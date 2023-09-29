/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.power;

/**
 *
 * @author hassn
 */
public class Power {

    public static void main(String[] args) {
          double  b = 2;
          int x =3;
          System.out.println("result of two number is = " + power (b,x));
         }
    //recursive function
    static double power (double b, int x){
    if ( x== 0) //base condition
        return 1;
    return(b * power(b,x-1));
   }
}