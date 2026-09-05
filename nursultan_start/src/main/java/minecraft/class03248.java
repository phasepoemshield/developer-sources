/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class02362
 *  minecraft.class03280
 *  minecraft.class04247
 *  minecraft.class06510
 *  minecraft.class06514
 *  minecraft.class08604
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class02362;
import minecraft.class03280;
import minecraft.class04247;
import minecraft.class06510;
import minecraft.class06514;
import minecraft.class08604;

public class class03248
implements class06514<class03280> {
    private static final MapCodec<class03280> l = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06510.field_46095.optionalFieldOf("template").forGetter(class032802 -> class032802.N), (App)class06510.field_46095.fieldOf("base").forGetter(class032802 -> class032802.y), (App)class06510.field_46095.optionalFieldOf("addition").forGetter(class032802 -> class032802.L), (App)class08604.N.fieldOf("result").forGetter(class032802 -> class032802.u)).apply(instance, class03280::new));
    public static final class02362<class04247, class03280> N = class02362.N((class02362)class06510.field_52595, class032802 -> class032802.N, (class02362)class06510.field_48355, class032802 -> class032802.y, (class02362)class06510.field_52595, class032802 -> class032802.L, (class02362)class08604.y, class032802 -> class032802.u, class03280::new);

    private static /* synthetic */ class06510 L(class03280 class032802) {
        return class032802.y;
    }

    public class02362<class04247, class03280> y() {
        return N;
    }

    private static /* synthetic */ class08604 N(class03280 class032802) {
        return class032802.u;
    }

    public MapCodec<class03280> N() {
        return l;
    }
}

