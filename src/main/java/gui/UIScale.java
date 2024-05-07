package gui;

import java.awt.*;

public class UIScale {
    public static double scaleFactor;

    public UIScale() {
        // Get the screen resolution of user's display/s.
        GraphicsDevice graphicsDevice = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        int screenWidth = graphicsDevice.getDisplayMode().getWidth();
        int screenHeight = graphicsDevice.getDisplayMode().getHeight();

        // Define base screen resolution (in this case 1920x1080).
        int baseWidth = 1920;
        int baseHeight = 1080;

        // Calculate the area ratio of the screen resolutions.
        this.setScaleFactor(((double) screenWidth * screenHeight) / (baseWidth * baseHeight));
    }

    public double[] getUIScale(int scaleFactor) {
        double adjustedScaleFactor = this.getScaleFactor() * scaleFactor;
        return new double[] {adjustedScaleFactor, adjustedScaleFactor};
    }

    public double getScaleFactor() {
        return scaleFactor;
    }

    public void setScaleFactor(double scaleFactor) {
        this.scaleFactor = scaleFactor;
    }
}
