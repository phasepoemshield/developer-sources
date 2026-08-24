/*
 * Decompiled with CFR 0.152.
 */
package org.freedesktop.dbus.types;

public class UInt32
extends Number
implements Comparable<UInt32> {
    public static final long MIN_VALUE = 0L;
    private final long value;
    public static final long MAX_VALUE = 0xFFFFFFFFL;

    public int hashCode() {
        return (int)this.value;
    }

    @Override
    public long longValue() {
        return this.value;
    }

    @Override
    public float floatValue() {
        return this.value;
    }

    @Override
    public int compareTo(UInt32 _other) {
        return Long.compare(this.value, _other.value);
    }

    @Override
    public short shortValue() {
        return (short)this.value;
    }

    @Override
    public int intValue() {
        return (int)this.value;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object _o) {
        if (!(_o instanceof UInt32)) return false;
        UInt32 ui = (UInt32)_o;
        if (ui.value != this.value) return false;
        return true;
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    public UInt32(String _value) {
        this(Long.parseLong(_value));
    }

    @Override
    public double doubleValue() {
        return this.value;
    }

    /*
     * WARNING - void declaration
     */
    public UInt32(long _value) {
        void var1_1;
        if (_value < 0L || _value > 0xFFFFFFFFL) {
            Object[] objectArray = new Object[3];
            objectArray[0] = _value;
            objectArray[1] = 0L;
            objectArray[2] = 0xFFFFFFFFL;
            throw new NumberFormatException(String.format("%s is not between %s and %s.", objectArray));
        }
        this.value = var1_1;
    }

    @Override
    public byte byteValue() {
        return (byte)this.value;
    }
}

