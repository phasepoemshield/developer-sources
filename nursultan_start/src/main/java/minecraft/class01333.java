/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03448
 *  minecraft.class05846
 *  minecraft.class06143
 */
package minecraft;

import minecraft.class01342;
import minecraft.class03448;
import minecraft.class05846;
import minecraft.class06143;

public class class01333
extends class01342 {
    private final class06143 y;
    protected boolean N;

    class01333(class03448 class034482, double d, double d2, double d3, double d4, double d5, double d6, class06143 class061432) {
        super(class034482, d, d2, d3, d4, d5, d6, class061432.method_74304());
        this.y = class061432;
        this.method_3087(1.5f);
        this.method_74306(class061432);
    }

    public class05846 method_74255() {
        return class05846.u;
    }

    public int method_3068(float f) {
        if (this.N) {
            return 240;
        }
        return super.method_3068(f);
    }

    public void method_3070() {
        super.method_3070();
        this.method_74306(this.y);
    }
}

