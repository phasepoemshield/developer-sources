/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01818
 *  minecraft.class04995
 *  minecraft.class06069
 *  minecraft.class06075
 */
package Nursultan;

import minecraft.class01818;
import minecraft.class04995;
import minecraft.class06069;
import minecraft.class06075;

public class class10554
implements class01818 {
    private final long N;

    public class10554(long l) {
        this.N = l;
    }

    public void N(StringBuilder stringBuilder) {
        stringBuilder.append("LegacyPositionalRandomFactory{").append(this.N).append("}");
    }

    public class06069 N(long l) {
        return new class06075(l);
    }

    public class06069 N(String string) {
        int n = string.hashCode();
        return new class06075((long)n ^ this.N);
    }

    public class06069 N(int n, int n2, int n3) {
        long l = class04995.y((int)n, (int)n2, (int)n3) ^ this.N;
        return new class06075(l);
    }
}

