package crotosa.learningjava;
public class Objeto {
    public static void main(String[] args) {
        Libro l1 = new Libro();
        l1.titulo = "Las Golondrinas";
        l1.cantidad_paginas = 160;
        System.out.println("Libro: "+l1.titulo);
        System.out.println("Cantidad de páginas: "+l1.cantidad_paginas);
    }
}
