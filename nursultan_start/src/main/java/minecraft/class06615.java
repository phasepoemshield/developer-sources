/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09415
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 *  minecraft.class05247
 *  minecraft.class06634
 *  minecraft.class07949
 *  minecraft.class08985
 */
package minecraft;

import Nursultan.class09415;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import minecraft.class05247;
import minecraft.class06634;
import minecraft.class07949;
import minecraft.class08985;

public class class06615 {
    static final class05247 N = class05247.N((float)8.0f);
    final class07949 y;
    private final LoadingCache<class09415, class08985> L = CacheBuilder.newBuilder().expireAfterAccess(class07949.y).build((CacheLoader)new class06634(this));

    public class06615(class07949 class079492) {
        this.y = class079492;
    }

    public class08985 N(class09415 class094152) {
        return (class08985)this.L.getUnchecked((Object)class094152);
    }
}

