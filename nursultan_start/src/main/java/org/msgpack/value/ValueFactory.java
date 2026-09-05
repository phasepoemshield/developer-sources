/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.msgpack.value.ImmutableArrayValue
 *  org.msgpack.value.ImmutableBinaryValue
 *  org.msgpack.value.ImmutableBooleanValue
 *  org.msgpack.value.ImmutableExtensionValue
 *  org.msgpack.value.ImmutableFloatValue
 *  org.msgpack.value.ImmutableIntegerValue
 *  org.msgpack.value.ImmutableMapValue
 *  org.msgpack.value.ImmutableNilValue
 *  org.msgpack.value.ImmutableStringValue
 *  org.msgpack.value.ImmutableTimestampValue
 *  org.msgpack.value.MapValue
 */
package org.msgpack.value;

import java.math.BigInteger;
import java.time.Instant;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.msgpack.value.ImmutableArrayValue;
import org.msgpack.value.ImmutableBinaryValue;
import org.msgpack.value.ImmutableBooleanValue;
import org.msgpack.value.ImmutableExtensionValue;
import org.msgpack.value.ImmutableFloatValue;
import org.msgpack.value.ImmutableIntegerValue;
import org.msgpack.value.ImmutableMapValue;
import org.msgpack.value.ImmutableNilValue;
import org.msgpack.value.ImmutableStringValue;
import org.msgpack.value.ImmutableTimestampValue;
import org.msgpack.value.MapValue;
import org.msgpack.value.Value;
import org.msgpack.value.impl.ImmutableArrayValueImpl;
import org.msgpack.value.impl.ImmutableBigIntegerValueImpl;
import org.msgpack.value.impl.ImmutableBinaryValueImpl;
import org.msgpack.value.impl.ImmutableBooleanValueImpl;
import org.msgpack.value.impl.ImmutableDoubleValueImpl;
import org.msgpack.value.impl.ImmutableExtensionValueImpl;
import org.msgpack.value.impl.ImmutableLongValueImpl;
import org.msgpack.value.impl.ImmutableMapValueImpl;
import org.msgpack.value.impl.ImmutableNilValueImpl;
import org.msgpack.value.impl.ImmutableStringValueImpl;
import org.msgpack.value.impl.ImmutableTimestampValueImpl;

public final class ValueFactory {
    public static ImmutableArrayValue emptyArray() {
        return ImmutableArrayValueImpl.empty();
    }

    private ValueFactory() {
    }

    public static ImmutableArrayValue newArray(Value ... valueArray) {
        if (valueArray.length == 0) {
            return ImmutableArrayValueImpl.empty();
        }
        return new ImmutableArrayValueImpl(Arrays.copyOf(valueArray, valueArray.length));
    }

    public static ImmutableArrayValue newArray(List<? extends Value> list) {
        if (list.isEmpty()) {
            return ImmutableArrayValueImpl.empty();
        }
        Value[] valueArray = list.toArray(new Value[list.size()]);
        return new ImmutableArrayValueImpl(valueArray);
    }

    public static ImmutableArrayValue newArray(Value[] valueArray, boolean bl) {
        if (valueArray.length == 0) {
            return ImmutableArrayValueImpl.empty();
        }
        if (bl) {
            return new ImmutableArrayValueImpl(valueArray);
        }
        return new ImmutableArrayValueImpl(Arrays.copyOf(valueArray, valueArray.length));
    }

    public static ImmutableStringValue newString(byte[] byArray, boolean bl) {
        if (bl) {
            return new ImmutableStringValueImpl(byArray);
        }
        return new ImmutableStringValueImpl(Arrays.copyOf(byArray, byArray.length));
    }

    public static ImmutableStringValue newString(byte[] byArray) {
        return new ImmutableStringValueImpl(byArray);
    }

    public static ImmutableStringValue newString(String string) {
        return new ImmutableStringValueImpl(string);
    }

    public static ImmutableStringValue newString(byte[] byArray, int n, int n2) {
        return ValueFactory.newString(byArray, n, n2, false);
    }

    public static ImmutableStringValue newString(byte[] byArray, int n, int n2, boolean bl) {
        if (bl && n == 0 && n2 == byArray.length) {
            return new ImmutableStringValueImpl(byArray);
        }
        return new ImmutableStringValueImpl(Arrays.copyOfRange(byArray, n, n2));
    }

    @SafeVarargs
    public static MapValue newMap(Map.Entry<? extends Value, ? extends Value> ... entryArray) {
        Value[] valueArray = new Value[entryArray.length * 2];
        for (int i = 0; i < entryArray.length; ++i) {
            valueArray[i * 2] = entryArray[i].getKey();
            valueArray[i * 2 + 1] = entryArray[i].getValue();
        }
        return ValueFactory.newMap(valueArray, true);
    }

    public static <K extends Value, V extends Value> ImmutableMapValue newMap(Map<K, V> map) {
        Value[] valueArray = new Value[map.size() * 2];
        int n = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            valueArray[n] = (Value)entry.getKey();
            valueArray[++n] = (Value)entry.getValue();
            ++n;
        }
        return new ImmutableMapValueImpl(valueArray);
    }

    public static ImmutableMapValue newMap(Value ... valueArray) {
        if (valueArray.length == 0) {
            return ImmutableMapValueImpl.empty();
        }
        return new ImmutableMapValueImpl(Arrays.copyOf(valueArray, valueArray.length));
    }

    public static ImmutableMapValue newMap(Value[] valueArray, boolean bl) {
        if (valueArray.length == 0) {
            return ImmutableMapValueImpl.empty();
        }
        if (bl) {
            return new ImmutableMapValueImpl(valueArray);
        }
        return new ImmutableMapValueImpl(Arrays.copyOf(valueArray, valueArray.length));
    }

    public static ImmutableMapValue emptyMap() {
        return ImmutableMapValueImpl.empty();
    }

    public static ImmutableExtensionValue newExtension(byte by, byte[] byArray) {
        return new ImmutableExtensionValueImpl(by, byArray);
    }

    public static Map.Entry<Value, Value> newMapEntry(Value value, Value value2) {
        return new AbstractMap.SimpleEntry<Value, Value>(value, value2);
    }

    public static MapBuilder newMapBuilder() {
        return new MapBuilder();
    }

    public static ImmutableTimestampValue newTimestamp(long l, int n) {
        return ValueFactory.newTimestamp(Instant.ofEpochSecond(l, n));
    }

    public static ImmutableTimestampValue newTimestamp(Instant instant) {
        return new ImmutableTimestampValueImpl(instant);
    }

    public static ImmutableTimestampValue newTimestamp(long l) {
        return ValueFactory.newTimestamp(Instant.ofEpochMilli(l));
    }

    public static ImmutableIntegerValue newInteger(BigInteger bigInteger) {
        return new ImmutableBigIntegerValueImpl(bigInteger);
    }

    public static ImmutableIntegerValue newInteger(int n) {
        return new ImmutableLongValueImpl(n);
    }

    public static ImmutableIntegerValue newInteger(long l) {
        return new ImmutableLongValueImpl(l);
    }

    public static ImmutableIntegerValue newInteger(byte by) {
        return new ImmutableLongValueImpl(by);
    }

    public static ImmutableIntegerValue newInteger(short s) {
        return new ImmutableLongValueImpl(s);
    }

    public static ImmutableBinaryValue newBinary(byte[] byArray, boolean bl) {
        if (bl) {
            return new ImmutableBinaryValueImpl(byArray);
        }
        return new ImmutableBinaryValueImpl(Arrays.copyOf(byArray, byArray.length));
    }

    public static ImmutableBinaryValue newBinary(byte[] byArray, int n, int n2) {
        return ValueFactory.newBinary(byArray, n, n2, false);
    }

    public static ImmutableBinaryValue newBinary(byte[] byArray, int n, int n2, boolean bl) {
        if (bl && n == 0 && n2 == byArray.length) {
            return new ImmutableBinaryValueImpl(byArray);
        }
        return new ImmutableBinaryValueImpl(Arrays.copyOfRange(byArray, n, n2));
    }

    public static ImmutableBinaryValue newBinary(byte[] byArray) {
        return ValueFactory.newBinary(byArray, false);
    }

    public static ImmutableBooleanValue newBoolean(boolean bl) {
        return bl ? ImmutableBooleanValueImpl.TRUE : ImmutableBooleanValueImpl.FALSE;
    }

    public static ImmutableNilValue newNil() {
        return ImmutableNilValueImpl.get();
    }

    public static ImmutableFloatValue newFloat(float f) {
        return new ImmutableDoubleValueImpl(f);
    }

    public static ImmutableFloatValue newFloat(double d) {
        return new ImmutableDoubleValueImpl(d);
    }

    public static class MapBuilder {
        private final Map<Value, Value> map = new LinkedHashMap<Value, Value>();

        public MapValue build() {
            return ValueFactory.newMap(this.map);
        }

        public MapBuilder put(Map.Entry<? extends Value, ? extends Value> entry) {
            this.put(entry.getKey(), entry.getValue());
            return this;
        }

        public MapBuilder put(Value value, Value value2) {
            this.map.put(value, value2);
            return this;
        }

        public MapBuilder putAll(Iterable<? extends Map.Entry<? extends Value, ? extends Value>> iterable) {
            for (Map.Entry<? extends Value, ? extends Value> entry : iterable) {
                this.put(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public MapBuilder putAll(Map<? extends Value, ? extends Value> map) {
            for (Map.Entry<? extends Value, ? extends Value> entry : map.entrySet()) {
                this.put(entry);
            }
            return this;
        }
    }
}

