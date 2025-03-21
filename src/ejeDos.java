import java.util.Scanner;

public class ejeDos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contadorEnRango = 0; 
        double acumuladoSueldos = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingresa el sueldo N°" + i + " : ");
            double sueldo = scanner.nextDouble();

            if (sueldo > 0) {

                if (sueldo >= 100 && sueldo <= 300) {
                    contadorEnRango++;
                    acumuladoSueldos += sueldo; 
                }
            } else {
                System.out.println("El sueldo no es el apropiado");
            }
        }

        System.out.println("los sueldos que se encuentren entre el rango de $100 a $300: " + contadorEnRango);
        System.out.println("Total acumulado de sueldos en el rango: " + (float)acumuladoSueldos); 
    }
}
