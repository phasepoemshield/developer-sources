/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi;

public final class Address
extends Number
implements Comparable<Address> {
    private static final Address NULL = new Address(0L);
    private final long address;

    public final String toString() {
        return Long.toString(this.address, 10);
    }

    public final int hashCode() {
        return (int)(this.address ^ this.address >>> 32);
    }

    public final long address() {
        return this.address;
    }

    public final long nativeAddress() {
        return this.address;
    }

    public final boolean isNull() {
        return this.address == 0L;
    }

    public static Address valueOf(long address) {
        return address == 0L ? NULL : new Address(address);
    }

    public final String toHexString() {
        return Long.toString(this.address, 16);
    }

    @Override
    public final int compareTo(Address other) {
        return this.address < other.address ? -1 : (this.address > other.address ? 1 : 0);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object obj) {
        if (obj instanceof Address) {
            if (this.address == ((Address)obj).address) return true;
        }
        if (obj != null) return false;
        if (this.address != 0L) return false;
        return true;
    }

    @Override
    public final long longValue() {
        return this.address;
    }

    public static Address valueOf(int address) {
        return address == 0 ? NULL : new Address((long)address & 0xFFFFFFFFL);
    }

    @Override
    public final double doubleValue() {
        return this.address;
    }

    private Address(long address) {
        this.address = address;
    }

    public Address(Address address) {
        this.address = address.address;
    }

    @Override
    public final int intValue() {
        return (int)this.address;
    }

    @Override
    public final float floatValue() {
        return this.address;
    }
}

