/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class03448
 *  minecraft.class06572
 *  minecraft.class06584
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class03448;
import minecraft.class06572;
import minecraft.class06584;
import minecraft.class08919;
import minecraft.class08934;
import minecraft.class08961;
import org.jspecify.annotations.Nullable;

public class class08916
implements class06572 {
    public static final MapCodec<class08916> N = class08919.N.xmap(class08916::new, class089162 -> class089162.y);
    private final class08919 y;

    public class08916(boolean bl, class08934 class089342) {
        this(new class08919(bl, class089342));
    }

    private class08916(class08919 class089192) {
        this.y = class089192;
    }

    public float N(class06584 class065842, @Nullable class03448 class034482, @Nullable class08961 class089612, int n) {
        return this.y.N(class065842, class034482, class089612, n);
    }

    public MapCodec<class08916> N() {
        return N;
    }
}

