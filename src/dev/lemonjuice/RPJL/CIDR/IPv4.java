package dev.lemonjuice.RPJL.CIDR;

/**
 * Utility class for IPv4 CIDR address manipulation.
 */
public class IPv4 {
    private static final int MAX_PREFIX_LENGTH = 32;

    /**
     * Converts a number of IP addresses to a CIDR prefix length (taking the ceiling of values).
     *
     * @param ipCount The number of IP addresses to convert.
     * @return The CIDR prefix length that can accommodate the given number of IP addresses.
     */
    public static int convertIPCountToCIDR(int ipCount) {
        return Common.convertIPCountToCIDR(ipCount, MAX_PREFIX_LENGTH);
    }

    /**
     * Converts a CIDR prefix length to the number of IP addresses it can accommodate.
     *
     * @param prefixLength The CIDR prefix length to convert.
     * @return The number of IP addresses that can be accommodated by the given CIDR prefix length.
     */
    public static int convertCIDRToIPCount(int prefixLength) {
        return Common.convertCIDRToIPCount(prefixLength, MAX_PREFIX_LENGTH);
    }
}
