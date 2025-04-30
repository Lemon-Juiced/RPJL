package dev.lemonjuice.RPJL.IP.CIDR;

/**
 * Utility class for IPv6 CIDR address manipulation.
 */
public class IPv6CIDR {
    private static final int MAX_PREFIX_LENGTH = 128;

    /**
     * Converts a number of IP addresses to a CIDR prefix length (taking the ceiling of values).
     *
     * @param ipCount The number of IP addresses to convert.
     * @return The CIDR prefix length that can accommodate the given number of IP addresses.
     */
    public static int convertIPCountToCIDR(int ipCount) {
        return CIDRCommon.convertIPCountToCIDR(ipCount, MAX_PREFIX_LENGTH);
    }

    /**
     * Converts a CIDR prefix length to the number of IP addresses it can accommodate.
     *
     * @param prefixLength The CIDR prefix length to convert.
     * @return The number of IP addresses that can be accommodated by the given CIDR prefix length.
     */
    public static int convertCIDRToIPCount(int prefixLength) {
        return CIDRCommon.convertCIDRToIPCount(prefixLength, MAX_PREFIX_LENGTH);
    }
}
