/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05474
 *  minecraft.class08088
 */
package minecraft;

import minecraft.class05474;
import minecraft.class08088;

public class class06057 {
    private final int N;
    private final int y;

    public class06057(class08088 class080882, class05474 class054742) {
        this.N = Math.max(class054742.method_31607(), class080882.M());
        this.y = Math.min(class054742.method_31605(), class080882.i());
    }

    public int i() {
        return this.N;
    }

    public int R() {
        return this.y;
    }
}

