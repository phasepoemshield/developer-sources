/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class02928
 *  minecraft.class02936
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class02928;
import minecraft.class02936;
import minecraft.class06813;
import minecraft.class06834;
import minecraft.class06838;

public class class06840
extends class06813 {
    public static final MapCodec<class06840> N = RecordCodecBuilder.mapCodec(instance -> class06840.N(instance).and((App)class02936.i.fieldOf("component").forGetter(class068402 -> class068402.L)).apply(instance, class06840::new));
    private final class02928<?> L;

    private class06840(class06834 class068342, class02928<?> class029282) {
        super(class068342);
        this.L = class029282;
    }

    @Override
    protected class06838 N(class06838 class068382) {
        return class068382.N(arg_0 -> this.L.N(arg_0));
    }

    public MapCodec<class06840> N() {
        return N;
    }
}

