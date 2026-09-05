/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class02265
 *  minecraft.class05715
 *  minecraft.class06555
 *  minecraft.class08413
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class02265;
import minecraft.class05715;
import minecraft.class06555;
import minecraft.class08413;

public class class06149
extends class06555 {
    private static final int L = -1;
    public static final Codec<class06149> N = RecordCodecBuilder.create(instance -> instance.group((App)Codec.INT.optionalFieldOf("map", (Object)-1).forGetter(class061492 -> class061492.u)).apply(instance, class06149::new));
    public static final class08413<class06149> y = new class08413("idcounts", class06149::new, N, class05715.field_45080);
    private int u;

    public class06149() {
        this(-1);
    }

    public class06149(int n) {
        this.u = n;
    }

    public class02265 N() {
        class02265 class022652 = new class02265(++this.u);
        this.method_80();
        return class022652;
    }
}

