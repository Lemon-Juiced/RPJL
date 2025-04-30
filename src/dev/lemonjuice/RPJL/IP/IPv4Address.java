package dev.lemonjuice.RPJL.IP;

/**
 * Utility class that represents an IPv4 address.
 *
 * @param net1 The first octet of the IPv4 address.
 * @param net2 The second octet of the IPv4 address.
 * @param net3 The third octet of the IPv4 address.
 * @param net4 The fourth octet of the IPv4 address.
 */
public record IPv4Address(int net1, int net2, int net3, int net4) {
    /**
     * Converts the IPv4 address to a string representation.
     *
     * @return The string representation of the IPv4 address.
     */
    @Override
    public String toString() {
        return net1 + "." + net2 + "." + net3 + "." + net4;
    }

    /**
     * Converts the IPv4 address to an integer representation.
     *
     * @return The integer representation of the IPv4 address.
     */
    public int toInt() {
        return (net1 << 24) | (net2 << 16) | (net3 << 8) | net4;
    }
}
