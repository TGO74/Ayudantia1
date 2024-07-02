package modelo;



import java.time.LocalDate;

public class Director extends Participante {
    private boolean aviso;

    public Director(String nombre, LocalDate fechaNacimiento) {
        super(nombre, fechaNacimiento);
        this.aviso = false;
    }

    public boolean getAviso() {
        return aviso;
    }

    public void setAviso(boolean aviso) {
        this.aviso = aviso;
    }
}
