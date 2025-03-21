import java.util.Scanner;

public class SuperMalHecho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numProductos = 5;

        String[] producto = new String[numProductos];
        double[] precio = new double[numProductos];
        double[] total = new double[numProductos];

        for (int i = 0; i < numProductos; i++) {
            System.out.println("Escriba el nombre del producto " + (i + 1) + ":");
            producto [i] = scanner.nextLine();

            System.out.println("Ingrese el precio del producto " + (i + 1) + ":");
            precio[i] = scanner.nextDouble();
            scanner.nextLine(); 

            double impuesto = precio[i] * 0.19;
            double descuento = (precio[i] > 10000) ? (precio[i] * 0.10) : 0;
        }

        double sumaTotal = 0;
        for (int i = 0; i < numProductos; i++) {
            System.out.println("Producto: " + producto[i] + ", Precio final: " + total[i]);
            sumaTotal += total[i]; 
        }
        System.out.println("El total de la compra es: " + sumaTotal);
    }
}
