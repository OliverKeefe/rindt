package gui;

import javax.swing.*;
import java.awt.*;

public class NavbarTop extends Navbar{
    double[] scale;

    public NavbarTop(double[] scale) {
        this.scale = scale;
        JMenuBar menuBarTop = new JMenuBar();
        menuBarTop.setPreferredSize(new Dimension((int) scale[0], (int) scale[1]));
        menuBarTop.setSize(new Dimension((int) scale[0], (int) scale[1]));

        JMenu fileMenu = new JMenu("File");
        menuBarTop.add(fileMenu);

        JMenuItem fileMenuItemOpen = new JMenuItem("Open");
        fileMenuItemOpen.addActionListener(this);
        fileMenu.add(fileMenuItemOpen);

        JMenuItem fileMenuItemSave = new JMenuItem("Save");
        fileMenuItemSave.addActionListener(this);
        fileMenu.add(fileMenuItemSave);

        // Set the menu bar and add the label to the content pane
        setJMenuBar(menuBarTop);
    }
}
