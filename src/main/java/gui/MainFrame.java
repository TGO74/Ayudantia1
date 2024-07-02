package gui;

import javax.swing.*;
import java.awt.*;

import modelo.Categoria;
import modelo.Participante;
import modelo.Pelicula;
import modelo.Sistema;
import modelo.data.Datos;


public class MainFrame extends JFrame {
    private Sistema sistema;
    private Datos datos;

    public MainFrame() {
        datos = new Datos();
        sistema = new Sistema();

        for (Pelicula pelicula : datos.getPeliculas()) {
            sistema.addPelicula(pelicula);
        }
        for (Participante participante : datos.getParticipantes()) {
            sistema.addParticipante(participante);
        }
        for (Categoria categoria : datos.getCategorias()) {
            sistema.addCategoria(categoria);
        }

        initUI();
    }

    private void initUI() {
        setTitle("Premios de la Cinematografía Chilena");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTabbedPane tabbedPane = new JTabbedPane();

        PeliculasGanadorasPanel peliculasGanadorasPanel = new PeliculasGanadorasPanel(sistema);
        ActoresPorPeliculaPanel actoresPorPeliculaPanel = new ActoresPorPeliculaPanel(sistema);
        ParticipantesPanel participantesPanel = new ParticipantesPanel(sistema);

        tabbedPane.addTab("Películas Ganadoras", peliculasGanadorasPanel);
        tabbedPane.addTab("Actores por Película", actoresPorPeliculaPanel);
        tabbedPane.addTab("Participantes", participantesPanel);

        add(tabbedPane);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainFrame mainFrame = new MainFrame();
            mainFrame.setVisible(true);
        });
    }
}
