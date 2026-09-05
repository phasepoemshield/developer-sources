/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  minecraft.class04995
 *  minecraft.class06055
 *  minecraft.class06057
 *  minecraft.class06069
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import minecraft.class03855;
import minecraft.class03862;
import minecraft.class04995;
import minecraft.class06055;
import minecraft.class06057;
import minecraft.class06069;
import org.slf4j.Logger;

public class class03854
extends class03855 {
    public static final MapCodec<class03854> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06055.N.fieldOf("min_inclusive").forGetter(class038542 -> class038542.u), (App)class06055.N.fieldOf("max_inclusive").forGetter(class038542 -> class038542.i)).apply(instance, class03854::new));
    private static final Logger y = LogUtils.getLogger();
    private final class06055 u;
    private final class06055 i;
    private final LongSet R = new LongOpenHashSet();

    private class03854(class06055 class060552, class06055 class060553) {
        this.u = class060552;
        this.i = class060553;
    }

    public String toString() {
        return "[" + String.valueOf(this.u) + "-" + String.valueOf(this.i) + "]";
    }

    @Override
    public int N(class06069 class060692, class06057 class060572) {
        int n;
        int n2 = this.u.N(class060572);
        if (n2 > (n = this.i.N(class060572))) {
            if (this.R.add((long)n2 << 32 | (long)n)) {
                y.warn("Empty height range: {}", (Object)this);
            }
            return n2;
        }
        return class04995.y((class06069)class060692, (int)n2, (int)n);
    }

    public static class03854 N(class06055 class060552, class06055 class060553) {
        return new class03854(class060552, class060553);
    }

    @Override
    public class03862<?> N() {
        return class03862.y;
    }
}

