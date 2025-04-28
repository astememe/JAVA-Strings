import java.util.Scanner;

public class Ejercicio_2 {
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

    public static void mostrarAlumnos(String[] alumnos) {
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println(alumnos[i].toUpperCase());
        }
    }

    public static void main (String[]args){
        mostrarAlumnos(registrarAlumnos());
    }
}
