/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.msgpack.value.NumberValue
 */
package org.msgpack.value;

import java.math.BigInteger;
import org.msgpack.core.MessageFormat;
import org.msgpack.value.NumberValue;

public interface IntegerValue
extends NumberValue {
    public BigInteger asBigInteger();

    public int asInt();

    public long asLong();

    public short asShort();

    public byte asByte();

    public boolean isInByteRange();

    public boolean isInLongRange();

    public boolean isInIntRange();

    public boolean isInShortRange();

    public MessageFormat mostSuccinctMessageFormat();
}

