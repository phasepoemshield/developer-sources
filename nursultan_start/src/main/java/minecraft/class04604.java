/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00667
 *  minecraft.class01763
 */
package minecraft;

import minecraft.class00667;
import minecraft.class01763;

public class class04604
extends class01763 {
    private float W = Float.MAX_VALUE;
    private class01763 m;
    private boolean P;

    public boolean L() {
        return this.P;
    }

    public class04604(int n, int n2, int n3) {
        super(n, n2, n3);
    }

    public class04604(class01763 class017632) {
        super(class017632.N, class017632.y, class017632.L);
    }

    public void y() {
        this.P = true;
    }

    public static class04604 N(class00667 class006672) {
        class04604 class046042 = new class04604(class006672.readInt(), class006672.readInt(), class006672.readInt());
        class04604.N((class00667)class006672, (class01763)class046042);
        return class046042;
    }

    public class01763 N() {
        return this.m;
    }

    public void N(float f, class01763 class017632) {
        if (f < this.W) {
            this.W = f;
            this.m = class017632;
        }
    }
}

