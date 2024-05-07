package org.rindt;

import javax.swing.*;
import gui.NavbarTop;
import gui.UIScale;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("Rindt");
        UIScale uiScale = new UIScale();
        double[] scale = uiScale.getUIScale(8);
        NavbarTop navbarTop = new NavbarTop(scale);
        navbarTop.setFont(new Font("SansSerif", Font.PLAIN, 200));

        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(1280, 720);
        mainFrame.setVisible(true);
        mainFrame.setJMenuBar(navbarTop.getJMenuBar());

    }
}