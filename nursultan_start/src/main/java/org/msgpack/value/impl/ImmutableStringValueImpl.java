/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.msgpack.core.MessagePacker
 *  org.msgpack.value.ImmutableStringValue
 */
package org.msgpack.value.impl;

import java.io.IOException;
import java.util.Arrays;
import org.msgpack.core.MessagePacker;
import org.msgpack.value.ImmutableStringValue;
import org.msgpack.value.Value;
import org.msgpack.value.ValueType;
import org.msgpack.value.impl.AbstractImmutableRawValue;

public class ImmutableStringValueImpl
extends AbstractImmutableRawValue
implements ImmutableStringValue {
    public ImmutableStringValueImpl(byte[] byArray) {
        super(byArray);
    }

    public ImmutableStringValueImpl(String string) {
        super(string);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof Value)) {
            return false;
        }
        Value value = (Value)object;
        if (!value.isStringValue()) {
            return false;
        }
        if (value instanceof ImmutableStringValueImpl) {
            ImmutableStringValueImpl immutableStringValueImpl = (ImmutableStringValueImpl)((Object)value);
            return Arrays.equals(this.data, immutableStringValueImpl.data);
        }
        return Arrays.equals(this.data, value.asStringValue().asByteArray());
    }

    public int hashCode() {
        return Arrays.hashCode(this.data);
    }

    public void writeTo(MessagePacker messagePacker) throws IOException {
        messagePacker.packRawStringHeader(this.data.length);
        messagePacker.writePayload(this.data);
    }

    public ImmutableStringValue immutableValue() {
        return this;
    }

    @Override
    public ImmutableStringValue asStringValue() {
        return this;
    }

    public ValueType getValueType() {
        return ValueType.STRING;
    }
}

