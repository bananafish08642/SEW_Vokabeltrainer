package view.panel;

import javax.swing.*;
import java.awt.*;

public class LernmodiPanel extends JPanel{
    private final JLabel frageLabel = new JLabel();
    private final JLabel antwortLabel = new JLabel();
    private final JButton anzeigenButton = new JButton("Antwort anzeigen");
    private final JButton gewusstButton = new  JButton("Gewusst");
    private final JButton nichtGewusstButton = new JButton("Nicht Gewusst");
    private final JButton zurueckButton = new JButton("Zurück zum Hauptmenü");

    public LernmodiPanel() {
        this.setLayout(new BorderLayout(30,30)); // Größere Abstände
        createContent();
        setContentLayout();
    }

    public void createContent() {
        // Button-Styling
        Font actionFont = new Font("Arial", Font.BOLD, 16);

        anzeigenButton.setFont(actionFont);
        anzeigenButton.setBackground(new Color(255, 165, 0)); // Orange
        anzeigenButton.setForeground(Color.BLACK);
        anzeigenButton.setOpaque(true);
        anzeigenButton.setBorderPainted(false);
        anzeigenButton.setActionCommand("Antwort");

        gewusstButton.setFont(actionFont);
        gewusstButton.setBackground(new Color(60, 179, 113)); // Medium Sea Green
        gewusstButton.setForeground(Color.WHITE);
        gewusstButton.setOpaque(true);
        gewusstButton.setBorderPainted(false);
        gewusstButton.setActionCommand("Gewusst");

        nichtGewusstButton.setFont(actionFont);
        nichtGewusstButton.setBackground(new Color(220, 20, 60)); // Crimson (Rot)
        nichtGewusstButton.setForeground(Color.WHITE);
        nichtGewusstButton.setOpaque(true);
        nichtGewusstButton.setBorderPainted(false);
        nichtGewusstButton.setActionCommand("Nicht Gewusst");

        // Zurück-Button unauffälliger
        zurueckButton.setFont(new Font("Arial", Font.PLAIN, 12));
        zurueckButton.setForeground(Color.GRAY);
        zurueckButton.setActionCommand("ZURUECK_HAUPTMENUE");
    }

    public void setContentLayout() {
        // Allgemeine Schriftgröße für Textfelder
        Font textFont = new Font("Arial", Font.PLAIN, 20);

        // Frage Container
        frageLabel.setFont(new Font("Arial", Font.BOLD, 24));
        JPanel frageContainer = new JPanel();
        frageContainer.add(frageLabel);
        this.add(frageContainer,BorderLayout.NORTH);

        // Antwort Container
        antwortLabel.setFont(textFont);
        antwortLabel.setForeground(new Color(70, 130, 180));
        JPanel antwortContainer = new JPanel();
        antwortContainer.add(antwortLabel);
        this.add(antwortContainer,BorderLayout.CENTER);

        // Button Container
        JPanel buttons = new  JPanel(new FlowLayout(FlowLayout.CENTER, 15, 5)); // Mehr Abstand zwischen Buttons
        buttons.add(anzeigenButton);
        buttons.add(gewusstButton);
        buttons.add(nichtGewusstButton);

        // SOUTH Panel für Buttons und Zurück-Button
        JPanel southPanel = new JPanel(new BorderLayout(10, 10));
        southPanel.add(buttons, BorderLayout.CENTER);
        southPanel.add(zurueckButton, BorderLayout.SOUTH);

        // Padding
        this.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        this.add(southPanel, BorderLayout.SOUTH);
    }

    public JButton getZurueckButton() {
        return zurueckButton;
    }

    // ... Methoden (setFrage, setAntwort, antwortAnzeigen, naechsteFrage) bleiben unverändert
    public void setFrage(String frage) {
        frageLabel.setText(frage);
    }
    public void setAntwort(String antwort) {
        antwortLabel.setText(antwort);
    }
    public void antwortAnzeigen() {
        antwortLabel.setVisible(true);
        gewusstButton.setVisible(true);
        nichtGewusstButton.setVisible(true);
    }

    public void naechsteFrage() {
        antwortLabel.setVisible(false);
        gewusstButton.setVisible(false);
        nichtGewusstButton.setVisible(false);
    }
}