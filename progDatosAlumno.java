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

public class progDatosAlumno{
    public static void main(String args[]){
        Alumno al1 = new Alumno();
        al1.setNombre("David Arath Cruz");
        al1.setMatricula("1272458");
        al1.setCorreo("david.arath.cruz@uabc.edu.mx");
        al1.setTelefono("664-182-9192");
        al1.setPromedio(88.76);
        System.out.println("Nombre alumno: " + al1.getNombre());
        System.out.println("Matricula alumno: " + al1.getMatricula());
        System.out.println("Correo alumno: " + al1.getCorreo());
        System.out.println("Telefono alumno: " + al1.getTelefono());
        System.out.println("Promedio alumno: " + al1.getPromedio());
    }
        
}