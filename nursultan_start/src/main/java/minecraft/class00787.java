/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class03222
 *  minecraft.class03543
 *  minecraft.class03556
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.stream.Stream;
import minecraft.class00765;
import minecraft.class00780;
import minecraft.class03222;
import minecraft.class03543;
import minecraft.class03556;

public class class00787
extends class00765 {
    public static final MapCodec<class00787> y = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class00780.u.fieldOf("biomes").forGetter(class007872 -> class007872.L), (App)Codec.intRange((int)0, (int)62).fieldOf("scale").orElse((Object)2).forGetter(class007872 -> class007872.i)).apply(instance, class00787::new));
    private final class03543<class00780> L;
    private final int u;
    private final int i;

    public class00787(class03543<class00780> class035432, int n) {
        this.L = class035432;
        this.u = n + 2;
        this.i = n;
    }

    @Override
    protected Stream<class03556<class00780>> y() {
        return this.L.N();
    }

    @Override
    protected MapCodec<? extends class00765> N() {
        return y;
    }

    @Override
    public class03556<class00780> method_38109(int n, int n2, int n3, class03222 class032222) {
        return this.L.N(Math.floorMod((n >> this.u) + (n3 >> this.u), this.L.y()));
    }
}

