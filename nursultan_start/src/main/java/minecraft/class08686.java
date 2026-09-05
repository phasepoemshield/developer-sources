/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class03762
 *  minecraft.class04247
 *  minecraft.class06510
 *  minecraft.class06514
 *  minecraft.class08604
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class03762;
import minecraft.class04247;
import minecraft.class06510;
import minecraft.class06514;
import minecraft.class08604;
import minecraft.class08690;

public class class08686
implements class06514<class08690> {
    private static final MapCodec<class08690> l = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.STRING.optionalFieldOf("group", (Object)"").forGetter(class086902 -> class086902.N), (App)class03762.field_40252.fieldOf("category").orElse((Object)class03762.field_40251).forGetter(class086902 -> class086902.y), (App)class06510.field_46095.fieldOf("input").forGetter(class086902 -> class086902.L), (App)class06510.field_46095.fieldOf("material").forGetter(class086902 -> class086902.u), (App)class08604.N.fieldOf("result").forGetter(class086902 -> class086902.i)).apply(instance, class08690::new));
    public static final class02362<class04247, class08690> N = class02362.N((class02362)class02389.s, class086902 -> class086902.N, (class02362)class03762.field_48353, class086902 -> class086902.y, (class02362)class06510.field_48355, class086902 -> class086902.L, (class02362)class06510.field_48355, class086902 -> class086902.u, (class02362)class08604.y, class086902 -> class086902.i, class08690::new);

    private static /* synthetic */ class06510 L(class08690 class086902) {
        return class086902.L;
    }

    private static /* synthetic */ String i(class08690 class086902) {
        return class086902.N;
    }

    private static /* synthetic */ class03762 u(class08690 class086902) {
        return class086902.y;
    }

    private static /* synthetic */ class06510 y(class08690 class086902) {
        return class086902.u;
    }

    public class02362<class04247, class08690> y() {
        return N;
    }

    private static /* synthetic */ class08604 N(class08690 class086902) {
        return class086902.i;
    }

    public MapCodec<class08690> N() {
        return l;
    }
}

