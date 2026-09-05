/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.arguments.FloatArgumentType
 *  minecraft.class04348
 *  minecraft.class06763
 *  minecraft.class06799
 */
package minecraft;

import com.mojang.brigadier.arguments.FloatArgumentType;
import minecraft.class04348;
import minecraft.class06763;
import minecraft.class06799;
import minecraft.class07198;

public final class class07195
implements class06763<FloatArgumentType> {
    final float N;
    final float y;
    final /* synthetic */ class07198 L;

    class07195(class07198 class071982, float f, float f2) {
        this.L = class071982;
        this.N = f;
        this.y = f2;
    }

    public FloatArgumentType y(class04348 class043482) {
        return FloatArgumentType.floatArg((float)this.N, (float)this.y);
    }

    public class06799<FloatArgumentType, ?> N() {
        return this.L;
    }
}

