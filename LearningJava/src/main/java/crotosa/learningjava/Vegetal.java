package crotosa.learningjava;

public class Vegetal {
    public String fruto;
    private String estacion;
    protected int num_frutos;
    
    public Vegetal (){ }
    public Vegetal (String fruto, String estacion, int num_frutos){
        this.fruto = fruto;
        this.estacion = estacion;
        this.num_frutos = num_frutos;
    }
    public void mostrarDatos(){
        System.out.println(fruto+", "+estacion+", "+num_frutos);
    }
    public String getEstacion(){
        return estacion;
    }
    public void setEstacion(String es){
        estacion = es;
    }
    public int getNum_frutos(){
        return num_frutos;
    }
    public void setNum_frutos(int nm){
        this.num_frutos = nm;
    }
}
