package view.frame;
import view.panel.*; // Importiere alle Panels
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Die "Haupt-Container" für alle Ansichten bzw. der Frame.
 * Verwaltet die Navigation zwischen den Panels.
 * @author Muhammed Bas
 * @version 12-12-2025
 */
public class MainFrame extends JFrame implements ActionListener {
    // Konstanten für die Frame
    private static final String titel = "Sew-Wort-Trainer";
    private static final int frame_height = 500;
    private static final int frame_width = 750;

    // Aktuelles Panel der angezeigt wird (Das JPanel selbst ist der Haupt-Container des Frames)
    private JPanel currentPanel;

    // Alle Panel-Instanzen (werden einmal erzeugt)
    private final HauptmenuePanel hauptmenuePanel;
    private final StatistikPanel statistikPanel;
    private final QuizmodiPanel quizmodiPanel;
    private final HangmanPanel hangmanPanel;
    private final LernmodiPanel lernmodiPanel;

    public MainFrame() {
        // 1. Initialisierung der Panels
        hauptmenuePanel = new HauptmenuePanel();
        statistikPanel = new StatistikPanel();
        quizmodiPanel = new QuizmodiPanel();
        hangmanPanel = new HangmanPanel();
        lernmodiPanel = new LernmodiPanel();

        // 2. Registrierung der Action Listener für die Navigation
        registerListeners();

        // 3. Frame Einstellungen
        setTitle(titel);
        setSize(frame_width, frame_height);
        setLayout(new BorderLayout()); // Verwende das Standard BorderLayout

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Zentriert das Fenster auf dem Bildschirm

        // 4. Initiales Panel setzen
        setPanel(hauptmenuePanel);

        setVisible(true);
    }

    /**
     * Registriert den ActionListener (MainFrame selbst) bei allen Navigations-Buttons.
     */
    private void registerListeners() {
        // Hauptmenü
        hauptmenuePanel.getQuizButton().addActionListener(this);
        hauptmenuePanel.getSpielButton().addActionListener(this);
        hauptmenuePanel.getLernButton().addActionListener(this);
        hauptmenuePanel.getStatButton().addActionListener(this);
        hauptmenuePanel.getExitButton().addActionListener(this);

        // Andere Panels (Zurück-Buttons)
        statistikPanel.getZurueckButton().addActionListener(this);
        quizmodiPanel.getZurueckButton().addActionListener(this);
        hangmanPanel.getZurueckButton().addActionListener(this);
        lernmodiPanel.getZurueckButton().addActionListener(this);
    }

    /**
     * Setzt das aktuell angezeigte Panel im Frame.
     * @param panel Das neue anzuzeigende Panel.
     */
    public void setPanel(JPanel panel) {
        if(currentPanel != null) {
            this.remove(currentPanel); // Entferne das alte Panel
        }

        currentPanel = panel;
        this.add(currentPanel, BorderLayout.CENTER); // Füge das neue Panel hinzu

        this.revalidate(); // Aktualisiere das Layout des Containers
        this.repaint();    // Zeichne neu
    }

    /**
     * Verarbeitet die Klicks der Navigations-Buttons.
     * @param e Das ActionEvent.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        switch (command) {
            case "GOTO_QUIZ":
                setPanel(quizmodiPanel);
                break;
            case "GOTO_HANGMAN":
                setPanel(hangmanPanel);
                break;
            case "GOTO_LERNMODUS":
                setPanel(lernmodiPanel);
                // Beispiel: setze initiale Frage für Lernmodus
                lernmodiPanel.setFrage("Hauptstadt von Österreich?");
                lernmodiPanel.setAntwort("Wien");
                lernmodiPanel.naechsteFrage(); // Versteckt die Antwort initial
                break;
            case "GOTO_STATISTIK":
                setPanel(statistikPanel);
                break;
            case "ZURUECK_HAUPTMENUE": // Funktioniert für alle Zurück-Buttons
                setPanel(hauptmenuePanel);
                break;
            case "EXIT":
                System.exit(0);
                break;
            // Weitere Aktionen (z.B. Antworten anzeigen, Gewusst/Nicht Gewusst) folgen hier später...
            case "Antwort":
                if (currentPanel == lernmodiPanel) lernmodiPanel.antwortAnzeigen();
                break;
            // TODO: Logik für Gewusst/Nicht Gewusst implementieren
        }
    }
}