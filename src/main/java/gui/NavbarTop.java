package gui;

import javax.swing.*;
import java.awt.*;

public class NavbarTop extends Navbar{
    double[] scale;

    public NavbarTop() {
        this.scale = scale;
        Font navbarFont = new Font("Arial", Font.PLAIN, 14);
        JMenuBar menuBarTop = new JMenuBar();
        //menuBarTop.setPreferredSize(new Dimension((int) scale[0], (int) scale[1]));

        JMenu fileMenu = new JMenu("File");
        fileMenu.setFont(navbarFont);
        menuBarTop.add(fileMenu);

        JMenuItem fileMenuItemOpen = new JMenuItem("Open");
        fileMenuItemOpen.setFont(navbarFont);
        fileMenuItemOpen.addActionListener(this);
        fileMenu.add(fileMenuItemOpen);

        JMenuItem fileMenuItemSave = new JMenuItem("Save");
        fileMenuItemSave.setFont(navbarFont);
        fileMenuItemSave.addActionListener(this);
        fileMenu.add(fileMenuItemSave);

        JMenuItem fileMenuItemPreferences = new JMenuItem("Preferences");
        fileMenuItemPreferences.setFont(navbarFont);
        fileMenuItemPreferences.addActionListener(this);
        fileMenu.add(fileMenuItemPreferences);

        // Set the menu bar and add the label to the content pane
        setJMenuBar(menuBarTop);
    }
}
