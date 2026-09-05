/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 */
package minecraft;

import java.util.Arrays;
import minecraft.class02753;
import minecraft.class04995;

public class class02765 {
    public static final int N = 64;
    private static final int y = 63;
    private final class02753[] L = new class02753[64];
    private int u = -1;

    public class02765() {
        Arrays.fill((Object[])this.L, (Object)new class02753(0.0, 0.0f));
    }

    public class02753 N(int n, float f) {
        class02753 class027532 = this.N(n);
        class02753 class027533 = this.N(n + 1);
        return new class02753(class04995.u((double)f, (double)class027533.N(), (double)class027532.N()), class04995.Z((float)f, (float)class027533.y(), (float)class027532.y()));
    }

    public class02753 N(int n) {
        return this.L[this.u - n & 0x3F];
    }

    public void N(double d, float f) {
        class02753 class027532 = new class02753(d, f);
        if (this.u < 0) {
            Arrays.fill((Object[])this.L, (Object)class027532);
        }
        if (++this.u == 64) {
            this.u = 0;
        }
        this.L[this.u] = class027532;
    }

    public void N(class02765 class027652) {
        System.arraycopy(class027652.L, 0, this.L, 0, 64);
        this.u = class027652.u;
    }
}

