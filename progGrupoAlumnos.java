import java.util.Scanner;
class Alumno
{
    String nombre;
    String matricula;
    String correo;
    String telefono;
    Double promedio;
 
	public void setNombre(String nom) {
	    nombre = nom;
	}
	
	public String getNombre(){
	    return nombre;
	}
	
	public void setMatricula(String matric){
	    matricula = matric;
	}
	
	public String getMatricula(){
	    return matricula;
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
	
	public void setPromedio(Double prom){
	    promedio = prom;
	}
	
	public Double getPromedio(){
	    return promedio;
	}
}

public class progGrupoAlumnos{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        Alumno[] grupoAlumnos = new Alumno[5];                //El tamaño del arreglo es fijo.
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
        for (int i = 0; i < grupoAlumnos.length; i++){
            System.out.println("------Alumno #" + (i+1) + "------");
            System.out.println("Nombre alumno: " + grupoAlumnos[i].getNombre());
            System.out.println("Matricula alumno: " + grupoAlumnos[i].getMatricula());
            System.out.println("Correo alumno: " + grupoAlumnos[i].getCorreo());
            System.out.println("Telefono alumno: " + grupoAlumnos[i].getTelefono());
            System.out.println("Promedio alumno: " + grupoAlumnos[i].getPromedio());
            System.out.println();
        }
    }
        
}