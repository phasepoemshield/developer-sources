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

public class class08492
extends class01474 {
    public static final MapCodec<class08492> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("probability").forGetter(class084922 -> Float.valueOf(class084922.L)), (App)class01471.N.fieldOf("block_provider").forGetter(class084922 -> class084922.u), (App)class06338.y((Codec)class07211.field_29502.listOf()).fieldOf("directions").forGetter(class084922 -> class084922.i)).apply(instance, class08492::new));
    private final float L;
    private final class01471 u;
    private final List<class07211> i;

    public class08492(float f, class01471 class014712, List<class07211> list) {
        this.L = f;
        this.u = class014712;
        this.i = list;
    }

    public void N(class05894 class058942) {
        class06069 class060692 = class058942.y();
        for (class07209 class072092 : class07536.N((ObjectArrayList)class058942.L(), (class06069)class060692)) {
            class07211 class072112 = (class07211)class07536.N_77(this.i, (class06069)class060692);
            class07209 class072093 = class072092.method_10093(class072112);
            if (!(class060692.z() <= this.L) || !class058942.N(class072093)) continue;
            class058942.N(class072093, this.u.N(class060692, class072093));
        }
    }

    protected class05930<?> N() {
        return class05930.z;
    }
}

