/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00500
 *  minecraft.class05261
 *  minecraft.class06386
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import minecraft.class00500;
import minecraft.class05261;
import minecraft.class06209;
import minecraft.class06386;

public class class06191
implements class06386 {
    public static final Codec<class06191> N = RecordCodecBuilder.create(instance -> instance.group((App)Codec.list(class06209.N).fieldOf("targets").forGetter(class061912 -> class061912.y), (App)Codec.intRange((int)0, (int)64).fieldOf("size").forGetter(class061912 -> class061912.L), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("discard_chance_on_air_exposure").forGetter(class061912 -> Float.valueOf(class061912.u))).apply(instance, class06191::new));
    public final List<class06209> y;
    public final int L;
    public final float u;

    public class06191(class05261 class052612, class00500 class005002, int n) {
        this((List<class06209>)ImmutableList.of((Object)new class06209(class052612, class005002)), n, 0.0f);
    }

    public class06191(class05261 class052612, class00500 class005002, int n, float f) {
        this((List<class06209>)ImmutableList.of((Object)new class06209(class052612, class005002)), n, f);
    }

    public class06191(List<class06209> list, int n) {
        this(list, n, 0.0f);
    }

    public class06191(List<class06209> list, int n, float f) {
        this.L = n;
        this.y = list;
        this.u = f;
    }

    public static class06209 N(class05261 class052612, class00500 class005002) {
        return new class06209(class052612, class005002);
    }
}

