/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00500
 *  minecraft.class04025
 *  minecraft.class06386
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00500;
import minecraft.class04025;
import minecraft.class06386;

public class class06020
implements class06386 {
    public static final Codec<class06020> N = RecordCodecBuilder.create(instance -> instance.group((App)class00500.N.fieldOf("valid_base_block").forGetter(class060202 -> class060202.y), (App)class00500.N.fieldOf("stem_state").forGetter(class060202 -> class060202.L), (App)class00500.N.fieldOf("hat_state").forGetter(class060202 -> class060202.u), (App)class00500.N.fieldOf("decor_state").forGetter(class060202 -> class060202.i), (App)class04025.y.fieldOf("replaceable_blocks").forGetter(class060202 -> class060202.M), (App)Codec.BOOL.fieldOf("planted").orElse((Object)false).forGetter(class060202 -> class060202.B)).apply(instance, class06020::new));
    public final class00500 y;
    public final class00500 L;
    public final class00500 u;
    public final class00500 i;
    public final class04025 M;
    public final boolean B;

    public class06020(class00500 class005002, class00500 class005003, class00500 class005004, class00500 class005005, class04025 class040252, boolean bl) {
        this.y = class005002;
        this.L = class005003;
        this.u = class005004;
        this.i = class005005;
        this.M = class040252;
        this.B = bl;
    }
}

