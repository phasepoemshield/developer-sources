/*
 * Decompiled with CFR 0.152.
 */
package fun.crashsystem.jdrpc.libs.com.google.gson.internal;

import fun.crashsystem.jdrpc.libs.com.google.gson.internal.NumberLimits;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
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
                return ((BigDecimal)this.writeReplace()).intValue();
            }
        }
    }

    @Override
    public long longValue() {
        try {
            return Long.parseLong(this.value);
        }
        catch (NumberFormatException e) {
            return ((BigDecimal)this.writeReplace()).longValue();
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

    private BigDecimal writeReplace() {
        return NumberLimits.parseBigDecimal(this.value);
    }
}

