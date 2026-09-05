/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.msgpack.core.MessagePacker
 *  org.msgpack.value.ImmutableBooleanValue
 */
package org.msgpack.value.impl;

import java.io.IOException;
import org.msgpack.core.MessagePacker;
import org.msgpack.value.ImmutableBooleanValue;
import org.msgpack.value.Value;
import org.msgpack.value.ValueType;
import org.msgpack.value.impl.AbstractImmutableValue;

public class ImmutableBooleanValueImpl
extends AbstractImmutableValue
implements ImmutableBooleanValue {
    public static final ImmutableBooleanValue TRUE = new ImmutableBooleanValueImpl(true);
    public static final ImmutableBooleanValue FALSE = new ImmutableBooleanValueImpl(false);
    private final boolean value;

    private ImmutableBooleanValueImpl(boolean bl) {
        this.value = bl;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Value)) {
            return false;
        }
        Value value = (Value)object;
        if (!value.isBooleanValue()) {
            return false;
        }
        return this.value == value.asBooleanValue().getBoolean();
    }

    public String toString() {
        return this.toJson();
    }

    public int hashCode() {
        if (this.value) {
            return 1231;
        }
        return 1237;
    }

    public boolean getBoolean() {
        return this.value;
    }

    public void writeTo(MessagePacker messagePacker) throws IOException {
        messagePacker.packBoolean(this.value);
    }

    public String toJson() {
        return Boolean.toString(this.value);
    }

    public ImmutableBooleanValue immutableValue() {
        return this;
    }

    @Override
    public ImmutableBooleanValue asBooleanValue() {
        return this;
    }

    public ValueType getValueType() {
        return ValueType.BOOLEAN;
    }
}

