package modelo.data;


import modelo.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Datos {
    private List<Pelicula> peliculas;
    private List<Participante> participantes;
    private List<Categoria> categorias;

    public Datos() {
        this.peliculas = new ArrayList<>();
        this.participantes = new ArrayList<>();
        this.categorias = new ArrayList<>();
        cargarDatos();
    }

    private void cargarDatos() {
        // Aquí se deben cargar datos de ejemplo o desde una fuente externa

        // Ejemplo de datos
        Director director1 = new Director("Pedro Almodóvar", LocalDate.of(1949, 9, 25));
        Director director2 = new Director("Alejandro González Iñárritu", LocalDate.of(1963, 8, 15));

        Actor actor1 = new Actor("Antonio Banderas", LocalDate.of(1960, 8, 10));
        Actor actor2 = new Actor("Penélope Cruz", LocalDate.of(1974, 4, 28));
        Actor actor3 = new Actor("Gael García Bernal", LocalDate.of(1978, 11, 30));
        Actor actor4 = new Actor("Salma Hayek", LocalDate.of(1966, 9, 2));

        Pelicula pelicula1 = new Pelicula("Todo sobre mi madre", LocalDate.of(1999, 4, 8), 101, "Lorem ipsum dolor sit amet...", director1);
        pelicula1.addActor(actor1);
        pelicula1.addActor(actor2);

        Pelicula pelicula2 = new Pelicula("Babel", LocalDate.of(2006, 9, 8), 143, "Lorem ipsum dolor sit amet...", director2);
        pelicula2.addActor(actor3);
        pelicula2.addActor(actor4);

        peliculas.add(pelicula1);
        peliculas.add(pelicula2);

        participantes.add(director1);
        participantes.add(director2);
        participantes.add(actor1);
        participantes.add(actor2);
        participantes.add(actor3);
        participantes.add(actor4);

        Categoria categoria1 = new Categoria("Mejor Película");
        categoria1.setPeliculaGanadora(pelicula1);

        categorias.add(categoria1);
    }

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public List<Participante> getParticipantes() {
        return participantes;
    }

    public List<Categoria> getCategorias() {

        return categorias;

    }
}
