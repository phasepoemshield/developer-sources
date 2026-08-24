/*
 * Decompiled with CFR 0.152.
 */
package org.freedesktop.dbus.types;

public class UInt16
extends Number
implements Comparable<UInt16> {
    private final int value;
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 65535;

    @Override
    public long longValue() {
        return this.value;
    }

    /*
     * WARNING - void declaration
     */
    public UInt16(int _value) {
        void var1_1;
        if (_value < 0 || _value > 65535) {
            Object[] objectArray = new Object[3];
            objectArray[0] = _value;
            objectArray[1] = 0;
            objectArray[2] = 65535;
            throw new NumberFormatException(String.format("%s is not between %s and %s.", objectArray));
        }
        this.value = var1_1;
    }

    public UInt16(String _value) {
        this(Integer.parseInt(_value));
    }

    public int hashCode() {
        return this.value;
    }

    @Override
    public float floatValue() {
        return this.value;
    }

    @Override
    public int compareTo(UInt16 _other) {
        return Integer.compare(this.value, _other.value);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object _o) {
        if (!(_o instanceof UInt16)) return false;
        UInt16 ui = (UInt16)_o;
        if (ui.value != this.value) return false;
        return true;
    }

    @Override
    public double doubleValue() {
        return this.value;
    }

    @Override
    public int intValue() {
        return this.value;
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    @Override
    public byte byteValue() {
        return (byte)this.value;
    }

    @Override
    public short shortValue() {
        return (short)this.value;
    }
}

