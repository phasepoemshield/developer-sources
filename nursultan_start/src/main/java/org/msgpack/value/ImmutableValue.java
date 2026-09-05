/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.msgpack.value.Value
 */
package org.msgpack.value;

import org.msgpack.value.ImmutableArrayValue;
import org.msgpack.value.ImmutableBinaryValue;
import org.msgpack.value.ImmutableBooleanValue;
import org.msgpack.value.ImmutableFloatValue;
import org.msgpack.value.ImmutableIntegerValue;
import org.msgpack.value.ImmutableMapValue;
import org.msgpack.value.ImmutableNilValue;
import org.msgpack.value.ImmutableRawValue;
import org.msgpack.value.ImmutableStringValue;
import org.msgpack.value.ImmutableTimestampValue;
import org.msgpack.value.Value;

public interface ImmutableValue
extends Value {
    public ImmutableMapValue asMapValue();

    public ImmutableRawValue asRawValue();

    public ImmutableNilValue asNilValue();

    public ImmutableBinaryValue asBinaryValue();

    public ImmutableArrayValue asArrayValue();

    public ImmutableIntegerValue asIntegerValue();

    public ImmutableBooleanValue asBooleanValue();

    public ImmutableFloatValue asFloatValue();

    public ImmutableStringValue asStringValue();

    public ImmutableTimestampValue asTimestampValue();
}

