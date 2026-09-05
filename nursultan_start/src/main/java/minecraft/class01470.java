/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00891
 *  minecraft.class03541
 *  minecraft.class03543
 *  minecraft.class04227
 *  minecraft.class04688
 *  minecraft.class05946
 *  minecraft.class06386
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00891;
import minecraft.class03541;
import minecraft.class03543;
import minecraft.class04227;
import minecraft.class04688;
import minecraft.class05946;
import minecraft.class06386;

public class class01470
implements class06386 {
    public static final Codec<class01470> N = RecordCodecBuilder.create(instance -> instance.group((App)class04688.N.fieldOf("state").forGetter(class014702 -> class014702.y), (App)Codec.BOOL.fieldOf("requires_block_below").orElse((Object)true).forGetter(class014702 -> class014702.L), (App)Codec.INT.fieldOf("rock_count").orElse((Object)4).forGetter(class014702 -> class014702.u), (App)Codec.INT.fieldOf("hole_count").orElse((Object)1).forGetter(class014702 -> class014702.i), (App)class03541.N((class05946)class04227.Z).fieldOf("valid_blocks").forGetter(class014702 -> class014702.M)).apply(instance, class01470::new));
    public final class04688 y;
    public final boolean L;
    public final int u;
    public final int i;
    public final class03543<class00891> M;

    public class01470(class04688 class046882, boolean bl, int n, int n2, class03543<class00891> class035432) {
        this.y = class046882;
        this.L = bl;
        this.u = n;
        this.i = n2;
        this.M = class035432;
    }
}

