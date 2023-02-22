package Rectangulo;
import java.util.Scanner;

/**
 * @author Luis Tobon
 */

public class Main {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int op;
        
        do{
            
            //Objeto pared
            Rectangulo pared = new Rectangulo();
            System.out.print("\nIngrese el largo de la pared: ");
            double largoP = scan.nextDouble();
            pared.modificarLargo(largoP);
            System.out.print("Ingrese el ancho de la pared: ");
            double anchoP = scan.nextDouble();
            pared.modificarAncho(anchoP);
            //Area de la pared
            double areapared = pared.consultarLargo() * pared.consultarAncho();


            //Objeto ventana
            Rectangulo ventana = new Rectangulo();
            System.out.print("\nIngrese el largo de la ventana: ");
            double largoV = scan.nextDouble();
            ventana.modificarLargo(largoV);
            System.out.print("Ingrese el ancho de la ventana: ");
            double anchoV = scan.nextDouble();
            ventana.modificarAncho(anchoV);
            //Area de la ventana
            double areaventana = ventana.consultarLargo() * ventana.consultarAncho();


            //Calcular el tiempo para pintar 
            double areApintar = areapared - areaventana;
            double tiempoPintar = areApintar * 10;

            //Imprimir el resultado
            System.out.print("\nEl tiempo necesario para pintar la pared son " + tiempoPintar + " minutos\n");
            
            
            System.out.print("\nDesea hacer otra operacion?\n\n1. Si\n2. No\n\n");
            op = scan.nextInt();
            if(op != 1)
            {
                System.out.println("Saliendo...");
            }
            
        }while(op != 2 && op == 1);
        
    }
    
}
