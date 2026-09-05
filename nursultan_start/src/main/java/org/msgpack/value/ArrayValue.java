/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.msgpack.value.Value
 */
package org.msgpack.value;

import java.util.Iterator;
import java.util.List;
import org.msgpack.value.Value;

public interface ArrayValue
extends Value,
Iterable<Value> {
    public int size();

    public Value get(int var1);

    @Override
    public Iterator<Value> iterator();

    public List<Value> list();

    public Value getOrNilValue(int var1);
}

