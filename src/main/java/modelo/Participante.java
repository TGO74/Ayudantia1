package modelo;

import java.time.LocalDate;

public class Participante {
    private String nombre;
    private LocalDate fechaNacimiento;

    public Participante(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
}
