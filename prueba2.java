public class prueba2 {
    public static void main(String[] args) {
        int[] calificaciones = {70, 80, 90, 88, 100};
        int sum = 0;

        for (int calificacion : calificaciones) {
            sum += calificacion;
        }

        double promedio = (double) sum / calificaciones.length;

        if (promedio >= 60) {
            System.out.println("El estudiante ha aprobado con un promedio de " + promedio);
        } else {
            System.out.println("El estudiante NO ha aprobado con un promedio de " + promedio);
        }
    }
}
