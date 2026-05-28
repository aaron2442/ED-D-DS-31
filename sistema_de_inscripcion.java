import java.util.HashSet;
import java.util.Set;
public class sistema_de_inscripcion {

    record Estudiante(String nombre, String cedula, double promedio) {}

    public static void main(String[] args) {

        // Arreglo con 4 estudiantes
        Estudiante[] estudiantes = {
            new Estudiante("Ana", "8-123-456", 4.5),
            new Estudiante("Luis", "8-987-654", 3.8),
            new Estudiante("Carlos", "8-555-111", 4.2),
            new Estudiante("Maria", "8-222-333", 4.9)
        };

        // Imprimir nombre y promedio
        System.out.println("Lista de estudiantes:");
        for (Estudiante e : estudiantes) {
            System.out.println(e.nombre() + " - Promedio: " + e.promedio());
        }

        Set<String> cedulas = new HashSet<>();

        cedulas.add("8-123-456");
        cedulas.add("8-987-654");
        cedulas.add("8-555-111");
        cedulas.add("8-123-456"); 

        System.out.println("\nCédulas en el Set:");
        System.out.println(cedulas);

       
        double suma = 0;

        for (Estudiante e : estudiantes) {
            suma += e.promedio();
        }

        double promedioGeneral = suma / estudiantes.length;

        System.out.println("\nPromedio general del grupo: " + promedioGeneral);
    }
}   

