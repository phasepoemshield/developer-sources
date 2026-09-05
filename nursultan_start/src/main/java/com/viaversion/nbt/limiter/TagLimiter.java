/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.limiter.TagLimiterImpl
 */
package com.viaversion.nbt.limiter;

import com.viaversion.nbt.limiter.NoopTagLimiter;
import com.viaversion.nbt.limiter.TagLimiterImpl;

public interface TagLimiter {
    public static final int DEFAULT_MAX_BYTES = 0x200000;
    public static final int DEFAULT_MAX_NESTING_LEVEL = 512;

    public static TagLimiter create(int maxBytes, int maxLevels) {
        return new TagLimiterImpl(maxBytes, maxLevels);
    }

    public void reset();

    public int bytes();

    public int maxBytes();

    default public void countDouble() {
        this.countBytes(8);
    }

    public static TagLimiter noop() {
        return NoopTagLimiter.INSTANCE;
    }

    default public void countByte() {
        this.countBytes(1);
    }

    public void countBytes(int var1);

    public void checkLevel(int var1);

    default public void countFloat() {
        this.countBytes(8);
    }

    default public void countInt() {
        this.countBytes(4);
    }

    public int maxLevels();

    default public void countShort() {
        this.countBytes(2);
    }

    default public void countLong() {
        this.countBytes(8);
    }
}

