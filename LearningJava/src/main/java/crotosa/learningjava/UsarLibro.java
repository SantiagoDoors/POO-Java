package crotosa.learningjava;

public class UsarLibro {
 public static void main(String[] args) {
    Libro lib1 = new Libro();
    lib1.autor = "Borges";
    lib1.cantidad_paginas = 340;
    lib1.editorial = "Mundo";
    lib1.titulo = "La lampara";
    lib1.mostrarAtributos();
    System.out.println("libro2 ....");
    Libro lib2 = new Libro("Cenicienta");
    lib2.mostrarAtributos();
    System.out.println("libro 3 ....");
    Libro libTodos = new Libro("Manual tinta fresca", 220, "Varios", "Tinta Fresca");
    libTodos.mostrarAtributos();
    System.out.println("libro 4 ....");
    Libro libError = new Libro(330);
    libError.mostrarAtributos();
 }    
}
