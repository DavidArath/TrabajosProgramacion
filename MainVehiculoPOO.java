import java.util.Scanner;

class Motor {
    private String tipo;
    private int potencia;

    public Motor(String tipo, int potencia) {
        this.tipo = tipo;
        this.potencia = potencia;
    }

    public String getTipo() {
        return tipo;
    }

    public int getPotencia() {
        return potencia;
    }
}

class Transmision {
    private String tipo;
    private int numMarchas;

    public Transmision(String tipo, int numMarchas) {
        this.tipo = tipo;
        this.numMarchas = numMarchas;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNumMarchas() {
        return numMarchas;
    }
}

class Llanta {
    private String marca;
    private int diametro;

    public Llanta(String marca, int diametro) {
        this.marca = marca;
        this.diametro = diametro;
    }

    public String getMarca() {
        return marca;
    }

    public int getDiametro() {
        return diametro;
    }
}

class Vehiculo {
    private String marca;
    private String modelo;
    private Motor motor;
    private Transmision transmision;
    private Llanta[] llantas;

    public Vehiculo(String marca, String modelo, Motor motor, Transmision transmision, Llanta[] llantas) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.transmision = transmision;
        this.llantas = llantas;
    }

    public void imprimirDatosVehiculo() {
        System.out.println("Marca del vehiculo: " + marca);
        System.out.println("Modelo del vehiculo: " + modelo);
        System.out.println("Tipo de motor: " + motor.getTipo());
        System.out.println("Potencia del motor: " + motor.getPotencia() + " HP");
        System.out.println("Tipo de transmision: " + transmision.getTipo());
        System.out.println("Numero de marchas: " + transmision.getNumMarchas());

        System.out.println("Neumaticos del vehiculo:");
        for (int i = 0; i < llantas.length; i++) {
            System.out.println("Neumatico " + (i + 1) + ": Marca " + llantas[i].getMarca() + ", Diametro " + llantas[i].getDiametro() + " pulgadas");
        }
    }
}

public class MainVehiculoPOO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de llantas: ");
        int cantidadLlantas = scanner.nextInt();
        scanner.nextLine();
        Llanta[] llantas = new Llanta[cantidadLlantas];
        for (int i = 0; i < cantidadLlantas; i++) {
            System.out.println("Ingrese los detalles de la llanta " + (i + 1) + ":");
            System.out.print("Marca: ");
            String marca = scanner.nextLine();

            System.out.print("Diametro: ");
            int diametro = scanner.nextInt();
            scanner.nextLine();

            llantas[i] = new Llanta(marca, diametro);
        }
        System.out.println("Ingrese los detalles del vehículo:");
        System.out.print("Marca: ");
        String marcaVehiculo = scanner.nextLine();

        System.out.print("Modelo: ");
        String modeloVehiculo = scanner.nextLine();

        System.out.print("Tipo de motor: ");
        String tipoMotor = scanner.nextLine();

        System.out.print("Potencia del motor: ");
        int potenciaMotor = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Tipo de transmisión: ");
        String tipoTransmision = scanner.nextLine();

        System.out.print("Número de marchas: ");
        int numMarchas = scanner.nextInt();
        scanner.nextLine();
        Motor motor = new Motor(tipoMotor, potenciaMotor);
        Transmision transmision = new Transmision(tipoTransmision, numMarchas);
        Vehiculo coche = new Vehiculo(marcaVehiculo, modeloVehiculo, motor, transmision, llantas);
        coche.imprimirDatosVehiculo();

        scanner.close();
    }
}
