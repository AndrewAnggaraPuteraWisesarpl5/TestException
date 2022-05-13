/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic.java;

import java.util.Scanner;

/**
 *
 * @author Angga
 */
public class ArithmeticJava {
public static void main(String[] args) {
Scanner console = new Scanner(System.in);
System.out.println("Enter the value for c");
// Exception Handling
try{
int c = console.nextInt();
int res=c/0;
System.out.println(" The result is "+res);
}
catch (Exception exception_message){
System.out.println("adalah= "+exception_message);
}
}
}

  