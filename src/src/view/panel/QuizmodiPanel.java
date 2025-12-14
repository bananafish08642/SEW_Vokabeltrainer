package view.panel;

import javax.swing.*;
import java.awt.*;

public class QuizmodiPanel extends JPanel {
    private final JButton zurueckButton = new JButton("Zurück zum Hauptmenü");
    private final JLabel titel = new JLabel("Quizmodus");

    public QuizmodiPanel() {
        this.setLayout(new BorderLayout(20, 20));

        titel.setHorizontalAlignment(SwingConstants.CENTER);
        titel.setFont(new Font("Arial", Font.BOLD, 28));
        this.add(titel, BorderLayout.NORTH);

        // Platzhalter für Quiz-Steuerung
        JLabel frageLabel = new JLabel("Hier erscheint die Quizfrage.", SwingConstants.CENTER);
        frageLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        this.add(frageLabel, BorderLayout.CENTER);

        // Button Container
        JPanel buttonContainer = new JPanel(new GridLayout(2, 2, 15, 15)); // Mehr Abstand
        Font optionFont = new Font("Arial", Font.PLAIN, 16);
        Color optionColor = new Color(240, 240, 240); // Hellgrau

        JButton a = new JButton("Antwort A"); a.setFont(optionFont); a.setBackground(optionColor);
        JButton b = new JButton("Antwort B"); b.setFont(optionFont); b.setBackground(optionColor);
        JButton c = new JButton("Antwort C"); c.setFont(optionFont); c.setBackground(optionColor);
        JButton d = new JButton("Antwort D"); d.setFont(optionFont); d.setBackground(optionColor);

        buttonContainer.add(a);
        buttonContainer.add(b);
        buttonContainer.add(c);
        buttonContainer.add(d);

        JPanel southPanel = new JPanel(new BorderLayout(10, 10));
        southPanel.add(buttonContainer, BorderLayout.CENTER);

        // Zurück-Button stylen
        zurueckButton.setFont(new Font("Arial", Font.PLAIN, 12));
        zurueckButton.setForeground(Color.GRAY);
        zurueckButton.setActionCommand("ZURUECK_HAUPTMENUE");
        southPanel.add(zurueckButton, BorderLayout.SOUTH);

        this.add(southPanel, BorderLayout.SOUTH);
        this.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
    }

    public JButton getZurueckButton() {
        return zurueckButton;
    }
}