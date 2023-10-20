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

class Neumatico {
    private String marca;
    private int diametro;

    public Neumatico(String marca, int diametro) {
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
    private Neumatico[] neumaticos;

    public Vehiculo(String marca, String modelo, Motor motor, Transmision transmision, Neumatico[] neumaticos) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.transmision = transmision;
        this.neumaticos = neumaticos;
    }

    public void imprimirDatosVehiculo() {
        System.out.println("Marca del vehiculo: " + marca);
        System.out.println("Modelo del vehiculo: " + modelo);
        System.out.println("Tipo de motor: " + motor.getTipo());
        System.out.println("Potencia del motor: " + motor.getPotencia() + " HP");
        System.out.println("Tipo de transmision: " + transmision.getTipo());
        System.out.println("Numero de marchas: " + transmision.getNumMarchas());

        System.out.println("Neumaticos del vehiculo:");
        for (int i = 0; i < neumaticos.length; i++) {
            System.out.println("Neumatico " + (i + 1) + ": Marca " + neumaticos[i].getMarca() + ", Diametro " + neumaticos[i].getDiametro() + " pulgadas");
        }
    }
}

public class MainVehiculoPOO {
    public static void main(String[] args) {
        Motor motor = new Motor("Gasolina", 200);
        Transmision transmision = new Transmision("Automatica", 6);
        Neumatico[] neumaticos = {
            new Neumatico("Michelin", 17),
            new Neumatico("Goodyear", 17),
            new Neumatico("Michelin", 17),
            new Neumatico("Goodyear", 17)
        };

        Vehiculo coche = new Vehiculo("Toyota", "Corolla", motor, transmision, neumaticos);

        coche.imprimirDatosVehiculo();
    }
}
