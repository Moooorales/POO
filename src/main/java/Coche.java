import java.util.Scanner;
public class Coche extends Vehiculo {
    private int numPuertas;
    public Coche() {
    }
    public int getNumPuertas() {
        return numPuertas;
    }
    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
    public void mostrarDetalles() {
        detalles();
        System.out.println("Numero de puertas: " + numPuertas);
    }
    public static Coche crearCoche() {
        return new Coche();
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese la marca del coche: ");
            String marca = scanner.nextLine();

            System.out.print("Ingrese el modelo del coche: ");
            String modelo = scanner.nextLine();

            System.out.print("Ingrese el numero de puertas del coche: ");
            int numPuertas = scanner.nextInt();

            Coche coche = Coche.crearCoche();
            coche.setMarca(marca);
            coche.setModelo(modelo);
            coche.setNumPuertas(numPuertas);

            coche.mostrarDetalles();

            System.out.print("Ingrese la nueva marca del coche: ");
            scanner.nextLine(); 
            marca = scanner.nextLine();
            coche.setMarca(marca);

            System.out.print("Ingrese el nuevo modelo del coche: ");
            modelo = scanner.nextLine();
            coche.setModelo(modelo);

            System.out.print("Ingrese el nuevo numero de puertas del coche: ");
            numPuertas = scanner.nextInt();
            coche.setNumPuertas(numPuertas);

            coche.mostrarDetalles();
        }
    }
}
