/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class01034
 *  minecraft.class03556
 *  minecraft.class04050
 *  minecraft.class06069
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class01034;
import minecraft.class03556;
import minecraft.class04050;
import minecraft.class04323;
import minecraft.class04336;
import minecraft.class06069;
import minecraft.class07209;

public class class04294
extends class04050 {
    private static final class04294 L = new class04294();
    public static MapCodec<class04294> N = MapCodec.unit(() -> L);

    private class04294() {
    }

    protected boolean y(class01034 class010342, class06069 class060692, class07209 class072092) {
        class04336 class043362 = (class04336)((Object)class010342.L().orElseThrow(() -> new IllegalStateException("Tried to biome check an unregistered feature, or a feature that should not restrict the biome")));
        class03556 var5 = class010342.y().i(class072092);
        return class010342.u().N(var5).N(class043362);
    }

    public static class04294 y() {
        return L;
    }

    public class04323<?> N() {
        return class04323.i;
    }
}

