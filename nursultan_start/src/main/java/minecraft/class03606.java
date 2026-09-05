/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class08394
 */
package minecraft;

import minecraft.class01054;
import minecraft.class01894;
import minecraft.class03608;
import minecraft.class08394;

class class03606
extends class03608 {
    private class01894 N;
    private final int y;
    private final int L;

    public class03606(int n, int n2, int n3, int n4, class01894 class018942, int n5, int n6) {
        super(n, n2, n3, n4);
        this.N = class018942;
        this.y = n5;
        this.L = n6;
    }

    @Override
    public void N(class01894 class018942) {
        this.N = class018942;
    }

    protected void method_48579(class01054 class010542, int n, int n2, float f) {
        class010542.N(class08394.Na, this.N, this.method_46426(), this.method_46427(), 0.0f, 0.0f, this.method_25368(), this.method_25364(), this.y, this.L);
    }
}

