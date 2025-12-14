import view.frame.MainFrame;
import javax.swing.SwingUtilities;

/**
 * Startklasse für die Worttrainer-Anwendung.
 * @author [Dein Name]
 * @version 1.0.0
 * @date 12.12.2025
 */
public class WortTrainerTest {

    public static void main(String[] args) {
        // Startet die GUI im Event Dispatch Thread (Sicherheitsstandard für Swing)
        SwingUtilities.invokeLater(() -> {
            new MainFrame();
        });
    }
}