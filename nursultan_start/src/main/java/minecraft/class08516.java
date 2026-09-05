/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02353
 *  minecraft.class07536
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class02353;
import minecraft.class07536;
import minecraft.class08527;
import org.jspecify.annotations.Nullable;

class class08516 {
    public static final int N = 2;
    private static final int y = -1;
    private Object[] L = new Object[16];
    private int u;

    class08516() {
    }

    public int y(class02353<?> class023532) {
        int n = this.u;
        this.u += 2;
        int n2 = n + 1;
        int n3 = this.L.length;
        if (n2 >= n3) {
            Object[] objectArray = new Object[class07536.N((int)n3, (int)(n2 + 1))];
            System.arraycopy(this.L, 0, objectArray, 0, n3);
            this.L = objectArray;
        }
        this.L[n] = class023532;
        return n;
    }

    public int N(class02353<?> class023532) {
        for (int i = 0; i < this.u; i += 2) {
            if (this.L[i] != class023532) continue;
            return i;
        }
        return -1;
    }

    public <T> @Nullable class08527<T> N(int n) {
        return (class08527)((Object)this.L[n + 1]);
    }

    public void N(int n, class08527<?> class085272) {
        this.L[n + 1] = class085272;
    }
}

