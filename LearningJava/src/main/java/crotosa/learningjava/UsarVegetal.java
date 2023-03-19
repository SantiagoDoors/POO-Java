package crotosa.learningjava;

public class UsarVegetal {
    public static void main(String[] args) {
     
    Vegetal v1= new Vegetal("manzana", "verano", 1200);
        System.out.println("la estacion es: "+v1.getEstacion());    
        v1.mostrarDatos();
    }
}
