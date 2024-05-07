package org.rindt;

import javax.swing.*;
import gui.*;
import java.awt.*;
import com.formdev.flatlaf.FlatDarculaLaf;
import gui.NavbarTop;
import gui.UIScale;

public class Main {
    public static void main(String[] args) {
        // Set the look and feel to FlatLaf Darcula
        try {
            UIScale uiScale = new UIScale();
            FontStyle fontStyle = new FontStyle();
            UIManager.setLookAndFeel(new FlatDarculaLaf());
            UIManager.put("Menu.font", new Font("SansSerif", Font.PLAIN, fontStyle.getMenuItemSize()));
            UIManager.put("MenuItem.font", new Font("SansSerif", Font.PLAIN, fontStyle.getMenuItemSize()));
        } catch (UnsupportedLookAndFeelException e) {
            System.err.println("Failed to initialize LaF");
        }

        SwingUtilities.invokeLater(() -> {
            JFrame mainFrame = new JFrame("Rindt");
            UIScale uiScale = new UIScale();
            double[] scale = uiScale.getUIScale(4);
            NavbarTop navbarTop = new NavbarTop(scale);

            mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainFrame.setSize(1920, 1080);
            mainFrame.setVisible(true);
            mainFrame.setJMenuBar(navbarTop.getJMenuBar());

        });
    }
}