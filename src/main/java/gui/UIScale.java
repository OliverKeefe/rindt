package gui;

import java.awt.*;

public class UIScale {
    public static double scaleFactor;
    private double[] baseScreenResolution = {2560, 1440};
    private double[] screenResolution;

    public UIScale() {
        // Calculate the area ratio of the screen resolutions.
        this.screenResolution = baseScreenResolution;
        // Get the screen resolution of user's display/s.


    }

    public void setUIScale() {
        GraphicsDevice graphicsDevice = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        int screenWidth = graphicsDevice.getDisplayMode().getWidth();
        int screenHeight = graphicsDevice.getDisplayMode().getHeight();

        int baseScreenWidth = 2560;
        int baseScreenHeight = 1440;

        if (screenWidth > baseScreenWidth) {
            System.setProperty("sun.java2d.uiScale", "2");
        }

    }

    public double getScaleFactor() {
        return scaleFactor;
    }

    public void setScaleFactor(double scaleFactor) {
        this.scaleFactor = scaleFactor;
    }
}
