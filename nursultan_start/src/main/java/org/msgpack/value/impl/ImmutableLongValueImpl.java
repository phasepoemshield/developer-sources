/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.msgpack.core.MessageFormat
 *  org.msgpack.core.MessageIntegerOverflowException
 *  org.msgpack.core.MessagePacker
 *  org.msgpack.value.ImmutableIntegerValue
 *  org.msgpack.value.ImmutableNumberValue
 *  org.msgpack.value.IntegerValue
 */
package org.msgpack.value.impl;

import java.io.IOException;
import java.math.BigInteger;
import org.msgpack.core.MessageFormat;
import org.msgpack.core.MessageIntegerOverflowException;
import org.msgpack.core.MessagePacker;
import org.msgpack.value.ImmutableIntegerValue;
import org.msgpack.value.ImmutableNumberValue;
import org.msgpack.value.IntegerValue;
import org.msgpack.value.Value;
import org.msgpack.value.ValueType;
import org.msgpack.value.impl.AbstractImmutableValue;
import org.msgpack.value.impl.ImmutableBigIntegerValueImpl;

public class ImmutableLongValueImpl
extends AbstractImmutableValue
implements ImmutableIntegerValue {
    private final long value;
    private static final long BYTE_MIN = -128L;
    private static final long BYTE_MAX = 127L;
    private static final long SHORT_MIN = -32768L;
    private static final long SHORT_MAX = 32767L;
    private static final long INT_MIN = Integer.MIN_VALUE;
    private static final long INT_MAX = Integer.MAX_VALUE;

    public ImmutableLongValueImpl(long l) {
        this.value = l;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Value)) {
            return false;
        }
        Value value = (Value)object;
        if (!value.isIntegerValue()) {
            return false;
        }
        IntegerValue integerValue = value.asIntegerValue();
        if (!integerValue.isInLongRange()) {
            return false;
        }
        return this.value == integerValue.toLong();
    }

    public String toString() {
        return this.toJson();
    }

    public int hashCode() {
        if (Integer.MIN_VALUE <= this.value && this.value <= Integer.MAX_VALUE) {
            return (int)this.value;
        }
        return (int)(this.value ^ this.value >>> 32);
    }

    public void writeTo(MessagePacker messagePacker) throws IOException {
        messagePacker.packLong(this.value);
    }

    public String toJson() {
        return Long.toString(this.value);
    }

    public BigInteger asBigInteger() {
        return BigInteger.valueOf(this.value);
    }

    public long toLong() {
        return this.value;
    }

    public BigInteger toBigInteger() {
        return BigInteger.valueOf(this.value);
    }

    public int asInt() {
        if (!this.isInIntRange()) {
            throw new MessageIntegerOverflowException(this.value);
        }
        return (int)this.value;
    }

    public int toInt() {
        return (int)this.value;
    }

    public long asLong() {
        return this.value;
    }

    public short asShort() {
        if (!this.isInShortRange()) {
            throw new MessageIntegerOverflowException(this.value);
        }
        return (short)this.value;
    }

    public byte asByte() {
        if (!this.isInByteRange()) {
            throw new MessageIntegerOverflowException(this.value);
        }
        return (byte)this.value;
    }

    public float toFloat() {
        return this.value;
    }

    public byte toByte() {
        return (byte)this.value;
    }

    public short toShort() {
        return (short)this.value;
    }

    public double toDouble() {
        return this.value;
    }

    public boolean isInByteRange() {
        return -128L <= this.value && this.value <= 127L;
    }

    public boolean isInLongRange() {
        return true;
    }

    public boolean isInIntRange() {
        return Integer.MIN_VALUE <= this.value && this.value <= Integer.MAX_VALUE;
    }

    @Override
    public ImmutableIntegerValue asIntegerValue() {
        return this;
    }

    public ImmutableIntegerValue immutableValue() {
        return this;
    }

    @Override
    public ImmutableNumberValue asNumberValue() {
        return this;
    }

    public boolean isInShortRange() {
        return -32768L <= this.value && this.value <= 32767L;
    }

    public ValueType getValueType() {
        return ValueType.INTEGER;
    }

    public MessageFormat mostSuccinctMessageFormat() {
        return ImmutableBigIntegerValueImpl.mostSuccinctMessageFormat((IntegerValue)this);
    }
}

