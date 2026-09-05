/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07079
 *  minecraft.class07440
 */
package minecraft;

import minecraft.class07079;
import minecraft.class07440;
import minecraft.class07879;

public class class07873
extends class07440 {
    private final class07879 N;
    private boolean L;

    public boolean L() {
        return this.y;
    }

    public class07873(class07879 class078792) {
        super((class07079)class078792);
        this.N = class078792;
    }

    public boolean u() {
        return this.L;
    }

    public void N(boolean bl) {
        this.L = bl;
    }

    public void N() {
        if (this.y) {
            this.N.B();
            this.y = false;
        }
    }
}

