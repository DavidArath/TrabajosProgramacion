import java.util.Scanner;
class Persona
{
    String nombre;
    String correo;
    String telefono;
 
	public void setNombre(String nom) {
	    nombre = nom;
	}
	public String getNombre(){
	    return nombre;
	}
	
	public void setCorreo(String cor){
	    correo = cor;
	}
	
	public String getCorreo(){
	    return correo;
	}
	
	public void setTelefono(String tel){
	    telefono = tel;
	}
	
	public String getTelefono(){
	    return telefono;
	}
	
	
}

class Alumno extends Persona{
    String matricula;
    Double promedio;
    
    public void setMatricula(String mat){
            matricula = mat;
        }
    public String getMatricula()
    {
        return matricula;
    }
    
    public void setPromedio(Double prom){
	    promedio = prom;
	}
	
	public Double getPromedio(){
	    return promedio;
	}
}

class Profesor extends Persona{
    int numEmpleado;
    int sueldo;
    
    public void setNumEmpleado(int numero){
        numEmpleado = numero;
    }
    
    public int getNumEmpleado(){
        return numEmpleado;
    }
    
    public void setSueldo(int sldo){
        sueldo = sldo;
    }
    
    public int getSueldo(){
        return sueldo;
    }
}

public class progGrupoAlumnoHerencia{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        Alumno[] grupoAlumnos = new Alumno[3];
        Profesor profesor = new Profesor();
        for (int i = 0; i < grupoAlumnos.length; i++){
            Alumno alumno = new Alumno();
            System.out.println("Ingrese los datos del alumno #" + (i+1));
            System.out.println("Nombre: ");
            alumno.setNombre(scanner.nextLine());
            System.out.println("Matricula: ");
            alumno.setMatricula(scanner.nextLine());
            System.out.println("Correo: ");
            alumno.setCorreo(scanner.nextLine());
            System.out.println("Telefono: ");
            alumno.setTelefono(scanner.nextLine());
            System.out.println("Promedio: ");
            alumno.setPromedio(Double.parseDouble(scanner.nextLine()));
            grupoAlumnos[i] = alumno;
            System.out.println();
            
        }
        System.out.println("Ingrese los datos del profesor");
        System.out.println("Nombre: ");
        profesor.setNombre(scanner.nextLine());
        System.out.println("Num. Empleado: ");
        profesor.setNumEmpleado(Integer.parseInt(scanner.nextLine()));
        System.out.println("Sueldo: ");
        profesor.setSueldo(Integer.parseInt(scanner.nextLine()));
        for (int i = 0; i < grupoAlumnos.length; i++){
            System.out.println("------Alumno #" + (i+1) + "------");
            System.out.println("Nombre alumno: " + grupoAlumnos[i].getNombre());
            System.out.println("Matricula alumno: " + grupoAlumnos[i].getMatricula());
            System.out.println("Correo alumno: " + grupoAlumnos[i].getCorreo());
            System.out.println("Telefono alumno: " + grupoAlumnos[i].getTelefono());
            System.out.println("Promedio alumno: " + grupoAlumnos[i].getPromedio());
            System.out.println();
        }
        System.out.println("Profesor del grupo: " + profesor.getNombre());
        System.out.println("Numero de empleado: " + profesor.getNumEmpleado());
        System.out.println("Sueldo Profesor: $" + profesor.getSueldo());
    }
}
