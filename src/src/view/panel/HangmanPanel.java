package view.panel;

import javax.swing.*;
import java.awt.*;

public class HangmanPanel extends JPanel {
    private final JButton zurueckButton = new JButton("Zurück zum Hauptmenü");
    private final JLabel titel = new JLabel("Hangman spielen");

    public HangmanPanel() {
        this.setLayout(new BorderLayout(20, 20));

        titel.setHorizontalAlignment(SwingConstants.CENTER);
        titel.setFont(new Font("Arial", Font.BOLD, 28));
        this.add(titel, BorderLayout.NORTH);

        // Platzhalter für das Spielbrett
        JLabel spielstand = new JLabel(" _ _ _ _ _ _ ", SwingConstants.CENTER);
        spielstand.setFont(new Font("Monospaced", Font.BOLD, 48));
        spielstand.setForeground(new Color(50, 50, 150));
        this.add(spielstand, BorderLayout.CENTER);

        // Steuerung und Zurück-Button
        JPanel southPanel = new JPanel(new BorderLayout(10, 10));
        JTextField eingabeFeld = new JTextField("Buchstaben eingeben...", 20);
        eingabeFeld.setFont(new Font("Arial", Font.PLAIN, 16));
        southPanel.add(eingabeFeld, BorderLayout.NORTH);

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