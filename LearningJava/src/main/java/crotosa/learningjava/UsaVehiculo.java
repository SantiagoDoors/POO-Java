package crotosa.learningjava;

public class UsaVehiculo {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo();
        v1.patente = "AB 123 VZ";
        v1.marcaModelo = "Chevrolet Corsa";
        v1.puertas = 5;
        v1.velocidad = v1.arranca();
        v1.mostrarDatos();
    }
}
