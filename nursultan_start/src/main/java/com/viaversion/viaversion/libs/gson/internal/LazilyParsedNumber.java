/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.gson.internal.NumberLimits
 */
package com.viaversion.viaversion.libs.gson.internal;

import com.viaversion.viaversion.libs.gson.internal.NumberLimits;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.math.BigDecimal;

public final class LazilyParsedNumber
extends Number {
    private final String value;

    public LazilyParsedNumber(String value) {
        this.value = value;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LazilyParsedNumber) {
            LazilyParsedNumber other = (LazilyParsedNumber)obj;
            return this.value.equals(other.value);
        }
        return false;
    }

    public String toString() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    @Override
    public int intValue() {
        try {
            return Integer.parseInt(this.value);
        }
        catch (NumberFormatException e) {
            try {
                return (int)Long.parseLong(this.value);
            }
            catch (NumberFormatException nfe) {
                return this.asBigDecimal().intValue();
            }
        }
    }

    @Override
    public long longValue() {
        try {
            return Long.parseLong(this.value);
        }
        catch (NumberFormatException e) {
            return this.asBigDecimal().longValue();
        }
    }

    @Override
    public float floatValue() {
        return Float.parseFloat(this.value);
    }

    @Override
    public double doubleValue() {
        return Double.parseDouble(this.value);
    }

    private void readObject(ObjectInputStream in) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() throws ObjectStreamException {
        return this.asBigDecimal();
    }

    private BigDecimal asBigDecimal() {
        return NumberLimits.parseBigDecimal((String)this.value);
    }
}

