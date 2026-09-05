/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.msgpack.value.Value
 */
package org.msgpack.value;

import java.util.Iterator;
import java.util.List;
import org.msgpack.value.ArrayValue;
import org.msgpack.value.ImmutableValue;
import org.msgpack.value.Value;

public interface ImmutableArrayValue
extends ArrayValue,
ImmutableValue {
    @Override
    public Iterator<Value> iterator();

    @Override
    public List<Value> list();
}

