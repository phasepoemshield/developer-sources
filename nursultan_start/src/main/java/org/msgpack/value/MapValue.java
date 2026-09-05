/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.msgpack.value.Value
 */
package org.msgpack.value;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.msgpack.value.Value;

public interface MapValue
extends Value {
    public int size();

    public Set<Value> keySet();

    public Set<Map.Entry<Value, Value>> entrySet();

    public Collection<Value> values();

    public Map<Value, Value> map();

    public Value[] getKeyValueArray();
}

