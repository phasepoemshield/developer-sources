/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.msgpack.value.Value
 */
package org.msgpack.value;

import org.msgpack.value.Value;

public interface ExtensionValue
extends Value {
    public byte getType();

    public byte[] getData();
}

