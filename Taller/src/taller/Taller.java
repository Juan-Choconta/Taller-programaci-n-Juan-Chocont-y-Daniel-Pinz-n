/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author juand
 */
public class Taller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        Scanner x = new Scanner (System.in);
        Scanner y = new Scanner (System.in);
        Scanner h = new Scanner (System.in);
        Scanner s = new Scanner (System.in);
        ArrayList <String> Nombres = new ArrayList();
        ArrayList <String> Nombres2 = new ArrayList();
        ArrayList <String> Temperaturas = new ArrayList();
        
        String nombre;
        String respuesta, respuesta1;
        int n;
        int temperatura;
        String parentesco;
        int edad;
        
        do{
        System.out.println("Ingrese un nombre: ");
        nombre=x.nextLine();
        System.out.println("Ingrese el parentesco: ");
        parentesco=y.nextLine();
        System.out.println("Ingrese la edad: ");
        edad=entrada.nextInt();
        Nombres.add(nombre+" "+parentesco+" "+edad);
        Nombres2.add(nombre);
        
        System.out.println("Desea agregar otra persona? (Si-No) ");
        respuesta=h.nextLine();
      
        }while("si".equals(respuesta) || "Si".equals(respuesta));
        
        do{
        for(int i=0;i<Nombres.size();i++){
        System.out.println(""+i+". "+Nombres.get(i));
        }
        
        System.out.println("Escoja la persona para ingresar la temperatura ");
        n=entrada.nextInt();
        System.out.println("Escogió: "+Nombres.get(n));
        
        do{
        System.out.println("Ingrese una temperatura: ");
        temperatura=entrada.nextInt();
        Temperaturas.add(temperatura+" "+Nombres2.get(n));
        
        System.out.println("Desea agregar otra temperatura? (Si-No) o desea ver el listado? (listado) ");
        respuesta1=s.nextLine();
        
        
        }while("si".equals(respuesta1) || "Si".equals(respuesta1));
        }while("no".equals(respuesta1) || "No".equals(respuesta1));
        
        
        System.out.println(" ");
        System.out.println("Integrantes de la familia ");
        System.out.println(" ");
        
        for(int i=0;i<Nombres.size();i++){
        System.out.println(Nombres.get(i));
        }
        
        System.out.println(" ");
        System.out.println("Lista de temperaturas de los integrantes de la familia ");
        System.out.println(" ");


        for(int i=0;i<Temperaturas.size();i++){
        System.out.println(Temperaturas.get(i));
        }
    }
    
}
