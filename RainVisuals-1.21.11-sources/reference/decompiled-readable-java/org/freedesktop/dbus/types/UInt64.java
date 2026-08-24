/*
 * Decompiled with CFR 0.152.
 */
package org.freedesktop.dbus.types;

import java.math.BigInteger;

public class UInt64
extends Number
implements Comparable<UInt64> {
    private final long top;
    public static final BigInteger MAX_BIG_VALUE = new BigInteger("18446744073709551615");
    private final BigInteger value;
    private static final String ERROR_MSG = "%s is not between %s and %s.";
    public static final long MIN_VALUE = 0L;
    public static final long MAX_LONG_VALUE = Long.MAX_VALUE;
    private static final String BOUNDS = "4294967295";
    private final long bottom;

    public UInt64(String _value) {
        BigInteger a2;
        block5: {
            block4: {
                if (null == _value) {
                    Object[] objectArray = new Object[3];
                    objectArray[0] = _value;
                    objectArray[1] = 0L;
                    objectArray[2] = MAX_BIG_VALUE;
                    throw new NumberFormatException(String.format(ERROR_MSG, objectArray));
                }
                a2 = new BigInteger(_value);
                if (0 > a2.compareTo(BigInteger.ZERO)) break block4;
                if (0 >= a2.compareTo(MAX_BIG_VALUE)) break block5;
            }
            Object[] objectArray = new Object[3];
            objectArray[0] = _value;
            objectArray[1] = 0L;
            objectArray[2] = MAX_BIG_VALUE;
            throw new NumberFormatException(String.format(ERROR_MSG, objectArray));
        }
        this.value = a2;
        this.top = this.value.shiftRight(32).and(new BigInteger(BOUNDS)).longValue();
        this.bottom = this.value.and(new BigInteger(BOUNDS)).longValue();
    }

    public long bottom() {
        return this.bottom;
    }

    @Override
    public long longValue() {
        return this.value.longValue();
    }

    public long top() {
        return this.top;
    }

    @Override
    public byte byteValue() {
        return this.value.byteValue();
    }

    /*
     * WARNING - void declaration
     */
    public UInt64(long _top, long _bottom) {
        void var3_2;
        void var1_1;
        BigInteger a2 = BigInteger.valueOf(_top);
        a2 = a2.shiftLeft(32);
        a2 = a2.add(BigInteger.valueOf(_bottom));
        if (0 > a2.compareTo(BigInteger.ZERO)) {
            Object[] objectArray = new Object[3];
            objectArray[0] = a2;
            objectArray[1] = 0L;
            objectArray[2] = MAX_BIG_VALUE;
            throw new NumberFormatException(String.format(ERROR_MSG, objectArray));
        }
        if (0 < a2.compareTo(MAX_BIG_VALUE)) {
            Object[] objectArray = new Object[3];
            objectArray[0] = a2;
            objectArray[1] = 0L;
            objectArray[2] = MAX_BIG_VALUE;
            throw new NumberFormatException(String.format(ERROR_MSG, objectArray));
        }
        this.value = a2;
        this.top = var1_1;
        this.bottom = var3_2;
    }

    @Override
    public short shortValue() {
        return this.value.shortValue();
    }

    public BigInteger value() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public UInt64(long _value) {
        if (_value < 0L || _value > Long.MAX_VALUE) {
            Object[] objectArray = new Object[3];
            objectArray[0] = _value;
            objectArray[1] = 0L;
            objectArray[2] = Long.MAX_VALUE;
            throw new NumberFormatException(String.format(ERROR_MSG, objectArray));
        }
        this.value = BigInteger.valueOf(_value);
        this.top = this.value.shiftRight(32).and(new BigInteger(BOUNDS)).longValue();
        this.bottom = this.value.and(new BigInteger(BOUNDS)).longValue();
    }

    @Override
    public double doubleValue() {
        return this.value.doubleValue();
    }

    @Override
    public int intValue() {
        return this.value.intValue();
    }

    @Override
    public int compareTo(UInt64 _other) {
        return this.value.compareTo(_other.value);
    }

    public String toString() {
        return this.value.toString();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object _o) {
        if (!(_o instanceof UInt64)) return false;
        UInt64 ui = (UInt64)_o;
        if (!this.value.equals(ui.value)) return false;
        return true;
    }

    public UInt64(BigInteger _value) {
        block3: {
            block2: {
                if (null == _value) break block2;
                if (0 > _value.compareTo(BigInteger.ZERO)) break block2;
                if (0 >= _value.compareTo(MAX_BIG_VALUE)) break block3;
            }
            Object[] objectArray = new Object[3];
            objectArray[0] = _value;
            objectArray[1] = 0L;
            objectArray[2] = MAX_BIG_VALUE;
            throw new NumberFormatException(String.format(ERROR_MSG, objectArray));
        }
        this.value = _value;
        this.top = this.value.shiftRight(32).and(new BigInteger(BOUNDS)).longValue();
        this.bottom = this.value.and(new BigInteger(BOUNDS)).longValue();
    }

    @Override
    public float floatValue() {
        return this.value.floatValue();
    }
}

