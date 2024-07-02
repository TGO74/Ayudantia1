package modelo;

public class Categoria {
    private String nombre;
    private Pelicula peliculaGanadora;

    public Categoria(String nombre) {
        this.nombre = nombre;
        this.peliculaGanadora = null;
    }

    public String getNombre() {
        return nombre;
    }

    public Pelicula getPeliculaGanadora() {
        return peliculaGanadora;
    }

    public void setPeliculaGanadora(Pelicula peliculaGanadora) {
        this.peliculaGanadora = peliculaGanadora;
    }
}
