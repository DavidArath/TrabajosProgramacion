class Persona{
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }
}

class PersonaCasa extends Persona{
    private String relacionCasa;
    private String integrantes;
    private String hobby;

    public PersonaCasa(String nombre, int edad, String relacionCasa, String integrantes, String hobby){
        super(nombre, edad);
        this.relacionCasa = relacionCasa;
        this.integrantes = integrantes;
        this.hobby = hobby;
    }

    public String getRelacionCasa(){
        return relacionCasa;
    }

    public void setRelacionCasa(String relacionCasa){
        this.relacionCasa = relacionCasa;
    }

    public String getIntegrantes(){
        return integrantes;
    }

    public void setIntegrantes(String integrantes){
        this.integrantes = integrantes;
    }

    public String getHobby(){
        return hobby;
    }

    public void setHobby(String hobby){
        this.hobby = hobby;
    }
}

class PersonaEscuela extends Persona{
    private int promedio;
    private String escuela;
    private String carrera;

    public PersonaEscuela(String nombre, int edad, int promedio, String escuela, String carrera){
        super(nombre, edad);
        this.promedio = promedio;
        this.escuela = escuela;
        this.carrera = carrera;
    }

    public int getPromedio(){
        return promedio;
    }

    public void setPromedio(int promedio){
        this.promedio = promedio;
    }

    public String getEscuela(){
        return escuela;
    }

    public void setEscuela(String escuela){
        this.escuela = escuela;
    }

    public String getCarrera(){
        return carrera;
    }

    public void setCarrera(String carrera){
        this.carrera = carrera;
    }
}

class PersonaTrabajo extends Persona{
    private String posicion;
    private String empresa;
    private int salario;

    public PersonaTrabajo(String nombre, int edad, String posicion, String empresa, int salario){
        super(nombre, edad);
        this.posicion = posicion;
        this.empresa = empresa;
        this.salario = salario;
    }

    public String getPosicion(){
        return posicion;
    }

    public void setPosicion(String posicion){
        this.posicion = posicion;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}

public class AbstraccionPersona {
    public static void main(String[] args) {
        Persona persona = new Persona("David", 21);
        PersonaCasa personaCasa = new PersonaCasa("Ricardo", 32, "Tio","2", "Musico");
        PersonaEscuela personaEscuela = new PersonaEscuela("Marco", 22, 85, "UABC", "Computacion");
        PersonaTrabajo personaTrabajo = new PersonaTrabajo("Josefa", 35, "Finanzas", "Costco", 15800);

        System.out.println("Datos de la Persona:");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + persona.getEdad());

        System.out.println("\nDatos de la Persona en el contexto de Casa:");
        System.out.println("Nombre: " + personaCasa.getNombre());
        System.out.println("Edad: " + personaCasa.getEdad());
        System.out.println("Relacion: " + personaCasa.getRelacionCasa());
        System.out.println("Integrantes Hogar: " + personaCasa.getIntegrantes());
        System.out.println("Hobby: " + personaCasa.getHobby());

        System.out.println("\nDatos de la Persona en el contexto de Escuela:");
        System.out.println("Nombre: " + personaEscuela.getNombre());
        System.out.println("Edad: " + personaEscuela.getEdad());
        System.out.println("Promedio: " + personaEscuela.getPromedio());
        System.out.println("Escuela: " + personaEscuela.getEscuela());
        System.out.println("Carrera: " + personaEscuela.getCarrera());

        System.out.println("\nDatos de la Persona en el contexto de Trabajo:");
        System.out.println("Nombre: " + personaTrabajo.getNombre());
        System.out.println("Edad: " + personaTrabajo.getEdad());
        System.out.println("Puesto: " + personaTrabajo.getPosicion());
        System.out.println("Empresa actual: " + personaTrabajo.getEmpresa());
        System.out.println("Salario: " + personaTrabajo.getSalario());
    }
}
