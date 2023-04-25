/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package SERVICIO;

import ENTIDAD.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServicioRectangulo {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Rectangulo r = new Rectangulo();

    public Rectangulo crearRectangulo() {
        System.out.println("Ingrese la base del Rectangulo");
        r.setBase(leer.nextDouble());
        System.out.println("Ingrese la altura del Rectangulo");
        r.setAltura(leer.nextDouble());

        return r;
    }

    public double calcularSuperficie() {
        double superficie;
        superficie = r.getBase() * r.getAltura();
        System.out.println("La superficie del rectangulo es: " + superficie);
        return superficie;
    }

    public double calcularPerimetro() {
        double perimetro;
        perimetro = r.getBase() + (r.getAltura() * 2);
        System.out.println("El perimetro del rectangulo es: " + perimetro);
        return perimetro;
    }

    public void mostrarRectangulo() {

        for (int i = 0; i < r.getBase(); i++) {
            for (int j = 0; j < r.getAltura(); j++) {
                if (i == 0 || j == 0 || i == r.getBase() - 1 || j == r.getAltura() - 1) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }
}
         
     
     
    
