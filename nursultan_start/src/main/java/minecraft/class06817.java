/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00845
 *  minecraft.class06584
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Predicate;
import minecraft.class00845;
import minecraft.class06584;
import minecraft.class06813;
import minecraft.class06834;
import minecraft.class06838;

public class class06817
extends class06813 {
    public static final MapCodec<class06817> N = RecordCodecBuilder.mapCodec(instance -> class06817.N(instance).and((App)class00845.N.fieldOf("item_filter").forGetter(class068172 -> class068172.L)).apply(instance, class06817::new));
    private final class00845 L;

    private class06817(class06834 class068342, class00845 class008452) {
        super(class068342);
        this.L = class008452;
    }

    @Override
    protected class06838 N(class06838 class068382) {
        return class068382.N_65((Predicate<class06584>)this.L);
    }

    public MapCodec<class06817> N() {
        return N;
    }
}

