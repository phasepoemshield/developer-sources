/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheLoader
 *  com.google.common.hash.HashCode
 *  com.mojang.serialization.DynamicOps
 *  minecraft.class00166
 *  minecraft.class02480
 */
package minecraft;

import com.google.common.cache.CacheLoader;
import com.google.common.hash.HashCode;
import com.mojang.serialization.DynamicOps;
import minecraft.class00166;
import minecraft.class02480;
import minecraft.class04765;

class class04768
extends CacheLoader<class02480<?>, Integer> {
    private final DynamicOps<HashCode> y;
    final /* synthetic */ class04765 N;

    class04768(class04765 class047652) {
        this.N = class047652;
        this.y = this.N.N.method_56673().N((DynamicOps)class00166.L);
    }

    public Integer load(class02480<?> class024802) {
        return ((HashCode)class024802.N(this.y).getOrThrow(string -> new IllegalArgumentException("Failed to hash " + String.valueOf(class024802) + ": " + string))).asInt();
    }
}

