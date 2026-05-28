public class promedio_class {

    // Record con 5 tareas
    record Estudiante(
            String nombre,
            double tarea1,
            double tarea2,
            double tarea3,
            double tarea4,
            double tarea5
    ) {

        // Método para calcular promedio individual
        double promedio() {
            return (tarea1 + tarea2 + tarea3 + tarea4 + tarea5) / 5;
        }
    }

    public static void main(String[] args) {

        // Arreglo de estudiantes
        Estudiante[] estudiantes = {
            new Estudiante("Ana", 90, 85, 88, 92, 95),
            new Estudiante("Luis", 70, 75, 80, 78, 74),
            new Estudiante("Maria", 95, 98, 97, 96, 99),
            new Estudiante("Carlos", 85, 82, 84, 80, 83)
        };

        double sumaClase = 0;

        // Mostrar promedio de cada estudiante
        System.out.println("Promedio de cada estudiante:");

        for (Estudiante e : estudiantes) {
            double promedio = e.promedio();

            System.out.println(e.nombre() + ": " + promedio);

            sumaClase += promedio;
        }

        // Promedio general de la clase
        double promedioClase = sumaClase / estudiantes.length;

        System.out.println("\nPromedio general de la clase: " + promedioClase);
    }
}
