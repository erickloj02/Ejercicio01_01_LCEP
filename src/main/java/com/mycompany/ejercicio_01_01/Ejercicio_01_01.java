/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio_01_01;

/**
 *
 * @author PC
 */
public class Ejercicio_01_01 {

    public static void main(String[] args) {
        
        System.out.println("Ejercicio_01_01");
        
        var carros = new Carro();
        carros.marca = "Ferrari";
        carros.color = "Rojo";
        
        var estudiantes = new Estudiante();
        estudiantes.nombre = "Erick Lojano";
        estudiantes.carrera = "Ingenieria Electronica";
        
        var perros = new Perro();
        perros.nombre = "Max";
        perros.raza = "Pastor Aleman";
        
        var zapatos = new Zapatos();
        zapatos.marca = "Adidas";
        zapatos.tamaño = 38;
        
        System.out.println("La marca del carro es:"+carros.marca);
        System.out.println("Su color es:"+carros.color);
        
        System.out.println("El estudiante se llama:"+estudiantes.nombre);
        System.out.println("Estudia la carrera de:"+estudiantes.carrera);
        
        System.out.println("El perro se llama:"+perros.nombre);
        System.out.println("Su raza es:"+perros.raza);
        
        System.out.println("La marca del zapato es:"+zapatos.marca);
        System.out.println("Es de tamaño:"+zapatos.tamaño);
    }
}
