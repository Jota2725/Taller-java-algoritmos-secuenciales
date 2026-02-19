public class Punto10 {
    public static void main(String[] args) {
        double examenMat = 80;
        double tareaMat1 = 70;
        double tareaMat2 = 60;
        double tareaMat3 = 90;

        double promedioT_Mat = (tareaMat1 + tareaMat2 + tareaMat3) / 3;

        double finalMat = (examenMat * 0.9) + (promedioT_Mat * 0.1);

        double examenFis = 91;
        double tareaFis1 = 70;
        double tareaFis2 = 85;

        double promedioT_Fis = (tareaFis1 + tareaFis2) / 2;

        double finalFis = (examenFis * 0.8) + (promedioT_Fis * 0.2);


        double examenQuim = 70;
        double tareaQuim1 = 80;
        double tareaQuim2 = 65;
        double tareaQuim3 = 100;

        double promedioT_Quim = (tareaQuim1 + tareaQuim2 + tareaQuim3) / 3;

        double finalQuim = (examenQuim * 0.85) + (promedioT_Quim * 0.15);

        double promedioGeneral = (finalMat + finalFis + finalQuim) / 3;


        System.out.println("Su promedio en las 3 materias más difíciles es el siguiente:" 
        + "\nMatemáticas: " + finalMat
        + "\nFísica: " + finalFis
        + "\nQuímica: " + finalQuim

        );
        System.out.println("Su promedio general de esas 3 materias es:" + promedioGeneral);
        

        

        
        



    }
    
}
