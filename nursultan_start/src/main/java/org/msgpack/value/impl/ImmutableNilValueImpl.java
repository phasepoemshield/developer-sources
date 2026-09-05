/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.msgpack.core.MessagePacker
 *  org.msgpack.value.ImmutableNilValue
 */
package org.msgpack.value.impl;

import java.io.IOException;
import org.msgpack.core.MessagePacker;
import org.msgpack.value.ImmutableNilValue;
import org.msgpack.value.Value;
import org.msgpack.value.ValueType;
import org.msgpack.value.impl.AbstractImmutableValue;

public class ImmutableNilValueImpl
extends AbstractImmutableValue
implements ImmutableNilValue {
    private static ImmutableNilValue instance = new ImmutableNilValueImpl();

    private ImmutableNilValueImpl() {
    }

    public static ImmutableNilValue get() {
        return instance;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Value)) {
            return false;
        }
        return ((Value)object).isNilValue();
    }

    public String toString() {
        return this.toJson();
    }

    public int hashCode() {
        return 0;
    }

    public void writeTo(MessagePacker messagePacker) throws IOException {
        messagePacker.packNil();
    }

    public String toJson() {
        return "null";
    }

    @Override
    public ImmutableNilValue asNilValue() {
        return this;
    }

    public ImmutableNilValue immutableValue() {
        return this;
    }

    public ValueType getValueType() {
        return ValueType.NIL;
    }
}

