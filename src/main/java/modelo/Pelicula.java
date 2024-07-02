package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pelicula {
    private String titulo;
    private LocalDate fechaEstreno;
    private int duracion;
    private String sinopsis;
    private Director director;
    private List<Actor> actores;

    public Pelicula(String titulo, LocalDate fechaEstreno, int duracion, String sinopsis, Director director) {
        this.titulo = titulo;
        this.fechaEstreno = fechaEstreno;
        this.duracion = duracion;
        this.sinopsis = sinopsis;
        this.director = director;
        this.actores = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public LocalDate getFechaEstreno() {
        return fechaEstreno;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public Director getDirector() {
        return director;
    }

    public List<Actor> getActores() {
        return actores;
    }

    public void addActor(Actor actor) {
        actores.add(actor);
    }
}
