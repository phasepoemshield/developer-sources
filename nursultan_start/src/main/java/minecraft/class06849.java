/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class06338
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class06338;
import minecraft.class06813;
import minecraft.class06834;
import minecraft.class06838;

public class class06849
extends class06813 {
    public static final MapCodec<class06849> N = RecordCodecBuilder.mapCodec(instance -> class06849.N(instance).and((App)class06338.b.fieldOf("limit").forGetter(class068492 -> class068492.L)).apply(instance, class06849::new));
    private final int L;

    private class06849(class06834 class068342, int n) {
        super(class068342);
        this.L = n;
    }

    @Override
    protected class06838 N(class06838 class068382) {
        return class068382.N(this.L);
    }

    public MapCodec<class06849> N() {
        return N;
    }
}

