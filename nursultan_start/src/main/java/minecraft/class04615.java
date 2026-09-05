/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.arguments.LongArgumentType
 *  minecraft.class04348
 *  minecraft.class06763
 *  minecraft.class06799
 */
package minecraft;

import com.mojang.brigadier.arguments.LongArgumentType;
import minecraft.class04348;
import minecraft.class04608;
import minecraft.class06763;
import minecraft.class06799;

public final class class04615
implements class06763<LongArgumentType> {
    final long N;
    final long y;
    final /* synthetic */ class04608 L;

    class04615(class04608 class046082, long l, long l2) {
        this.L = class046082;
        this.N = l;
        this.y = l2;
    }

    public LongArgumentType y(class04348 class043482) {
        return LongArgumentType.longArg((long)this.N, (long)this.y);
    }

    public class06799<LongArgumentType, ?> N() {
        return this.L;
    }
}

