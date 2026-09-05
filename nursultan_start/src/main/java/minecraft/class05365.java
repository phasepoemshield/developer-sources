/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04387
 */
package minecraft;

import minecraft.class04387;
import minecraft.class05349;

public class class05365 {
    private int N;
    private float y;
    private boolean L;

    public class05349 y() {
        float f = class04387.N((int)this.N, (float)this.y);
        return new class05349(this.N, f, this.L);
    }

    public class05365 N(int n) {
        this.N = n;
        return this;
    }

    public class05365 N() {
        this.L = true;
        return this;
    }

    public class05365 N(float f) {
        this.y = f;
        return this;
    }
}

