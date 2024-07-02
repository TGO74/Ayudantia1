package gui;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import modelo.Pelicula;
import modelo.Sistema;

public class PeliculasGanadorasPanel extends JPanel {
    private Sistema sistema;

    public PeliculasGanadorasPanel(Sistema sistema) {
        this.sistema = sistema;
        initUI();
    }

    private void initUI() {
        setLayout(new BorderLayout());

        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);

        List<Pelicula> ganadoras = sistema.getPeliculasGanadoras();
        for (Pelicula pelicula : ganadoras) {
            textArea.append("Título: " + pelicula.getTitulo() + "\n");
            textArea.append("Fecha de Estreno: " + pelicula.getFechaEstreno() + "\n");
            textArea.append("Duración: " + pelicula.getDuracion() + " minutos\n");
            textArea.append("Director: " + pelicula.getDirector().getNombre() + "\n");
            textArea.append("Sinopsis: " + pelicula.getSinopsis() + "\n\n");
        }

        add(new JScrollPane(textArea), BorderLayout.CENTER);
    }
}
