package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import modelo.Actor;
import modelo.Pelicula;
import modelo.Sistema;

public class ActoresPorPeliculaPanel extends JPanel {
    private Sistema sistema;

    public ActoresPorPeliculaPanel(Sistema sistema) {
        this.sistema = sistema;
        initUI();
    }

    private void initUI() {
        setLayout(new BorderLayout());

        JComboBox<Pelicula> peliculaComboBox = new JComboBox<>();
        for (Pelicula pelicula : sistema.getPeliculas()) {
            peliculaComboBox.addItem(pelicula);
        }

        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);

        peliculaComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pelicula selectedPelicula = (Pelicula) peliculaComboBox.getSelectedItem();
                List<Actor> actores = sistema.getActoresPorPelicula(selectedPelicula);

                textArea.setText("");
                for (Actor actor : actores) {
                    textArea.append("Nombre: " + actor.getNombre() + "\n");
                    textArea.append("Fecha de Nacimiento: " + actor.getFechaNacimiento() + "\n\n");
                }
            }
        });

        add(peliculaComboBox, BorderLayout.NORTH);
        add(new JScrollPane(textArea), BorderLayout.CENTER);
    }
}
