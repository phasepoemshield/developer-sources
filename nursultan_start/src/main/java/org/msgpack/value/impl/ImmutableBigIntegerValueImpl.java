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

public class ImmutableBigIntegerValueImpl
extends AbstractImmutableValue
implements ImmutableIntegerValue {
    private final BigInteger value;
    private static final BigInteger BYTE_MIN = BigInteger.valueOf(-128L);
    private static final BigInteger BYTE_MAX = BigInteger.valueOf(127L);
    private static final BigInteger SHORT_MIN = BigInteger.valueOf(-32768L);
    private static final BigInteger SHORT_MAX = BigInteger.valueOf(32767L);
    private static final BigInteger INT_MIN = BigInteger.valueOf(Integer.MIN_VALUE);
    private static final BigInteger INT_MAX = BigInteger.valueOf(Integer.MAX_VALUE);
    private static final BigInteger LONG_MIN = BigInteger.valueOf(Long.MIN_VALUE);
    private static final BigInteger LONG_MAX = BigInteger.valueOf(Long.MAX_VALUE);

    public ImmutableBigIntegerValueImpl(BigInteger bigInteger) {
        this.value = bigInteger;
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
        return this.value.equals(integerValue.toBigInteger());
    }

    public String toString() {
        return this.toJson();
    }

    public int hashCode() {
        if (INT_MIN.compareTo(this.value) <= 0 && this.value.compareTo(INT_MAX) <= 0) {
            return (int)this.value.longValue();
        }
        if (LONG_MIN.compareTo(this.value) <= 0 && this.value.compareTo(LONG_MAX) <= 0) {
            long l = this.value.longValue();
            return (int)(l ^ l >>> 32);
        }
        return this.value.hashCode();
    }

    public void writeTo(MessagePacker messagePacker) throws IOException {
        messagePacker.packBigInteger(this.value);
    }

    public String toJson() {
        return this.value.toString();
    }

    public BigInteger asBigInteger() {
        return this.value;
    }

    public long toLong() {
        return this.value.longValue();
    }

    public BigInteger toBigInteger() {
        return this.value;
    }

    public int asInt() {
        if (!this.isInIntRange()) {
            throw new MessageIntegerOverflowException(this.value);
        }
        return this.value.intValue();
    }

    public int toInt() {
        return this.value.intValue();
    }

    public long asLong() {
        if (!this.isInLongRange()) {
            throw new MessageIntegerOverflowException(this.value);
        }
        return this.value.longValue();
    }

    public short asShort() {
        if (!this.isInShortRange()) {
            throw new MessageIntegerOverflowException(this.value);
        }
        return this.value.shortValue();
    }

    public byte asByte() {
        if (!this.isInByteRange()) {
            throw new MessageIntegerOverflowException(this.value);
        }
        return this.value.byteValue();
    }

    public float toFloat() {
        return this.value.floatValue();
    }

    public byte toByte() {
        return this.value.byteValue();
    }

    public short toShort() {
        return this.value.shortValue();
    }

    public double toDouble() {
        return this.value.doubleValue();
    }

    public boolean isInByteRange() {
        return 0 <= this.value.compareTo(BYTE_MIN) && this.value.compareTo(BYTE_MAX) <= 0;
    }

    public boolean isInLongRange() {
        return 0 <= this.value.compareTo(LONG_MIN) && this.value.compareTo(LONG_MAX) <= 0;
    }

    public boolean isInIntRange() {
        return 0 <= this.value.compareTo(INT_MIN) && this.value.compareTo(INT_MAX) <= 0;
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
        return 0 <= this.value.compareTo(SHORT_MIN) && this.value.compareTo(SHORT_MAX) <= 0;
    }

    public ValueType getValueType() {
        return ValueType.INTEGER;
    }

    public MessageFormat mostSuccinctMessageFormat() {
        return ImmutableBigIntegerValueImpl.mostSuccinctMessageFormat((IntegerValue)this);
    }

    public static MessageFormat mostSuccinctMessageFormat(IntegerValue integerValue) {
        if (integerValue.isInByteRange()) {
            return MessageFormat.INT8;
        }
        if (integerValue.isInShortRange()) {
            return MessageFormat.INT16;
        }
        if (integerValue.isInIntRange()) {
            return MessageFormat.INT32;
        }
        if (integerValue.isInLongRange()) {
            return MessageFormat.INT64;
        }
        return MessageFormat.UINT64;
    }
}

