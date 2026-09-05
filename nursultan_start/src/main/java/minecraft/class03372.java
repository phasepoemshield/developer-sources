/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class06069
 *  minecraft.class07001
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class03336;
import minecraft.class03368;
import minecraft.class06069;
import minecraft.class07001;
import org.jspecify.annotations.Nullable;

public class class03372
implements class03336 {
    public static final class03372 N = new class03372();
    public static final MapCodec<class03372> y = MapCodec.unit((Object)N);

    @Override
    public @Nullable class07001 N(class06069 class060692, @Nullable class07001 class070012) {
        return class070012;
    }

    @Override
    public class03368<?> N() {
        return class03368.y;
    }
}

