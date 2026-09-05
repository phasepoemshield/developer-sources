/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.arguments.DoubleArgumentType
 *  minecraft.class04348
 *  minecraft.class06763
 *  minecraft.class06799
 *  minecraft.class07224
 */
package minecraft;

import com.mojang.brigadier.arguments.DoubleArgumentType;
import minecraft.class04348;
import minecraft.class06763;
import minecraft.class06799;
import minecraft.class07224;

public final class class07213
implements class06763<DoubleArgumentType> {
    final double N;
    final double y;
    final /* synthetic */ class07224 L;

    class07213(class07224 class072242, double d, double d2) {
        this.L = class072242;
        this.N = d;
        this.y = d2;
    }

    public DoubleArgumentType y(class04348 class043482) {
        return DoubleArgumentType.doubleArg((double)this.N, (double)this.y);
    }

    public class06799<DoubleArgumentType, ?> N() {
        return this.L;
    }
}

