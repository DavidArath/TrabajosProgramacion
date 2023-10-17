import java.util.Scanner;

class Profesor {
    private String nombreProfesor;

    public Profesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }
}

class Materia {
    private String nombreMateria;

    public Materia(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }
}

class Alumno {
    private String nombreAlumno;

    public Alumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }
}

class Grupo {
    private int idGrupo;
    private Materia materia;
    private Profesor profesor;
    private Alumno[] alumnos;

    public Grupo(int idGrupo, Materia materia, Profesor profesor, int cantidadAlumnos) {
        this.idGrupo = idGrupo;
        this.materia = materia;
        this.profesor = profesor;
        this.alumnos = new Alumno[cantidadAlumnos];
    }

    public void setAlumno(int index, Alumno alumno) {
        if (index >= 0 && index < alumnos.length) {
            alumnos[index] = alumno;
        }
    }

    public void imprimirDatosGrupo() {
        System.out.println("----------------------------------");
        System.out.println("ID del grupo: " + idGrupo);
        System.out.println("Nombre de la materia: " + materia.getNombreMateria());
        System.out.println("Nombre del profesor: " + profesor.getNombreProfesor());
        System.out.println("Lista de alumnos:");

        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Alumno " + (i + 1) + ": " + alumnos[i].getNombreAlumno());
        }
        System.out.println("----------------------------------");
    }
}

public class MainGrupoPOO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ID del grupo: ");
        int idGrupo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese el nombre de la materia: ");
        String nombreMateria = scanner.nextLine();

        System.out.print("Ingrese el nombre del profesor: ");
        String nombreProfesor = scanner.nextLine();

        System.out.print("Ingrese la cantidad de alumnos: ");
        int cantidadAlumnos = scanner.nextInt();

        Grupo grupo = new Grupo(idGrupo, new Materia(nombreMateria), new Profesor(nombreProfesor), cantidadAlumnos);

        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.print("Ingrese el nombre del alumno " + (i + 1) + ": ");
            String nombreAlumno = scanner.next();
            grupo.setAlumno(i, new Alumno(nombreAlumno));
        }

        grupo.imprimirDatosGrupo();

        scanner.close();
    }
}
