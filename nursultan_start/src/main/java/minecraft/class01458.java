/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class01471
 *  minecraft.class06386
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class01471;
import minecraft.class06386;

public class class01458
implements class06386 {
    public static final Codec<class01458> N = class01471.N.fieldOf("state_provider").xmap(class01458::new, class014582 -> class014582.y).codec();
    public final class01471 y;

    public class01458(class01471 class014712) {
        this.y = class014712;
    }
}

