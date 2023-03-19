package crotosa.learningjava;

import javax.swing.JOptionPane;

public class UnaFuncion {
    public static void main(String[] args) {
        
    int val = Integer.parseInt(JOptionPane.showInputDialog("ingresar un valor"));
    int array[] = funcion(val);
    for (int i=0;i<array.length; i++){
        System.out.println(array[i]);
        }
    }
    public static int [] funcion(int a) {
        int [] b = new int[3];
        b[0]= a-1; b[1] = a; b[2]=a+1;
        return b;
    }
}
