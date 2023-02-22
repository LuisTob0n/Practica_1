package Rectangulo;

/**
 * @author Luis Tobon
 */

public class Rectangulo {
    
    private double largo, ancho;
    
    Rectangulo(){
    }

    public double consultarLargo() {
        return largo;
    }

    public void modificarLargo(double largo) {
        this.largo = largo;
    }

    public double consultarAncho() {
        return ancho;
    }

    public void modificarAncho(double ancho) {
        this.ancho = ancho;
    }
    
}
