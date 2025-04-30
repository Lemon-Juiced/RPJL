package dev.lemonjuice.RPJL.IP.Address;

import dev.lemonjuice.RPJL.Hex;

import java.math.BigInteger;

/**
 * Utility class that represents an IPv6 address.
 *
 * @param net1 The first segment of the IPv6 address.
 * @param net2 The second segment of the IPv6 address.
 * @param net3 The third segment of the IPv6 address.
 * @param net4 The fourth segment of the IPv6 address.
 * @param net5 The fifth segment of the IPv6 address.
 * @param net6 The sixth segment of the IPv6 address.
 * @param net7 The seventh segment of the IPv6 address.
 * @param net8 The eight segment of the IPv6 address.
 */
public record IPv6Address(Hex net1, Hex net2, Hex net3, Hex net4, Hex net5, Hex net6, Hex net7, Hex net8) {

    /**
     * Converts the IPv4 address to a string representation.
     *
     * @return The string representation of the IPv6 address.
     */
    @Override
    public String toString() {
        return net1.getHexString() + ":" + net2.getHexString() + ":" + net3.getHexString() + ":" +
                net4.getHexString() + ":" + net5.getHexString() + ":" + net6.getHexString() + ":" +
                net7.getHexString() + ":" + net8.getHexString();
    }

    /**
     * Converts the IPv6 address to a BigInteger representation.
     *
     * @return The BigInteger representation of the IPv6 address.
     */
    public BigInteger toBigInteger() {
        return new BigInteger(1, new byte[] {
            (byte) net1.toInt(),
            (byte) net2.toInt(),
            (byte) net3.toInt(),
            (byte) net4.toInt(),
            (byte) net5.toInt(),
            (byte) net6.toInt(),
            (byte) net7.toInt(),
            (byte) net8.toInt()
        });
    }

}
