package view.panel;

import javax.swing.*;
import java.awt.*;

/**
 * @author Felix Stutzenberger
 * @version 1.0.0
 * @date 12.12.2025
 */
public class HauptmenuePanel extends JPanel{
    private JPanel hauptpanel;
    private JPanel auswahl;
    private JPanel navbar;
    private JButton quiz;
    private JButton spiel;
    private JButton lern;
    private JButton stat;
    private JButton exit;
    private JButton einstellungen;
    private JLabel titel;

    public HauptmenuePanel() {
        this.setLayout(new BorderLayout());
        hauptpanel = new JPanel();
        // Größere Abstände
        hauptpanel.setLayout(new BorderLayout(20,20));

        // Titel stylen
        titel = new JLabel("Sew-Wort-Trainer", SwingConstants.CENTER);
        titel.setFont(new Font("Arial", Font.BOLD, 36));
        titel.setForeground(new Color(50, 50, 150)); // Dunkelblau

        // Auswahl-Buttons Container
        auswahl = new JPanel();
        auswahl.setLayout(new GridLayout(2,2, 20, 20)); // Großer Abstand zwischen Buttons

        // Haupt-Buttons stylen
        Font buttonFont = new Font("Arial", Font.BOLD, 18);
        Color mainColor = new Color(70, 130, 180); // Steel Blue

        quiz = new JButton("Quiz starten");
        quiz.setFont(buttonFont);
        quiz.setBackground(mainColor);
        quiz.setForeground(Color.WHITE);
        quiz.setOpaque(true);
        quiz.setBorderPainted(false);
        quiz.setActionCommand("GOTO_QUIZ");
        auswahl.add(quiz);

        spiel = new JButton("Hangman spielen");
        spiel.setFont(buttonFont);
        spiel.setBackground(mainColor);
        spiel.setForeground(Color.WHITE);
        spiel.setOpaque(true);
        spiel.setBorderPainted(false);
        spiel.setActionCommand("GOTO_HANGMAN");
        auswahl.add(spiel);

        lern = new JButton("Lernmodus starten");
        lern.setFont(buttonFont);
        lern.setBackground(mainColor);
        lern.setForeground(Color.WHITE);
        lern.setOpaque(true);
        lern.setBorderPainted(false);
        lern.setActionCommand("GOTO_LERNMODUS");
        auswahl.add(lern);

        stat = new JButton("Statistik anzeigen");
        stat.setFont(buttonFont);
        stat.setBackground(mainColor);
        stat.setForeground(Color.WHITE);
        stat.setOpaque(true);
        stat.setBorderPainted(false);
        stat.setActionCommand("GOTO_STATISTIK");
        auswahl.add(stat);

        // Navbar
        navbar = new JPanel();
        navbar.setLayout(new BorderLayout(15,15)); // Größerer Abstand

        // Exit und Einstellungen stylen
        Font navFont = new Font("Arial", Font.PLAIN, 14);
        Color secondaryColor = new Color(150, 150, 150); // Grau

        exit = new JButton("Beenden");
        exit.setFont(navFont);
        exit.setForeground(Color.RED); // Rot für Beenden
        exit.setActionCommand("EXIT");
        navbar.add(exit, BorderLayout.WEST);

        einstellungen = new JButton("Einstellungen");
        einstellungen.setFont(navFont);
        einstellungen.setForeground(secondaryColor);
        einstellungen.setActionCommand("EINSTELLUNGEN");
        navbar.add(einstellungen, BorderLayout.EAST);

        hauptpanel.add(titel, BorderLayout.NORTH);
        hauptpanel.add(auswahl, BorderLayout.CENTER); // Auswahl in die Mitte
        hauptpanel.add(navbar, BorderLayout.SOUTH); // Navbar nach unten

        // Padding um das Hauptpanel hinzufügen
        JPanel padding = new JPanel(new BorderLayout());
        padding.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        padding.add(hauptpanel, BorderLayout.CENTER);

        this.add(padding, BorderLayout.CENTER);
    }

    // Getter-Methoden bleiben unverändert
    public JButton getQuizButton() { return quiz; }
    public JButton getSpielButton() { return spiel; }
    public JButton getLernButton() { return lern; }
    public JButton getStatButton() { return stat; }
    public JButton getExitButton() { return exit; }
}