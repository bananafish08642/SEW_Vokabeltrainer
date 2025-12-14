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
       hauptpanel = new JPanel();
       hauptpanel.setLayout(new BorderLayout(5,5));
       auswahl = new JPanel();
       auswahl.setLayout(new GridLayout(2,2));
       navbar = new JPanel();
       navbar.setLayout(new BorderLayout(5,5));
       quiz = new JButton("Quiz starten");
       auswahl.add(quiz);
       spiel = new JButton("Hangman spielen");
       auswahl.add(spiel);
       lern = new JButton("Lernmodus starten");
       auswahl.add(lern);
       stat = new JButton("Statistik anzeigen");
       auswahl.add(stat);
       hauptpanel.add(auswahl, BorderLayout.SOUTH);
       titel = new JLabel("Menü");
       hauptpanel.add(titel, BorderLayout.CENTER);
       exit = new JButton();
       navbar.add(exit, BorderLayout.WEST);
       einstellungen = new JButton();
       navbar.add(einstellungen, BorderLayout.EAST);
       hauptpanel.add(navbar, BorderLayout.NORTH);
       this.add(hauptpanel);
   }
}
