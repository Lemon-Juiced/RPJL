package dev.lemonjuice.RPJL.Color;

/**
 * A class representing a color in CMYK format.
 *
 * @author Rob
 */
public class CMYKColor {
    private int cyan;
    private int magenta;
    private int yellow;
    private int black;

    /**
     * Constructor for CMYKColor.
     *
     * @param cyan The cyan component of the color (0-100).
     * @param magenta The magenta component of the color (0-100).
     * @param yellow The yellow component of the color (0-100).
     * @param black The black component of the color (0-100).
     */
    public CMYKColor(int cyan, int magenta, int yellow, int black) {
        this.cyan = cyan;
        this.magenta = magenta;
        this.yellow = yellow;
        this.black = black;
    }

    /**
     * Get the cyan component of the color.
     *
     * @return The cyan component of the color.
     */
    public int getCyan() {
        return cyan;
    }

    /**
     * Get the magenta component of the color.
     *
     * @return The magenta component of the color.
     */
    public int getMagenta() {
        return magenta;
    }

    /**
     * Get the yellow component of the color.
     *
     * @return The yellow component of the color.
     */
    public int getYellow() {
        return yellow;
    }

    /**
     * Get the black component of the color.
     *
     * @return The black component of the color.
     */
    public int getBlack() {
        return black;
    }

    /**
     * Set the cyan component of the color.
     *
     * @param cyan The cyan component of the color.
     */
    public void setCyan(int cyan) {
        this.cyan = cyan;
    }

    /**
     * Set the magenta component of the color.
     *
     * @param magenta The magenta component of the color.
     */
    public void setMagenta(int magenta) {
        this.magenta = magenta;
    }

    /**
     * Set the yellow component of the color.
     *
     * @param yellow The yellow component of the color.
     */
    public void setYellow(int yellow) {
        this.yellow = yellow;
    }

    /**
     * Set the black component of the color.
     *
     * @param black The black component of the color.
     */
    public void setBlack(int black) {
        this.black = black;
    }

    /**
     * Convert the CMYK color back to RGB format.
     *
     * @return the color as a Color object (using RGB format).
     */
    public Color toRGB() {
        int r = 255 * (1 - cyan / 100) * (1 - black / 100);
        int g = 255 * (1 - magenta / 100) * (1 - black / 100);
        int b = 255 * (1 - yellow / 100) * (1 - black / 100);
        return new Color(r, g, b);
    }
}
