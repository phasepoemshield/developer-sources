/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.msgpack.core.MessagePacker
 *  org.msgpack.value.ImmutableBinaryValue
 */
package org.msgpack.value.impl;

import java.io.IOException;
import java.util.Arrays;
import org.msgpack.core.MessagePacker;
import org.msgpack.value.ImmutableBinaryValue;
import org.msgpack.value.Value;
import org.msgpack.value.ValueType;
import org.msgpack.value.impl.AbstractImmutableRawValue;

public class ImmutableBinaryValueImpl
extends AbstractImmutableRawValue
implements ImmutableBinaryValue {
    public ImmutableBinaryValueImpl(byte[] byArray) {
        super(byArray);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Value)) {
            return false;
        }
        Value value = (Value)object;
        if (!value.isBinaryValue()) {
            return false;
        }
        if (value instanceof ImmutableBinaryValueImpl) {
            ImmutableBinaryValueImpl immutableBinaryValueImpl = (ImmutableBinaryValueImpl)((Object)value);
            return Arrays.equals(this.data, immutableBinaryValueImpl.data);
        }
        return Arrays.equals(this.data, value.asBinaryValue().asByteArray());
    }

    public int hashCode() {
        return Arrays.hashCode(this.data);
    }

    public void writeTo(MessagePacker messagePacker) throws IOException {
        messagePacker.packBinaryHeader(this.data.length);
        messagePacker.writePayload(this.data);
    }

    @Override
    public ImmutableBinaryValue asBinaryValue() {
        return this;
    }

    public ImmutableBinaryValue immutableValue() {
        return this;
    }

    public ValueType getValueType() {
        return ValueType.BINARY;
    }
}

