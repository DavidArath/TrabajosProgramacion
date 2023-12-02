abstract class Figura{
    protected double x;
    protected double y;
    
    public Figura(double x, double y){ 
        this.x = x;
        this.y = y;
    }
    
    public abstract double calcularArea();
    public abstract double calcularPerimetro(); 
}


interface Dibujable{
    public void dibujar();
    public void otroMetodoDibujable(); 
}

interface Rotable{
    public void rotar(int grados);
    public void otroMetodoRotable();
}

class Rectangulo extends Figura implements Dibujable, Rotable {
    private double base;
    private double altura;

    public Rectangulo(double x, double y, double base, double altura) {
        super(x, y);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return this.base;
    }

    public double getAltura() {
        return this.altura;
    }

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    public void dibujar() {
        System.out.println("Imagíname DIBUJADO: soy UN RECTÁNGULO");
    }

    public void rotar(int grados) {
        System.out.println("Imagíname ROTADO " + grados + " GRADOS: soy UN RECTÁNGULO");
    }

    public void otroMetodoDibujable() {
        System.out.println("Otro método en Dibujable para el Rectángulo");
    }

    public void otroMetodoRotable() {
        System.out.println("Otro método en Rotable para el Rectángulo");
    }
}

class Circulo extends Figura implements Dibujable, Rotable{
    private double radio;

    public Circulo(double x, double y, double radio){
        super(x,y);
        this.radio = radio;
    }
    
    public double calcularArea(){
        return Math.PI*radio*radio;
    }
    public double getRadio() {
        return this.radio;
    }

    public double calcularPerimetro(){
        return 2*Math.PI*radio;
    }

    public void dibujar(){
        System.out.println("Imaginame DIBUJADO: soy UN CIRCULO");
    }    
    
    public void rotar(int grados){
        System.out.println("Imaginame ROTADO " + grados +" GRADOS: soy UN CIRCULO");
    }

    public void otroMetodoDibujable(){
        System.out.println("Otro metodo en Dibujable para el Círculo");
    }

    public void otroMetodoRotable(){
        System.out.println("Otro metodo en Rotable para el Círculo");
    }
}

class Cuadrado extends Figura implements Dibujable, Rotable{
    private double lado;
    public Cuadrado(double x, double y, double lado){
        super(x,y);
        this.lado = lado;
    }
    
    public double getLado() {
        return this.lado;
    }

    public double calcularArea(){
        return lado*lado;
    }

    public double calcularPerimetro(){
        return 4*lado;
    }
    
    public void dibujar(){
        System.out.println("Imaginame DIBUJADO: soy UN CUADRADO");
    }
    
    public void rotar(int grados){
        System.out.println("Imaginame ROTADO " + grados +" GRADOS: soy UN CUADRADO");
    }

    public void otroMetodoDibujable(){
        System.out.println("Otro metodo en Dibujable para el Cuadrado");
    }

    public void otroMetodoRotable(){
        System.out.println("Otro metodo en Rotable para el Cuadrado");
    }
}

class Triangulo extends Figura implements Dibujable, Rotable{
    public double base;    
    public double altura;

    public Triangulo(double x, double y, double base, double altura){
        super(x,y);
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea(){
        return (base*altura)/2;
    }

    public double calcularPerimetro(){
        return base+altura+ Math.sqrt(base*base + altura*altura);
    }
    
    public void dibujar(){
        System.out.println("Imaginame DIBUJADO: soy UN TRIANGULO");
    }
    
    public void rotar(int grados){
        System.out.println("Imaginame ROTADO " + grados +" GRADOS: soy UN TRIANGULO");    
    }

    public void otroMetodoDibujable(){
        System.out.println("Otro metodo en Dibujable para el Triangulo");
    }

    public void otroMetodoRotable(){
        System.out.println("Otro metodo en Rotable para el Triángulo");
    }
}

public class FigurasPOO{
    public static void main(String args[]){
        Rectangulo rec = new Rectangulo(200.0, 235.0, 30.0, 15.0);
        Circulo cir = new Circulo(200.0, 235.0, 23.5);
        Cuadrado cua = new Cuadrado(200.0, 235.0, 23.5);
        Triangulo tri = new Triangulo(200.0, 235.0, 23.5, 16.5);

        System.out.println("Atributos del Circulo:");
        System.out.println("Coordenadas (x, y): (" + cir.x + ", " + cir.y + ")");
        System.out.println("Radio: " + cir.getRadio());

        System.out.println("\nAtributos del Cuadrado:");
        System.out.println("Coordenadas (x, y): (" + cua.x + ", " + cua.y + ")");
        System.out.println("Lado: " + cua.getLado());

        System.out.println("\nAtributos del Triangulo:");
        System.out.println("Coordenadas (x, y): (" + tri.x + ", " + tri.y + ")");
        System.out.println("Base: " + tri.base);
        System.out.println("Altura: " + tri.altura);

        System.out.println("\nAreas y Perimetros:");
        System.out.println("Area del Circulo: "+ cir.calcularArea());
        System.out.println("Perímetro del Circulo: "+ cir.calcularPerimetro());
        
        System.out.println("\nArea del Cuadrado: "+ cua.calcularArea());
        System.out.println("Perimetro del Cuadrado: "+ cua.calcularPerimetro());
        
        System.out.println("\nArea del Triangulo: "+ tri.calcularArea());
        System.out.println("Perimetro del Triangulo: "+ tri.calcularPerimetro());
        System.out.println("\n");

        cir.dibujar();
        cir.rotar(20);
        System.out.println("\n");
        cir.otroMetodoDibujable();
        cir.otroMetodoRotable();
        System.out.println("\n");
        cua.dibujar();
        cua.rotar(20);
        System.out.println("\n");
        cua.otroMetodoDibujable();
        cua.otroMetodoRotable();
        System.out.println("\n");
        tri.dibujar();
        tri.rotar(20);
        System.out.println("\n");
        tri.otroMetodoDibujable();
        tri.otroMetodoRotable();
        
        System.out.println("\nArea y Perimetro del Rectangulo:");
        System.out.println("Area del Rectangulo: " + rec.calcularArea());
        System.out.println("Perimetro del Rectangulo: " + rec.calcularPerimetro());
        System.out.println("\n");
        rec.dibujar();
        rec.rotar(30);
        System.out.println("\n");
        rec.otroMetodoDibujable();
        rec.otroMetodoRotable();
    }
}
