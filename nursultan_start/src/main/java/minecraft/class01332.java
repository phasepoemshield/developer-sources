/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02131
 *  minecraft.class03289
 *  minecraft.class04995
 *  minecraft.class06069
 */
package minecraft;

import minecraft.class02131;
import minecraft.class03289;
import minecraft.class04995;
import minecraft.class06069;

public class class01332 {
    private static final int N = 140;
    private static final int y = 700;
    private final class03289 L;
    private final class02131<Integer> u;
    private boolean i;
    private int R;

    public float L() {
        if (this.i) {
            return 1.0f + 1.15f * class04995.m((double)((float)this.R / (float)this.u() * (float)Math.PI));
        }
        return 1.0f;
    }

    public class01332(class03289 class032892, class02131<Integer> class021312) {
        this.L = class032892;
        this.u = class021312;
    }

    private int u() {
        return (Integer)this.L.N(this.u);
    }

    public void y() {
        if (this.i && this.R++ > this.u()) {
            this.i = false;
        }
    }

    public void N() {
        this.i = true;
        this.R = 0;
    }

    public boolean N(class06069 class060692) {
        if (this.i) {
            return false;
        }
        this.i = true;
        this.R = 0;
        this.L.N(this.u, (Object)(class060692.y(841) + 140));
        return true;
    }
}

