package crotosa.learningjava;

public class Vehiculo {
    int puertas;
    String marcaModelo;
    String patente;
    float velocidad = 0;
    public float arranca (){
        velocidad = 100;
        return velocidad;
    }
    public void mostrarDatos(){
        System.out.println("Puertas: "+puertas);
        System.out.println("Modelo: "+marcaModelo);
        System.out.println("Patente: "+patente);
        System.out.println("Velocidad: "+velocidad);
    }
}
