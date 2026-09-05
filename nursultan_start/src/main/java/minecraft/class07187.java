/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  minecraft.class04348
 *  minecraft.class06763
 *  minecraft.class06799
 */
package minecraft;

import com.mojang.brigadier.arguments.IntegerArgumentType;
import minecraft.class04348;
import minecraft.class06763;
import minecraft.class06799;
import minecraft.class07201;

public final class class07187
implements class06763<IntegerArgumentType> {
    final int N;
    final int y;
    final /* synthetic */ class07201 L;

    class07187(class07201 class072012, int n, int n2) {
        this.L = class072012;
        this.N = n;
        this.y = n2;
    }

    public IntegerArgumentType y(class04348 class043482) {
        return IntegerArgumentType.integer((int)this.N, (int)this.y);
    }

    public class06799<IntegerArgumentType, ?> N() {
        return this.L;
    }
}

