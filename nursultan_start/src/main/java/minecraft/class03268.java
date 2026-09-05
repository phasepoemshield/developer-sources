/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class02362
 *  minecraft.class03246
 *  minecraft.class03259
 *  minecraft.class03556
 *  minecraft.class04247
 *  minecraft.class06510
 *  minecraft.class06514
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class02362;
import minecraft.class03246;
import minecraft.class03259;
import minecraft.class03556;
import minecraft.class04247;
import minecraft.class06510;
import minecraft.class06514;

public class class03268
implements class06514<class03259> {
    private static final MapCodec<class03259> l = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06510.field_46095.fieldOf("template").forGetter(class032592 -> class032592.N), (App)class06510.field_46095.fieldOf("base").forGetter(class032592 -> class032592.y), (App)class06510.field_46095.fieldOf("addition").forGetter(class032592 -> class032592.L), (App)class03246.L.fieldOf("pattern").forGetter(class032592 -> class032592.u)).apply(instance, class03259::new));
    public static final class02362<class04247, class03259> N = class02362.N((class02362)class06510.field_48355, class032592 -> class032592.N, (class02362)class06510.field_48355, class032592 -> class032592.y, (class02362)class06510.field_48355, class032592 -> class032592.L, (class02362)class03246.u, class032592 -> class032592.u, class03259::new);

    private static /* synthetic */ class06510 L(class03259 class032592) {
        return class032592.y;
    }

    public class02362<class04247, class03259> y() {
        return N;
    }

    private static /* synthetic */ class03556 N(class03259 class032592) {
        return class032592.u;
    }

    public MapCodec<class03259> N() {
        return l;
    }
}

