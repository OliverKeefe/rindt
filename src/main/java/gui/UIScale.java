package gui;

import java.awt.*;

public class UIScale {
    private double scaleX;
    private double scaleY;

    public UIScale() {

        // Get the screen resolution of user's display/s.
        GraphicsDevice graphicsDevice = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        int screenWidth = graphicsDevice.getDisplayMode().getWidth();
        int screenHeight = graphicsDevice.getDisplayMode().getHeight();

        // Define minimum / base screen resolution (in this case 1280x720).

        this.scaleX = (screenWidth / 1920.0);
        this.scaleY = (screenHeight / 1080.0);

    }

    public double[] getUIScale(int scaleFactor) {
        double newScaleX = scaleX * scaleFactor;
        double newScaleY = scaleY * scaleFactor;

        return new double[] {newScaleX, newScaleY};
    }












}
