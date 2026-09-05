/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  minecraft.class01471
 *  minecraft.class01474
 *  minecraft.class05894
 *  minecraft.class05930
 *  minecraft.class06069
 *  minecraft.class06338
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07536
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.HashSet;
import java.util.List;
import minecraft.class01471;
import minecraft.class01474;
import minecraft.class05894;
import minecraft.class05930;
import minecraft.class06069;
import minecraft.class06338;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07536;

public class class03614
extends class01474 {
    public static final MapCodec<class03614> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("probability").forGetter(class036142 -> Float.valueOf(class036142.L)), (App)Codec.intRange((int)0, (int)16).fieldOf("exclusion_radius_xz").forGetter(class036142 -> class036142.u), (App)Codec.intRange((int)0, (int)16).fieldOf("exclusion_radius_y").forGetter(class036142 -> class036142.i), (App)class01471.N.fieldOf("block_provider").forGetter(class036142 -> class036142.R), (App)Codec.intRange((int)1, (int)16).fieldOf("required_empty_blocks").forGetter(class036142 -> class036142.M), (App)class06338.y((Codec)class07211.field_29502.listOf()).fieldOf("directions").forGetter(class036142 -> class036142.B)).apply(instance, class03614::new));
    protected final float L;
    protected final int u;
    protected final int i;
    protected final class01471 R;
    protected final int M;
    protected final List<class07211> B;

    public class03614(float f, int n, int n2, class01471 class014712, int n3, List<class07211> list) {
        this.L = f;
        this.u = n;
        this.i = n2;
        this.R = class014712;
        this.M = n3;
        this.B = list;
    }

    protected class05930<?> N() {
        return class05930.B;
    }

    public void N(class05894 class058942) {
        HashSet<class07209> hashSet = new HashSet<class07209>();
        class06069 class060692 = class058942.y();
        for (class07209 class072092 : class07536.N((ObjectArrayList)class058942.u(), (class06069)class060692)) {
            class07211 class072112;
            class07209 class072093 = class072092.method_10093(class072112 = (class07211)class07536.N_77(this.B, (class06069)class060692));
            if (hashSet.contains(class072093) || !(class060692.z() < this.L) || !this.N(class058942, class072092, class072112)) continue;
            class07209 class072094 = class072093.method_10069(-this.u, -this.i, -this.u);
            class07209 class072095 = class072093.method_10069(this.u, this.i, this.u);
            for (class07209 class072096 : class07209.method_10097((class07209)class072094, (class07209)class072095)) {
                hashSet.add(class072096.method_10062());
            }
            class058942.N(class072093, this.R.N(class060692, class072093));
        }
    }

    private boolean N(class05894 class058942, class07209 class072092, class07211 class072112) {
        for (int i = 1; i <= this.M; ++i) {
            class07209 class072093 = class072092.method_10079(class072112, i);
            if (class058942.N(class072093)) continue;
            return false;
        }
        return true;
    }
}

