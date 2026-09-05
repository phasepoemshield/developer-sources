/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.msgpack.core.MessagePacker
 *  org.msgpack.core.buffer.MessageBuffer
 *  org.msgpack.value.ExtensionValue
 *  org.msgpack.value.ImmutableExtensionValue
 *  org.msgpack.value.ImmutableTimestampValue
 */
package org.msgpack.value.impl;

import java.io.IOException;
import java.time.Instant;
import java.util.Arrays;
import org.msgpack.core.MessagePacker;
import org.msgpack.core.buffer.MessageBuffer;
import org.msgpack.value.ExtensionValue;
import org.msgpack.value.ImmutableExtensionValue;
import org.msgpack.value.ImmutableTimestampValue;
import org.msgpack.value.TimestampValue;
import org.msgpack.value.Value;
import org.msgpack.value.ValueType;
import org.msgpack.value.impl.AbstractImmutableValue;

public class ImmutableTimestampValueImpl
extends AbstractImmutableValue
implements ImmutableExtensionValue,
ImmutableTimestampValue {
    private final Instant instant;
    private byte[] data;

    public ImmutableTimestampValueImpl(Instant instant) {
        this.instant = instant;
    }

    @Override
    public boolean isTimestampValue() {
        return true;
    }

    public byte getType() {
        return -1;
    }

    public ValueType getValueType() {
        return ValueType.EXTENSION;
    }

    public ImmutableTimestampValue immutableValue() {
        return this;
    }

    @Override
    public ImmutableExtensionValue asExtensionValue() {
        return this;
    }

    @Override
    public ImmutableTimestampValue asTimestampValue() {
        return this;
    }

    public byte[] getData() {
        if (this.data == null) {
            byte[] byArray;
            long l = this.getEpochSecond();
            int n = this.getNano();
            if (l >>> 34 == 0L) {
                long l2 = (long)n << 34 | l;
                if ((l2 & 0xFFFFFFFF00000000L) == 0L) {
                    byArray = new byte[4];
                    MessageBuffer.wrap((byte[])byArray).putInt(0, (int)l);
                } else {
                    byArray = new byte[8];
                    MessageBuffer.wrap((byte[])byArray).putLong(0, l2);
                }
            } else {
                byArray = new byte[12];
                MessageBuffer messageBuffer = MessageBuffer.wrap((byte[])byArray);
                messageBuffer.putInt(0, n);
                messageBuffer.putLong(4, l);
            }
            this.data = byArray;
        }
        return this.data;
    }

    public long getEpochSecond() {
        return this.instant.getEpochSecond();
    }

    public int getNano() {
        return this.instant.getNano();
    }

    public long toEpochMillis() {
        return this.instant.toEpochMilli();
    }

    public Instant toInstant() {
        return this.instant;
    }

    public void writeTo(MessagePacker messagePacker) throws IOException {
        messagePacker.packTimestamp(this.instant);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Value)) {
            return false;
        }
        Value value = (Value)object;
        if (!value.isExtensionValue()) {
            return false;
        }
        ExtensionValue extensionValue = value.asExtensionValue();
        if (extensionValue instanceof TimestampValue) {
            TimestampValue timestampValue = (TimestampValue)extensionValue;
            return this.instant.equals(timestampValue.toInstant());
        }
        return -1 == extensionValue.getType() && Arrays.equals(this.getData(), extensionValue.getData());
    }

    public int hashCode() {
        int n = -1;
        n *= 31;
        n = this.instant.hashCode();
        return n;
    }

    public String toJson() {
        return "\"" + this.toInstant().toString() + "\"";
    }

    public String toString() {
        return this.toInstant().toString();
    }
}

