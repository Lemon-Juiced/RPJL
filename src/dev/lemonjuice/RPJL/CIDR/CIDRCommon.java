package dev.lemonjuice.RPJL.CIDR;

/**
 * Utility class for commonalities in IPv4 and IPv6 CIDR address manipulation.
 *
 * This also allows for arbitrary maxPrefixLength values to be passed in, which is useful for subranges.
 */
public class CIDRCommon {
    public static final int MAX_IPV4_PREFIX_LENGTH = 32;
    public static final int MAX_IPV6_PREFIX_LENGTH = 128;

    /**
     * Converts a number of IP addresses to a CIDR prefix length (taking the ceiling of values).
     *
     * @param ipCount The number of IP addresses to convert.
     * @param maxPrefixLength The maximum prefix length for the address type.
     * @return The CIDR prefix length that can accommodate the given number of IP addresses.
     */
    public static int convertIPCountToCIDR(int ipCount, int maxPrefixLength) {
        // Handle Errors
        if (ipCount <= 0) throw new IllegalArgumentException("IP count must be greater than 0");

        // Do bitwise operations to find the prefix length
        int prefixLength = maxPrefixLength;
        while (ipCount > (1 << (maxPrefixLength - prefixLength))) {
            prefixLength--;
        }
        return prefixLength;
    }

    /**
     * Converts a CIDR prefix length to the number of IP addresses it can accommodate.
     *
     * @param prefixLength The CIDR prefix length to convert.
     * @param maxPrefixLength The maximum prefix length for the address type.
     * @return The number of IP addresses that can be accommodated by the given CIDR prefix length.
     */
    public static int convertCIDRToIPCount(int prefixLength, int maxPrefixLength) {
        // Handle Errors
        if (prefixLength < 0 || prefixLength > maxPrefixLength) throw new IllegalArgumentException("Prefix length must be between 0 and " + maxPrefixLength);

        // Do bitwise operations to find the number of IP addresses
        return 1 << (maxPrefixLength - prefixLength);
    }
}
