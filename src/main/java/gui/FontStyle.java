package gui;

public class FontStyle {
    private static final int menuItemSize = 12;
    private static final int headerSize = 25;
    private double scale = UIScale.scaleFactor;

    public FontStyle() {

    }

    public int getMenuItemSize() {
        return menuItemSize * (int) scale / 8;
    }

    public int getHeaderSize() {
        return menuItemSize * (int) scale / 8;
    }

}
