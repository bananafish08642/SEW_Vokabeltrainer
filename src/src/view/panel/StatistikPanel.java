package view.panel;

import javax.swing.*;
import java.awt.*;

public class StatistikPanel extends JPanel {
    private final JButton zurueckButton = new JButton("Zurück zum Hauptmenü");
    private final JLabel titel = new JLabel("Statistik");

    public StatistikPanel() {
        this.setLayout(new BorderLayout(10, 10));

        titel.setHorizontalAlignment(SwingConstants.CENTER);
        titel.setFont(new Font("Arial", Font.BOLD, 28));
        this.add(titel, BorderLayout.NORTH);

        // Platzhalter für Statistik-Inhalt
        JTextArea statistikInhalt = new JTextArea("Hier kommen die detaillierten Statistiken hin...");
        statistikInhalt.setEditable(false);
        statistikInhalt.setFont(new Font("Monospaced", Font.PLAIN, 14));
        this.add(new JScrollPane(statistikInhalt), BorderLayout.CENTER);

        // Zurück-Button stylen
        zurueckButton.setFont(new Font("Arial", Font.PLAIN, 12));
        zurueckButton.setForeground(Color.GRAY);
        zurueckButton.setActionCommand("ZURUECK_HAUPTMENUE");
        this.add(zurueckButton, BorderLayout.SOUTH);

        this.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
    }

    public JButton getZurueckButton() {
        return zurueckButton;
    }
}