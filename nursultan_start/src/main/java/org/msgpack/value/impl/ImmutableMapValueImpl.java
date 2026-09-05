/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.msgpack.core.MessagePacker
 *  org.msgpack.value.ImmutableMapValue
 *  org.msgpack.value.MapValue
 */
package org.msgpack.value.impl;

import java.io.IOException;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.msgpack.core.MessagePacker;
import org.msgpack.value.ImmutableMapValue;
import org.msgpack.value.MapValue;
import org.msgpack.value.Value;
import org.msgpack.value.ValueType;
import org.msgpack.value.impl.AbstractImmutableValue;
import org.msgpack.value.impl.ImmutableStringValueImpl;

public class ImmutableMapValueImpl
extends AbstractImmutableValue
implements ImmutableMapValue {
    private static final ImmutableMapValueImpl EMPTY = new ImmutableMapValueImpl(new Value[0]);
    private final Value[] kvs;

    public static ImmutableMapValue empty() {
        return EMPTY;
    }

    public ImmutableMapValueImpl(Value[] valueArray) {
        this.kvs = valueArray;
    }

    public ValueType getValueType() {
        return ValueType.MAP;
    }

    public ImmutableMapValue immutableValue() {
        return this;
    }

    @Override
    public ImmutableMapValue asMapValue() {
        return this;
    }

    public Value[] getKeyValueArray() {
        return Arrays.copyOf(this.kvs, this.kvs.length);
    }

    public int size() {
        return this.kvs.length / 2;
    }

    public Set<Value> keySet() {
        return new KeySet(this.kvs);
    }

    public Set<Map.Entry<Value, Value>> entrySet() {
        return new EntrySet(this.kvs);
    }

    public Collection<Value> values() {
        return new ValueCollection(this.kvs);
    }

    public Map<Value, Value> map() {
        return new ImmutableMapValueMap(this.kvs);
    }

    public void writeTo(MessagePacker messagePacker) throws IOException {
        messagePacker.packMapHeader(this.kvs.length / 2);
        for (int i = 0; i < this.kvs.length; ++i) {
            this.kvs[i].writeTo(messagePacker);
        }
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Value)) {
            return false;
        }
        Value value = (Value)object;
        if (!value.isMapValue()) {
            return false;
        }
        MapValue mapValue = value.asMapValue();
        return this.map().equals(mapValue.map());
    }

    public int hashCode() {
        int n = 0;
        for (int i = 0; i < this.kvs.length; i += 2) {
            n += this.kvs[i].hashCode() ^ this.kvs[i + 1].hashCode();
        }
        return n;
    }

    public String toJson() {
        if (this.kvs.length == 0) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{");
        ImmutableMapValueImpl.appendJsonKey(stringBuilder, this.kvs[0]);
        stringBuilder.append(":");
        stringBuilder.append(this.kvs[1].toJson());
        for (int i = 2; i < this.kvs.length; i += 2) {
            stringBuilder.append(",");
            ImmutableMapValueImpl.appendJsonKey(stringBuilder, this.kvs[i]);
            stringBuilder.append(":");
            stringBuilder.append(this.kvs[i + 1].toJson());
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    private static void appendJsonKey(StringBuilder stringBuilder, Value value) {
        if (value.isRawValue()) {
            stringBuilder.append(value.toJson());
        } else {
            ImmutableStringValueImpl.appendJsonString(stringBuilder, value.toString());
        }
    }

    public String toString() {
        if (this.kvs.length == 0) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{");
        ImmutableMapValueImpl.appendString(stringBuilder, this.kvs[0]);
        stringBuilder.append(":");
        ImmutableMapValueImpl.appendString(stringBuilder, this.kvs[1]);
        for (int i = 2; i < this.kvs.length; i += 2) {
            stringBuilder.append(",");
            ImmutableMapValueImpl.appendString(stringBuilder, this.kvs[i]);
            stringBuilder.append(":");
            ImmutableMapValueImpl.appendString(stringBuilder, this.kvs[i + 1]);
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    private static void appendString(StringBuilder stringBuilder, Value value) {
        if (value.isRawValue()) {
            stringBuilder.append(value.toJson());
        } else {
            stringBuilder.append(value.toString());
        }
    }

    private static class EntryIterator
    implements Iterator<Value> {
        private Value[] kvs;
        private int index;

        public EntryIterator(Value[] valueArray, int n) {
            this.kvs = valueArray;
            this.index = n;
        }

        @Override
        public boolean hasNext() {
            return this.index < this.kvs.length;
        }

        @Override
        public Value next() {
            int n = this.index;
            if (n >= this.kvs.length) {
                throw new NoSuchElementException();
            }
            this.index = n + 2;
            return this.kvs[n];
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private static class ValueCollection
    extends AbstractCollection<Value> {
        private Value[] kvs;

        ValueCollection(Value[] valueArray) {
            this.kvs = valueArray;
        }

        @Override
        public int size() {
            return this.kvs.length / 2;
        }

        @Override
        public Iterator<Value> iterator() {
            return new EntryIterator(this.kvs, 1);
        }
    }

    private static class KeySet
    extends AbstractSet<Value> {
        private Value[] kvs;

        KeySet(Value[] valueArray) {
            this.kvs = valueArray;
        }

        @Override
        public int size() {
            return this.kvs.length / 2;
        }

        @Override
        public Iterator<Value> iterator() {
            return new EntryIterator(this.kvs, 0);
        }
    }

    private static class EntrySetIterator
    implements Iterator<Map.Entry<Value, Value>> {
        private final Value[] kvs;
        private int index;

        EntrySetIterator(Value[] valueArray) {
            this.kvs = valueArray;
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            return this.index < this.kvs.length;
        }

        @Override
        public Map.Entry<Value, Value> next() {
            if (this.index >= this.kvs.length) {
                throw new NoSuchElementException();
            }
            Value value = this.kvs[this.index];
            Value value2 = this.kvs[this.index + 1];
            AbstractMap.SimpleImmutableEntry<Value, Value> simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry<Value, Value>(value, value2);
            this.index += 2;
            return simpleImmutableEntry;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private static class EntrySet
    extends AbstractSet<Map.Entry<Value, Value>> {
        private final Value[] kvs;

        EntrySet(Value[] valueArray) {
            this.kvs = valueArray;
        }

        @Override
        public int size() {
            return this.kvs.length / 2;
        }

        @Override
        public Iterator<Map.Entry<Value, Value>> iterator() {
            return new EntrySetIterator(this.kvs);
        }
    }

    private static class ImmutableMapValueMap
    extends AbstractMap<Value, Value> {
        private final Value[] kvs;

        public ImmutableMapValueMap(Value[] valueArray) {
            this.kvs = valueArray;
        }

        @Override
        public Set<Map.Entry<Value, Value>> entrySet() {
            return new EntrySet(this.kvs);
        }
    }
}

