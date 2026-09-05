/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheLoader
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMaps
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  minecraft.class04782
 *  org.apache.commons.lang3.mutable.MutableInt
 */
package minecraft;

import com.google.common.cache.CacheLoader;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import minecraft.class04313;
import minecraft.class04318;
import minecraft.class04782;
import org.apache.commons.lang3.mutable.MutableInt;

class class04301
extends CacheLoader<class04782, class04313> {
    class04301() {
    }

    public class04313 load(class04782 class047822) {
        return new class04313((Object2IntMap<class04318>)Object2IntMaps.synchronize((Object2IntMap)new Object2IntOpenHashMap()), new MutableInt(0));
    }
}

