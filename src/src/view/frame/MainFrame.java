package view.frame;

import view.panel.HauptmenuePanel;

import javax.swing.*;

public class MainFrame extends JFrame {
    private JFrame frame;
    HauptmenuePanel panel;

    public MainFrame() {
        panel = new HauptmenuePanel();
        frame = new JFrame();
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setTitle("UserInterface");
        frame.pack();
        frame.setVisible(true);
    }
}
