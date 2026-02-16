public class Punto1 {
    public static void main(String[] args) {

    int cantidadHomrbes = 23;
    int cantidadMujeres = 16;

    int totalEstudiates = cantidadHomrbes + cantidadMujeres;
    
    double porcentajeHombres = cantidadHomrbes * 100.0 / totalEstudiates;
    double porcentajeMujeres = cantidadMujeres * 100.0 / totalEstudiates;

    System.out.println("el porcentaje de hombres es: " + porcentajeHombres + "%");
    System.out.println("el porcentaje de mujeres es: " + porcentajeMujeres + "%");



    }

} 