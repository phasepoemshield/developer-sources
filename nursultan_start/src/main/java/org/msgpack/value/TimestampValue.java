/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.msgpack.value.ExtensionValue
 */
package org.msgpack.value;

import java.time.Instant;
import org.msgpack.value.ExtensionValue;

public interface TimestampValue
extends ExtensionValue {
    public long getEpochSecond();

    public int getNano();

    public long toEpochMillis();

    public Instant toInstant();
}

