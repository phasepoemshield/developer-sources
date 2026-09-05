/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.msgpack.core.MessagePacker
 *  org.msgpack.value.ArrayValue
 *  org.msgpack.value.ImmutableArrayValue
 */
package org.msgpack.value.impl;

import java.io.IOException;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import org.msgpack.core.MessagePacker;
import org.msgpack.value.ArrayValue;
import org.msgpack.value.ImmutableArrayValue;
import org.msgpack.value.Value;
import org.msgpack.value.ValueType;
import org.msgpack.value.impl.AbstractImmutableValue;
import org.msgpack.value.impl.ImmutableNilValueImpl;

public class ImmutableArrayValueImpl
extends AbstractImmutableValue
implements ImmutableArrayValue {
    private static final ImmutableArrayValueImpl EMPTY = new ImmutableArrayValueImpl(new Value[0]);
    private final Value[] array;

    public ImmutableArrayValueImpl(Value[] valueArray) {
        this.array = valueArray;
    }

    public int size() {
        return this.array.length;
    }

    public Value get(int n) {
        return this.array[n];
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Value)) {
            return false;
        }
        Value value = (Value)object;
        if (value instanceof ImmutableArrayValueImpl) {
            ImmutableArrayValueImpl immutableArrayValueImpl = (ImmutableArrayValueImpl)((Object)value);
            return Arrays.equals(this.array, immutableArrayValueImpl.array);
        }
        if (!value.isArrayValue()) {
            return false;
        }
        ArrayValue arrayValue = value.asArrayValue();
        if (this.size() != arrayValue.size()) {
            return false;
        }
        Iterator iterator = arrayValue.iterator();
        for (int i = 0; i < this.array.length; ++i) {
            if (iterator.hasNext() && this.array[i].equals(iterator.next())) continue;
            return false;
        }
        return true;
    }

    public String toString() {
        if (this.array.length == 0) {
            return "[]";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        ImmutableArrayValueImpl.appendString(stringBuilder, this.array[0]);
        for (int i = 1; i < this.array.length; ++i) {
            stringBuilder.append(",");
            ImmutableArrayValueImpl.appendString(stringBuilder, this.array[i]);
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public int hashCode() {
        int n = 1;
        for (int i = 0; i < this.array.length; ++i) {
            Value value = this.array[i];
            n = 31 * n + value.hashCode();
        }
        return n;
    }

    public Iterator<Value> iterator() {
        return new Ite(this.array);
    }

    public List<Value> list() {
        return new ImmutableArrayValueList(this.array);
    }

    public static ImmutableArrayValue empty() {
        return EMPTY;
    }

    public void writeTo(MessagePacker messagePacker) throws IOException {
        messagePacker.packArrayHeader(this.array.length);
        for (int i = 0; i < this.array.length; ++i) {
            this.array[i].writeTo(messagePacker);
        }
    }

    public String toJson() {
        if (this.array.length == 0) {
            return "[]";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        stringBuilder.append(this.array[0].toJson());
        for (int i = 1; i < this.array.length; ++i) {
            stringBuilder.append(",");
            stringBuilder.append(this.array[i].toJson());
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public Value getOrNilValue(int n) {
        if (n < this.array.length && n >= 0) {
            return this.array[n];
        }
        return ImmutableNilValueImpl.get();
    }

    private static void appendString(StringBuilder stringBuilder, Value value) {
        if (value.isRawValue()) {
            stringBuilder.append(value.toJson());
        } else {
            stringBuilder.append(value.toString());
        }
    }

    @Override
    public ImmutableArrayValue asArrayValue() {
        return this;
    }

    public ImmutableArrayValue immutableValue() {
        return this;
    }

    public ValueType getValueType() {
        return ValueType.ARRAY;
    }

    private static class Ite
    implements Iterator<Value> {
        private final Value[] array;
        private int index;

        public Ite(Value[] valueArray) {
            this.array = valueArray;
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            return this.index != this.array.length;
        }

        @Override
        public Value next() {
            int n = this.index;
            if (n >= this.array.length) {
                throw new NoSuchElementException();
            }
            this.index = n + 1;
            return this.array[n];
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private static class ImmutableArrayValueList
    extends AbstractList<Value> {
        private final Value[] array;

        public ImmutableArrayValueList(Value[] valueArray) {
            this.array = valueArray;
        }

        @Override
        public Value get(int n) {
            return this.array[n];
        }

        @Override
        public int size() {
            return this.array.length;
        }
    }
}

