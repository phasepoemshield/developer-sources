/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06889
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class06889;
import minecraft.class08161;
import org.jspecify.annotations.Nullable;

public class class08177 {
    private int u = -1;
    int N = -1;
    @Nullable class06889 y;
    boolean L = false;

    public boolean L() {
        if (this.N > 0) {
            ++this.N;
            if ((double)this.N > class08161.i) {
                this.L = true;
                return true;
            }
        }
        return false;
    }

    public boolean y() {
        if (this.u > 0) {
            --this.u;
            if (this.u == 0) {
                return true;
            }
        }
        return false;
    }

    public boolean N() {
        return this.u < 0;
    }

    public void N(int n) {
        this.u = n;
    }
}

