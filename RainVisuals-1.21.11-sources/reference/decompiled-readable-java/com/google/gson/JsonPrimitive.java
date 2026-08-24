/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson;

import com.google.gson.JsonElement;
import com.google.gson.internal.LazilyParsedNumber;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

public final class JsonPrimitive
extends JsonElement {
    private final Object value;

    @Override
    public boolean getAsBoolean() {
        if (this.isBoolean()) {
            return (Boolean)this.value;
        }
        return Boolean.parseBoolean(this.getAsString());
    }

    @Override
    public BigDecimal getAsBigDecimal() {
        return this.value instanceof BigDecimal ? (BigDecimal)this.value : new BigDecimal(this.getAsString());
    }

    public int hashCode() {
        if (this.value == null) {
            return 31;
        }
        if (JsonPrimitive.isIntegral(this)) {
            long value = this.getAsNumber().longValue();
            return (int)(value ^ value >>> 32);
        }
        if (this.value instanceof Number) {
            long value = Double.doubleToLongBits(this.getAsNumber().doubleValue());
            return (int)(value ^ value >>> 32);
        }
        return this.value.hashCode();
    }

    @Override
    public byte getAsByte() {
        return this.isNumber() ? this.getAsNumber().byteValue() : Byte.parseByte(this.getAsString());
    }

    public boolean isString() {
        return this.value instanceof String;
    }

    public boolean isBoolean() {
        return this.value instanceof Boolean;
    }

    @Override
    public short getAsShort() {
        return this.isNumber() ? this.getAsNumber().shortValue() : Short.parseShort(this.getAsString());
    }

    @Override
    public JsonPrimitive deepCopy() {
        return this;
    }

    @Override
    public float getAsFloat() {
        return this.isNumber() ? this.getAsNumber().floatValue() : Float.parseFloat(this.getAsString());
    }

    @Override
    public double getAsDouble() {
        return this.isNumber() ? this.getAsNumber().doubleValue() : Double.parseDouble(this.getAsString());
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object obj) {
        void var2_2;
        block10: {
            block9: {
                if (this == obj) {
                    return true;
                }
                if (obj == null) break block9;
                if (this.getClass() == obj.getClass()) break block10;
            }
            return false;
        }
        JsonPrimitive other = (JsonPrimitive)obj;
        if (this.value == null) {
            return other.value == null;
        }
        if (JsonPrimitive.isIntegral(this)) {
            if (JsonPrimitive.isIntegral(other)) {
                return this.getAsNumber().longValue() == other.getAsNumber().longValue();
            }
        }
        if (this.value instanceof Number) {
            if (other.value instanceof Number) {
                double a2 = this.getAsNumber().doubleValue();
                double b2 = other.getAsNumber().doubleValue();
                return a2 == b2 || Double.isNaN(a2) && Double.isNaN(b2);
            }
        }
        return this.value.equals(var2_2.value);
    }

    public JsonPrimitive(String string) {
        this.value = Objects.requireNonNull(string);
    }

    public boolean isNumber() {
        return this.value instanceof Number;
    }

    @Override
    public long getAsLong() {
        return this.isNumber() ? this.getAsNumber().longValue() : Long.parseLong(this.getAsString());
    }

    @Override
    public BigInteger getAsBigInteger() {
        return this.value instanceof BigInteger ? (BigInteger)this.value : new BigInteger(this.getAsString());
    }

    @Override
    public int getAsInt() {
        return this.isNumber() ? this.getAsNumber().intValue() : Integer.parseInt(this.getAsString());
    }

    @Override
    public String getAsString() {
        if (this.value instanceof String) {
            return (String)this.value;
        }
        if (this.isNumber()) {
            return this.getAsNumber().toString();
        }
        if (this.isBoolean()) {
            return ((Boolean)this.value).toString();
        }
        throw new AssertionError((Object)("Unexpected value type: " + this.value.getClass()));
    }

    private static boolean isIntegral(JsonPrimitive primitive) {
        if (primitive.value instanceof Number) {
            Number number = (Number)primitive.value;
            return number instanceof BigInteger || number instanceof Long || number instanceof Integer || number instanceof Short || number instanceof Byte;
        }
        return false;
    }

    public JsonPrimitive(Boolean bool) {
        this.value = Objects.requireNonNull(bool);
    }

    public JsonPrimitive(Number number) {
        this.value = Objects.requireNonNull(number);
    }

    @Override
    public Number getAsNumber() {
        if (this.value instanceof Number) {
            return (Number)this.value;
        }
        if (this.value instanceof String) {
            return new LazilyParsedNumber((String)this.value);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public JsonPrimitive(Character c) {
        this.value = Objects.requireNonNull(c).toString();
    }

    @Override
    @Deprecated
    public char getAsCharacter() {
        String s = this.getAsString();
        if (s.isEmpty()) {
            throw new UnsupportedOperationException("String value is empty");
        }
        return s.charAt(0);
    }
}

