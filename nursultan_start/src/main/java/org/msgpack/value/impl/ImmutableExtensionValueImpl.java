/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.msgpack.core.MessagePacker
 *  org.msgpack.value.ExtensionValue
 *  org.msgpack.value.ImmutableExtensionValue
 */
package org.msgpack.value.impl;

import java.io.IOException;
import java.util.Arrays;
import org.msgpack.core.MessagePacker;
import org.msgpack.value.ExtensionValue;
import org.msgpack.value.ImmutableExtensionValue;
import org.msgpack.value.Value;
import org.msgpack.value.ValueType;
import org.msgpack.value.impl.AbstractImmutableValue;

public class ImmutableExtensionValueImpl
extends AbstractImmutableValue
implements ImmutableExtensionValue {
    private final byte type;
    private final byte[] data;

    public ImmutableExtensionValueImpl(byte by, byte[] byArray) {
        this.type = by;
        this.data = byArray;
    }

    public ValueType getValueType() {
        return ValueType.EXTENSION;
    }

    public ImmutableExtensionValue immutableValue() {
        return this;
    }

    @Override
    public ImmutableExtensionValue asExtensionValue() {
        return this;
    }

    public byte getType() {
        return this.type;
    }

    public byte[] getData() {
        return this.data;
    }

    public void writeTo(MessagePacker messagePacker) throws IOException {
        messagePacker.packExtensionTypeHeader(this.type, this.data.length);
        messagePacker.writePayload(this.data);
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
        return this.type == extensionValue.getType() && Arrays.equals(this.data, extensionValue.getData());
    }

    public int hashCode() {
        int n = 31 + this.type;
        for (byte by : this.data) {
            n = 31 * n + by;
        }
        return n;
    }

    public String toJson() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        stringBuilder.append(Byte.toString(this.type));
        stringBuilder.append(",\"");
        for (byte by : this.data) {
            stringBuilder.append(Integer.toString(by, 16));
        }
        stringBuilder.append("\"]");
        return stringBuilder.toString();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('(');
        stringBuilder.append(Byte.toString(this.type));
        stringBuilder.append(",0x");
        for (byte by : this.data) {
            stringBuilder.append(Integer.toString(by, 16));
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

