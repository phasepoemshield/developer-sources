/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheLoader
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class07003
 */
package minecraft;

import com.google.common.cache.CacheLoader;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class07003;

class class00875
extends CacheLoader<class00494, Boolean> {
    class00875() {
    }

    public Boolean load(class00494 class004942) {
        return !class00389.L((class00494)class00389.y(), (class00494)class004942, (class07003)class07003.M);
    }
}

