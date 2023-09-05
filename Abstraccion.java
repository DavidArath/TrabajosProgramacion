class PersonaFamilia{
    private String nombre;
    private int edad;
    private String relacion;
    private String integrantes;
    private String hobby;

    public PersonaFamilia(String nombre, int edad, String relacion, String integrantes, String hobby) {
        this.nombre = nombre;
        this.edad = edad;
        this.relacion = relacion;
        this.integrantes = integrantes;
        this.hobby = hobby;
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

    public String getRelacion(){
        return relacion;
    }

    public void setRelacion(String relacion){
        this.relacion = relacion;
    }
    
     public String getIntegrantes(){
        return integrantes;
    }

    public void setIntegrantes(String integrantes){
        this.integrantes = integrantes;
    }
    
    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby){
        this.hobby = hobby;
    }
}

class PersonaAlumno{
    private String nombre;
    private int edad;
    private int promedio;
    private String escuela;
    private String carrera;

    public PersonaAlumno(String nombre, int edad, int promedio, String escuela, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
        this.escuela = escuela;
        this.carrera = carrera;
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

class PersonaEmpleo{
    private String nombre;
    private int edad;
    private String posicion;
    private String empresa;
    private int salario;

    public PersonaEmpleo(String nombre, int edad, String posicion, String empresa, int salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
        this.empresa = empresa;
        this.salario = salario;
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
    
    public String getPosicion(){
        return posicion;
    }
    
    public void setPosicion(String posicion){
        this.posicion = posicion;
    }
    
    public String getEmpresa(){
        return empresa;
    }
    
    public void setEmpresa(String empresa){
        this.empresa = empresa;
    }
    
    public int getSalario(){
        return salario;
    }
    
    public void setSalario(int salario){
        this.salario = salario;
    }
}

public class Abstraccion {
    public static void main(String[] args) {
        PersonaFamilia personaFam = new PersonaFamilia("Juan", 40, "Padre", "3" , "Comercio");
        PersonaAlumno personaAlum = new PersonaAlumno("David", 21, 80, "UABC", "Computacion");
        PersonaEmpleo personaEmpleado = new PersonaEmpleo("Paul", 31, "Gerente", "Walmart", 10200);

        System.out.println("Datos de la Persona en el contexto de Familia/Casa:");
        System.out.println("Nombre: " + personaFam.getNombre());
        System.out.println("Edad: " + personaFam.getEdad());
        System.out.println("Relación: " + personaFam.getRelacion());
        System.out.println("Integrantes Hogar: " + personaFam.getIntegrantes());
        System.out.println("Hobby: " + personaFam.getHobby());

        System.out.println("\nDatos de la Persona en el contexto de Alumno:");
        System.out.println("Nombre: " + personaAlum.getNombre());
        System.out.println("Edad: " + personaAlum.getEdad());
        System.out.println("Promedio: " + personaAlum.getPromedio());
        System.out.println("Escuela: " + personaAlum.getEscuela());
        System.out.println("Carrera: " + personaAlum.getCarrera());

        System.out.println("\nDatos de la Persona en el contexto de Empleo:");
        System.out.println("Nombre: " + personaEmpleado.getNombre());
        System.out.println("Edad: " + personaEmpleado.getEdad());
        System.out.println("Puesto: " + personaEmpleado.getPosicion());
        System.out.println("Empresa actual: " + personaEmpleado.getEmpresa());
        System.out.println("Salario: " + personaEmpleado.getSalario());
    }
}
