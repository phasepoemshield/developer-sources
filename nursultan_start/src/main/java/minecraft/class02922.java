/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheLoader
 *  com.mojang.serialization.DataResult
 */
package minecraft;

import com.google.common.cache.CacheLoader;
import com.mojang.serialization.DataResult;
import minecraft.class02908;
import minecraft.class02911;

class class02922
extends CacheLoader<class02908<?, ?>, DataResult<?>> {
    class02922(class02911 class029112) {
    }

    public DataResult<?> load(class02908<?, ?> class029082) {
        return class029082.N();
    }
}

