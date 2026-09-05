/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02060
 *  minecraft.class04995
 */
package minecraft;

import minecraft.class02060;
import minecraft.class02072;
import minecraft.class02102;
import minecraft.class04995;

public final class class02080 {
    private final int y;
    private int L;
    final /* synthetic */ class02060 N;

    public class02072 L() {
        return this.N.L();
    }

    class02080(class02060 class020602, int n) {
        this.N = class020602;
        this.y = n;
    }

    public class02072 y() {
        return this.N.y();
    }

    public <T extends class02102> T N(T t, int n, class02072 class020722) {
        int n2 = this.L / this.y;
        int n3 = this.L % this.y;
        if (n3 + n > this.y) {
            ++n2;
            n3 = 0;
            this.L = class04995.i((int)this.L, (int)this.y);
        }
        this.L += n;
        return (T)this.N.N(t, n2, n3, 1, n, class020722);
    }

    public class02060 N() {
        return this.N;
    }

    public <T extends class02102> T N(T t) {
        return this.N(t, 1);
    }

    public <T extends class02102> T N(T t, class02072 class020722) {
        return this.N(t, 1, class020722);
    }

    public <T extends class02102> T N(T t, int n) {
        return this.N(t, n, this.L());
    }
}

