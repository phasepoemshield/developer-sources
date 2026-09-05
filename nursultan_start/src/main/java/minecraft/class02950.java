/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06584
 */
package minecraft;

import minecraft.class06584;

public interface class02950 {
    default public boolean y() {
        for (int i = 0; i < this.N(); ++i) {
            if (this.N(i).R()) continue;
            return false;
        }
        return true;
    }

    public int N();

    public class06584 N(int var1);
}

