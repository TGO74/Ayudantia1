package modelo;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
    private List<Pelicula> peliculas;
    private List<Participante> participantes;
    private List<Categoria> categorias;

    public Sistema() {
        this.peliculas = new ArrayList<>();
        this.participantes = new ArrayList<>();
        this.categorias = new ArrayList<>();
    }

    public void addPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    public void addParticipante(Participante participante) {
        participantes.add(participante);
    }

    public void addCategoria(Categoria categoria) {
        categorias.add(categoria);
    }

    public List<Pelicula> getPeliculasGanadoras() {
        List<Pelicula> ganadoras = new ArrayList<>();
        for (Categoria categoria : categorias) {
            if (categoria.getPeliculaGanadora() != null) {
                ganadoras.add(categoria.getPeliculaGanadora());
            }
        }
        return ganadoras;
    }

    public List<Actor> getActoresPorPelicula(Pelicula pelicula) {
        return pelicula.getActores();
    }

    public List<Actor> getActoresPorPeliculaGanadora(Pelicula pelicula) {
        if (getPeliculasGanadoras().contains(pelicula)) {
            return pelicula.getActores();
        }
        return new ArrayList<>();
    }

    public List<Participante> getParticipantes() {
        return participantes;
    }

    public List<Pelicula> getPeliculas() {

        return peliculas;
    }
}
