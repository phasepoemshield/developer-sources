/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07206
 *  minecraft.class07210
 */
package minecraft;

import minecraft.class07206;
import minecraft.class07210;

public abstract class class01989
extends class07206 {
    private boolean N = true;

    public boolean y() {
        return this.N;
    }

    protected void N(class07210 class072102) {
        class072102.y().N(this.y() ? 1000 : 1001, class072102.L(), 0);
    }

    public void N(boolean bl) {
        this.N = bl;
    }
}

