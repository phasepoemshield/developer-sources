/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheLoader
 *  minecraft.class05487
 *  minecraft.class06646
 *  minecraft.class07209
 */
package Nursultan;

import com.google.common.cache.CacheLoader;
import minecraft.class05487;
import minecraft.class06646;
import minecraft.class07209;

public class class10641
extends CacheLoader<class07209, class06646> {
    private final class05487 N;
    private final boolean y;

    public class10641(class05487 class054872, boolean bl) {
        this.N = class054872;
        this.y = bl;
    }

    public class06646 load(class07209 class072092) {
        return new class06646(this.N, class072092, this.y);
    }
}

