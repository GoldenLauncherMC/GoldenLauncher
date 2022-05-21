package io.github.heroostech.orangelancher;

import javax.swing.*;
import java.awt.*;

public class OrangeLauncher {

    public OrangeLauncher() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        JButton button = new JButton("Launch");
        button.setBackground(Color.ORANGE);

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
        panel.add(button);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("OrangeLauncher");
        frame.pack();
        frame.setVisible(true);
    }

    public void main(String[] args) {
        new OrangeLauncher();
    }
}
