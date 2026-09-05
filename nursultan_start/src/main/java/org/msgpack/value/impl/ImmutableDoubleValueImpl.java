/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.msgpack.core.MessagePacker
 *  org.msgpack.value.ImmutableFloatValue
 *  org.msgpack.value.ImmutableNumberValue
 */
package org.msgpack.value.impl;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.msgpack.core.MessagePacker;
import org.msgpack.value.ImmutableFloatValue;
import org.msgpack.value.ImmutableNumberValue;
import org.msgpack.value.Value;
import org.msgpack.value.ValueType;
import org.msgpack.value.impl.AbstractImmutableValue;

public class ImmutableDoubleValueImpl
extends AbstractImmutableValue
implements ImmutableFloatValue {
    private final double value;

    public ImmutableDoubleValueImpl(double d) {
        this.value = d;
    }

    public ValueType getValueType() {
        return ValueType.FLOAT;
    }

    public ImmutableDoubleValueImpl immutableValue() {
        return this;
    }

    @Override
    public ImmutableNumberValue asNumberValue() {
        return this;
    }

    @Override
    public ImmutableFloatValue asFloatValue() {
        return this;
    }

    public byte toByte() {
        return (byte)this.value;
    }

    public short toShort() {
        return (short)this.value;
    }

    public int toInt() {
        return (int)this.value;
    }

    public long toLong() {
        return (long)this.value;
    }

    public BigInteger toBigInteger() {
        return new BigDecimal(this.value).toBigInteger();
    }

    public float toFloat() {
        return (float)this.value;
    }

    public double toDouble() {
        return this.value;
    }

    public void writeTo(MessagePacker messagePacker) throws IOException {
        messagePacker.packDouble(this.value);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Value)) {
            return false;
        }
        Value value = (Value)object;
        if (!value.isFloatValue()) {
            return false;
        }
        return this.value == value.asFloatValue().toDouble();
    }

    public int hashCode() {
        long l = Double.doubleToLongBits(this.value);
        return (int)(l ^ l >>> 32);
    }

    public String toJson() {
        if (Double.isNaN(this.value) || Double.isInfinite(this.value)) {
            return "null";
        }
        return Double.toString(this.value);
    }

    public String toString() {
        return Double.toString(this.value);
    }
}

