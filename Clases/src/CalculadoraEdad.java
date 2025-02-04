package Clases.src;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

class Persona {
    private String nombre;
    private LocalDate fechaNacimiento;

    // Constructor
    public Persona(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Método para calcular la edad
    public int calcularEdad() {
        LocalDate hoy = LocalDate.now();
        return Period.between(fechaNacimiento, hoy).getYears();
    }

    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + calcularEdad() + " años");
    }
}

public class CalculadoraEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir datos al usuario
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su fecha de nacimiento (YYYY-MM-DD): ");
        LocalDate fechaNacimiento = LocalDate.parse(scanner.nextLine());

        // Crear objeto Persona y mostrar información
        Persona persona = new Persona(nombre, fechaNacimiento);
        persona.mostrarInformacion();

        scanner.close();
    }
}
