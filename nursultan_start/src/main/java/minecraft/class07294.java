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
 *  minecraft.class06523
 *  minecraft.class06584
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class03762;
import minecraft.class04247;
import minecraft.class06510;
import minecraft.class06514;
import minecraft.class06523;
import minecraft.class06584;

public class class07294
implements class06514<class06523> {
    private static final MapCodec<class06523> l = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.STRING.optionalFieldOf("group", (Object)"").forGetter(class065232 -> class065232.N), (App)class03762.field_40252.fieldOf("category").orElse((Object)class03762.field_40251).forGetter(class065232 -> class065232.y), (App)class06584.u.fieldOf("result").forGetter(class065232 -> class065232.L), (App)class06510.field_46095.listOf(1, 9).fieldOf("ingredients").forGetter(class065232 -> class065232.u)).apply(instance, class06523::new));
    public static final class02362<class04247, class06523> N = class02362.N((class02362)class02389.s, class065232 -> class065232.N, (class02362)class03762.field_48353, class065232 -> class065232.y, (class02362)class06584.z, class065232 -> class065232.L, (class02362)class06510.field_48355.N_33(class02389.N()), class065232 -> class065232.u, class06523::new);

    private static /* synthetic */ class03762 L(class06523 class065232) {
        return class065232.y;
    }

    private static /* synthetic */ class06584 y(class06523 class065232) {
        return class065232.L;
    }

    public class02362<class04247, class06523> y() {
        return N;
    }

    private static /* synthetic */ List N(class06523 class065232) {
        return class065232.u;
    }

    public MapCodec<class06523> N() {
        return l;
    }
}

