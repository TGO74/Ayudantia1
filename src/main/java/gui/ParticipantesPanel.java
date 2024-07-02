package gui;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import modelo.Participante;
import modelo.Sistema;

public class ParticipantesPanel extends JPanel {
    private final Sistema sistema;

    public ParticipantesPanel(Sistema sistema) {
        this.sistema = sistema;
        initUI();
    }

    private void initUI() {
        setLayout(new BorderLayout());

        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);

        List<Participante> participantes = sistema.getParticipantes();
        for (Participante participante : participantes) {
            textArea.append("Nombre: " + participante.getNombre() + "\n");
            textArea.append("Fecha de Nacimiento: " + participante.getFechaNacimiento() + "\n\n");
        }

        add(new JScrollPane(textArea), BorderLayout.CENTER);
    }
}
