/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00500
 *  minecraft.class06386
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00500;
import minecraft.class06386;

public class class03967
implements class06386 {
    public static final Codec<class03967> N = class00500.N.fieldOf("state").xmap(class03967::new, class039672 -> class039672.y).codec();
    public final class00500 y;

    public class03967(class00500 class005002) {
        this.y = class005002;
    }
}

