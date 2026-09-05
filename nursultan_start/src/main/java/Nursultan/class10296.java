/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01818
 *  minecraft.class04037
 *  minecraft.class04042
 *  minecraft.class04043
 *  minecraft.class04995
 *  minecraft.class06069
 */
package Nursultan;

import minecraft.class01818;
import minecraft.class04037;
import minecraft.class04042;
import minecraft.class04043;
import minecraft.class04995;
import minecraft.class06069;

public class class10296
implements class01818 {
    private final long N;
    private final long y;

    public class10296(long l, long l2) {
        this.N = l;
        this.y = l2;
    }

    public void N(StringBuilder stringBuilder) {
        stringBuilder.append("seedLo: ").append(this.N).append(", seedHi: ").append(this.y);
    }

    public class06069 N(long l) {
        return new class04042(l ^ this.N, l ^ this.y);
    }

    public class06069 N(String string) {
        class04037 class040372 = class04043.N((String)string);
        return new class04042(class040372.N(this.N, this.y));
    }

    public class06069 N(int n, int n2, int n3) {
        long l = class04995.y((int)n, (int)n2, (int)n3) ^ this.N;
        return new class04042(l, this.y);
    }
}

