/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class06386
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class01471;
import minecraft.class06386;

public class class01466
implements class06386 {
    public static final Codec<class01466> N = RecordCodecBuilder.create(instance -> instance.group((App)class01471.N.fieldOf("cap_provider").forGetter(class014662 -> class014662.y), (App)class01471.N.fieldOf("stem_provider").forGetter(class014662 -> class014662.L), (App)Codec.INT.fieldOf("foliage_radius").orElse((Object)2).forGetter(class014662 -> class014662.u)).apply(instance, class01466::new));
    public final class01471 y;
    public final class01471 L;
    public final int u;

    public class01466(class01471 class014712, class01471 class014713, int n) {
        this.y = class014712;
        this.L = class014713;
        this.u = n;
    }
}

