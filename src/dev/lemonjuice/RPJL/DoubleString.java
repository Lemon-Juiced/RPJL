package dev.lemonjuice.RPJL;

public class DoubleString {
    private String string1;
    private String string2;

    /**
     * Constructor for DoubleString.
     *
     * @param string1 The first string.
     * @param string2 The second string.
     */
    public DoubleString(String string1, String string2) {
        this.string1 = string1;
        this.string2 = string2;
    }

    /**
     * Get the first string.
     *
     * @return The first string.
     */
    public String getString1() {
        return string1;
    }

    /**
     * Get the second string.
     *
     * @return The second string.
     */
    public String getString2() {
        return string2;
    }

    /**
     * Set the first string.
     *
     * @param string1 The first string.
     */
    public void setString1(String string1) {
        this.string1 = string1;
    }

    /**
     * Set the second string.
     *
     * @param string2 The second string.
     */
    public void setString2(String string2) {
        this.string2 = string2;
    }
}
