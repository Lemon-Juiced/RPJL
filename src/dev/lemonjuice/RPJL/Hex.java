package dev.lemonjuice.RPJL;

/**
 * Wrapper class for Strings that represent a hexadecimal numbers.
 */
public class Hex {
    private final String hexString;

    /**
     * Constructor for Hex class.
     *
     * @param hexString The hexadecimal string to be wrapped.
     */
    public Hex(String hexString) {
        this.hexString = hexString;
    }

    /**
     * Alternative constructor for Hex class.
     *
     * @param unhexedInt The integer to be converted to a hexadecimal string.
     */
    public Hex(int unhexedInt) {
        this.hexString = Integer.toHexString(unhexedInt);
    }

    /**
     * Converts the hexadecimal string to an integer.
     *
     * @return The integer representation of the hexadecimal string.
     */
    public int toInt() {
        return Integer.parseUnsignedInt(hexString, 16);
    }

    /**
     * Gets the hexadecimal string.
     *
     * @return The hexadecimal string.
     */
    public String getHexString() {
        return hexString;
    }
}
