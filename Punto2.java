public class Punto2 {
    public static void main(String[] args) {


        int mesActual = 2;
        int diaActual = 15;
        int anoActual = 2026;

        int diaNac = 25;
        int mesNac = 3;
        int anoNac = 2004;

        int fechaActualEntero = (anoActual * 10000) + (mesActual * 100) + diaActual;
        int fechaNacEntero = (anoNac * 10000) + (mesNac * 100) + diaNac;

        int edad = (fechaActualEntero - fechaNacEntero) / 10000;

        System.out.println("Su edad exacta es: " + edad + " años.");


    


    }
    
}
