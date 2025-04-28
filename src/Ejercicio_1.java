import java.util.Scanner;

public class Ejercicio_1 {
    static Scanner sc = new Scanner(System.in);

    public static String[] registrarAlumnos() {
        System.out.println("Cuántos alumnos hay?");
        int numAlumnos = sc.nextInt();
        String[] alumnos = new String[numAlumnos];
        System.out.println("Introduzca los nombres");
        for (int i = 0; i < numAlumnos; i++) {
            alumnos[i] = sc.next();
        }
        return alumnos;
    }

    public static void verificarLongitud(String[] alumnos) {
        String maxAlumnos = alumnos[0];
        String minAlumnos = alumnos[0];
        for (int i = 1; i < alumnos.length; i++) {
            if (maxAlumnos.length() < alumnos[i].length()) {
                maxAlumnos = alumnos[i];
            }
            if (minAlumnos.length() > alumnos[i].length()) {
                minAlumnos = alumnos[i];
            }
        }
        System.out.println("El nombre más largo es " + maxAlumnos + " con " + maxAlumnos.length() + " letras.");
        System.out.println("El nombre más corto es " + minAlumnos + " con " + minAlumnos.length() + " letras.");
    }

    public static void main(String[] args) {
        verificarLongitud(registrarAlumnos());
    }
}