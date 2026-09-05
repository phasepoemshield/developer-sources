/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.hash.HashCode
 *  com.google.common.hash.Hasher
 *  com.mojang.serialization.DataResult
 */
package minecraft;

import com.google.common.hash.HashCode;
import com.google.common.hash.Hasher;
import com.mojang.serialization.DataResult;
import minecraft.class00166;
import minecraft.class00173;

class class00184
extends class00173<HashCode, Hasher> {
    static final /* synthetic */ boolean y;
    final /* synthetic */ class00166 L;

    public class00184(class00166 class001662) {
        this.L = class001662;
        super(class001662);
    }

    static {
        y = !class00166.class.desiredAssertionStatus();
    }

    @Override
    protected Hasher N() {
        return this.L.u.newHasher().putByte((byte)4);
    }

    @Override
    protected DataResult<HashCode> y(Hasher hasher, HashCode hashCode) {
        if (!y && !hashCode.equals((Object)this.L.i)) {
            throw new AssertionError();
        }
        hasher.putByte((byte)5);
        return DataResult.success((Object)hasher.hash());
    }

    @Override
    protected Hasher N(Hasher hasher, HashCode hashCode) {
        return hasher.putBytes(hashCode.asBytes());
    }
}

