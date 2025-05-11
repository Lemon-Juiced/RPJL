package dev.lemonjuice.RPJL.Color;

/**
 * A class representing a color in RGB format.
 *
 * @author Rob
 */
public class Color {
    private int red;
    private int green;
    private int blue;

    /**
     * Constructor for Color.
     *
     * @param red The red component of the color (0-255).
     * @param green The green component of the color (0-255).
     * @param blue The blue component of the color (0-255).
     */
    public Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    /**
     * Alternate constructor for color using a hex string.
     *
     * @param hex The hex string representing the color (e.g., "#FF5733").
     */
    public Color(String hex) {
        if (hex.startsWith("#")) {
            hex = hex.substring(1);
        }
        this.red = Integer.parseInt(hex.substring(0, 2), 16);
        this.green = Integer.parseInt(hex.substring(2, 4), 16);
        this.blue = Integer.parseInt(hex.substring(4, 6), 16);
    }

    /**
     * Get the red component of the color.
     *
     * @return The red component of the color.
     */
    public int getRed() {
        return red;
    }

    /**
     * Get the green component of the color.
     *
     * @return The green component of the color.
     */
    public int getGreen() {
        return green;
    }

    /**
     * Get the blue component of the color.
     *
     * @return The blue component of the color.
     */
    public int getBlue() {
        return blue;
    }

    /**
     * Set the red component of the color.
     *
     * @param red The red component of the color.
     */
    public void setRed(int red) {
        this.red = red;
    }

    /**
     * Set the green component of the color.
     *
     * @param green The green component of the color.
     */
    public void setGreen(int green) {
        this.green = green;
    }

    /**
     * Set the blue component of the color.
     *
     * @param blue The blue component of the color.
     */
    public void setBlue(int blue) {
        this.blue = blue;
    }

    /**
     * Convert the color to a ANSI escape code string.
     *
     * @return The ANSI escape code string representing the color.
     */
    public String toANSIEscapeCode() {
        return "\u001B[38;2;" + red + ";" + green + ";" + blue + "m";
    }

    /**
     * Convert the color to a default ANSI escape code string.
     *
     * @return The default ANSI escape code string.
     */
    public String toDefaultANSIEscapeCode() {
        return "\u001B[0m";
    }

    /**
     * Convert the color to a hex string.
     *
     * @return The hex string representing the color (e.g., "#FF5733").
     */
    public String toHexString() {
        return String.format("#%02X%02X%02X", red, green, blue);
    }
}
