
package crotosa.learningjava;


/**
 *
 * @author santi
 */
public class Libro {
    
    String titulo;
    private int cantidad_paginas;
    protected String autor;
    String editorial;
    void abrir() {}
    void leer() {}
    void cerrar() {}
    void mostrarAtributos() {
        System.out.println(titulo+", "+cantidad_paginas+", "+autor+", "+editorial);
    }
    public Libro(){ }
    public Libro(String info){
        titulo = info;
    }
    public Libro (int cantidad_paginas, String autor, String editorial) {
        this.cantidad_paginas = cantidad_paginas;
        this.autor = autor;
        this.editorial = editorial;
    }
    public Libro (String titulo, int cantidad_paginas, String autor, String editorial) {
        this.titulo = titulo;
        this.cantidad_paginas = cantidad_paginas;
        this.autor = autor;
        this.editorial = editorial;
    }
    public Libro(int paginas){
        cantidad_paginas = paginas;
    }
    public int getCantidad_paginas (){
        return cantidad_paginas;
    }
    public void setCantidad_paginas(int cp){
        cantidad_paginas = cp;
    }
}
