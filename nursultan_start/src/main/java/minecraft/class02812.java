/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06584
 */
package minecraft;

import minecraft.class02842;
import minecraft.class06584;

public class class02812 {
    public static final class02812 N = new class02812(0.75f, 0.5f, 0.25f);
    public static final class02812 y = new class02812(0.95f, 0.69f, 0.32f);
    private final float L;
    private final float u;
    private final float i;

    private class02812(float f, float f2, float f3) {
        this.L = f;
        this.u = f2;
        this.i = f3;
    }

    public class02842 N(float f) {
        if (f < this.i) {
            return class02842.field_21084;
        }
        if (f < this.u) {
            return class02842.field_21083;
        }
        if (f < this.L) {
            return class02842.field_21082;
        }
        return class02842.field_21081;
    }

    public class02842 N(int n, int n2) {
        return this.N((float)(n2 - n) / (float)n2);
    }

    public class02842 N(class06584 class065842) {
        if (!class065842.W()) {
            return class02842.field_21081;
        }
        return this.N(class065842.P(), class065842.s());
    }
}

