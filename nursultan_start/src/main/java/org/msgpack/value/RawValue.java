/*
 * Decompiled with CFR 0.152.
 */
package org.msgpack.value;

import java.nio.ByteBuffer;
import org.msgpack.value.Value;

public interface RawValue
extends Value {
    public String toString();

    public ByteBuffer asByteBuffer();

    public byte[] asByteArray();

    public String asString();
}

