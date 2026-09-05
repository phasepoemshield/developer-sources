/*
 * Decompiled with CFR 0.152.
 */
package org.msgpack.value;

import java.math.BigInteger;
import org.msgpack.value.Value;

public interface NumberValue
extends Value {
    public long toLong();

    public BigInteger toBigInteger();

    public int toInt();

    public float toFloat();

    public byte toByte();

    public short toShort();

    public double toDouble();
}

