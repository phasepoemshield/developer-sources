/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class01100
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class01100;

public class class01117 {
    public static final Codec<class01117> N = RecordCodecBuilder.create(instance -> instance.group((App)class01100.N.fieldOf("generate_crack_chance").orElse((Object)1.0).forGetter(class011172 -> class011172.y), (App)Codec.doubleRange((double)0.0, (double)5.0).fieldOf("base_crack_size").orElse((Object)2.0).forGetter(class011172 -> class011172.L), (App)Codec.intRange((int)0, (int)10).fieldOf("crack_point_offset").orElse((Object)2).forGetter(class011172 -> class011172.u)).apply(instance, class01117::new));
    public final double y;
    public final double L;
    public final int u;

    public class01117(double d, double d2, int n) {
        this.y = d;
        this.L = d2;
        this.u = n;
    }
}

