/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.msgpack.core.MessagePacker
 *  org.msgpack.value.ArrayValue
 *  org.msgpack.value.BinaryValue
 *  org.msgpack.value.BooleanValue
 *  org.msgpack.value.ExtensionValue
 *  org.msgpack.value.FloatValue
 *  org.msgpack.value.ImmutableValue
 *  org.msgpack.value.IntegerValue
 *  org.msgpack.value.MapValue
 *  org.msgpack.value.NilValue
 */
package org.msgpack.value;

import java.io.IOException;
import org.msgpack.core.MessagePacker;
import org.msgpack.value.ArrayValue;
import org.msgpack.value.BinaryValue;
import org.msgpack.value.BooleanValue;
import org.msgpack.value.ExtensionValue;
import org.msgpack.value.FloatValue;
import org.msgpack.value.ImmutableValue;
import org.msgpack.value.IntegerValue;
import org.msgpack.value.MapValue;
import org.msgpack.value.NilValue;
import org.msgpack.value.NumberValue;
import org.msgpack.value.RawValue;
import org.msgpack.value.StringValue;
import org.msgpack.value.TimestampValue;
import org.msgpack.value.ValueType;

public interface Value {
    public boolean equals(Object var1);

    public void writeTo(MessagePacker var1) throws IOException;

    public String toJson();

    public boolean isMapValue();

    public boolean isNilValue();

    public MapValue asMapValue();

    public RawValue asRawValue();

    public boolean isRawValue();

    public NilValue asNilValue();

    public boolean isExtensionValue();

    public ExtensionValue asExtensionValue();

    public boolean isIntegerValue();

    public BinaryValue asBinaryValue();

    public ArrayValue asArrayValue();

    public boolean isNumberValue();

    public boolean isTimestampValue();

    public boolean isFloatValue();

    public IntegerValue asIntegerValue();

    public ImmutableValue immutableValue();

    public boolean isStringValue();

    public boolean isArrayValue();

    public BooleanValue asBooleanValue();

    public FloatValue asFloatValue();

    public NumberValue asNumberValue();

    public StringValue asStringValue();

    public boolean isBooleanValue();

    public boolean isBinaryValue();

    public TimestampValue asTimestampValue();

    public ValueType getValueType();
}

