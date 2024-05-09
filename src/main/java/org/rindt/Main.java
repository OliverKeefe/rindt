package org.rindt;

import javax.swing.*;
import gui.*;
import java.awt.*;
import com.formdev.flatlaf.FlatDarculaLaf;

public class Main {
    public static void main(String[] args) {
        GraphicsDevice graphicsDevice = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        int screenWidth = graphicsDevice.getDisplayMode().getWidth();
        int screenHeight = graphicsDevice.getDisplayMode().getHeight();
        System.out.println(screenWidth);

        if(screenWidth >= 2560) {
            System.setProperty("sun.java2d.uiScale", "2");
            System.setProperty("flatlaf.uiScale", "2");
        }

        // Set the look and feel to FlatLaf Darcula
        try {
            FontStyle fontStyle = new FontStyle();
            UIManager.setLookAndFeel(new FlatDarculaLaf());
            UIManager.put("Menu.font", new Font("SansSerif", Font.PLAIN, fontStyle.getMenuItemSize()));
            UIManager.put("MenuItem.font", new Font("SansSerif", Font.PLAIN, fontStyle.getMenuItemSize()));
        } catch (UnsupportedLookAndFeelException e) {
            System.err.println("Failed to initialize LaF");
        }

        SwingUtilities.invokeLater(() -> {
            JFrame mainFrame = new JFrame("Rindt");
            NavbarTop navbarTop = new NavbarTop();

            mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainFrame.setSize(1920, 1080);
            mainFrame.setVisible(true);
            mainFrame.setJMenuBar(navbarTop.getJMenuBar());

        });
    }
}