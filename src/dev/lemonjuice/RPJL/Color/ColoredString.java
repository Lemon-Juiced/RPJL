package dev.lemonjuice.RPJL.Color;

/**
 * A class representing a colored string.
 *
 * @author Rob
 */
public class ColoredString {
    private String string;
    private Color color;

    /**
     * Constructor for ColoredString.
     *
     * @param string The string to be colored.
     * @param color The color of the string.
     */
    public ColoredString(String string, Color color) {
        this.string = string;
        this.color = color;
    }

    /**
     * Get the string.
     *
     * @return The string.
     */
    public String getString() {
        return string;
    }

    /**
     * Get the color of the string.
     *
     * @return The color of the string.
     */
    public Color getColor() {
        return color;
    }

    /**
     * Set the string.
     *
     * @param string The string to be set.
     */
    public void setString(String string) {
        this.string = string;
    }

    /**
     * Set the color of the string.
     *
     * @param color The color to be set.
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * Get the coloRed string using ANSI escape codes.
     *
     * @return The colored string.
     */
    public String getColoredString() {
        return color.toANSIEscapeCode() + string + color.toDefaultANSIEscapeCode();
    }

}
