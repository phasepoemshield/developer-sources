/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class01860
 *  minecraft.class05936
 *  minecraft.class06202
 */
package minecraft;

import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class01860;
import minecraft.class05681;
import minecraft.class05691;
import minecraft.class05936;
import minecraft.class06202;

public class class05714
extends class05681 {
    private final class06202 N = class06202.Nq();
    private final class01860 y;

    public class05714() {
        this.y = new class01860((class01590)this.N.i_3, class05691.n);
    }

    @Override
    boolean N(class05681 class056812) {
        return class056812 instanceof class05714;
    }

    @Override
    public void N() {
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        this.y.y(this.method_73388() - ((class01590)this.N.i_3).N((class05936)class05691.n) / 2, this.method_73382());
        this.y.method_25394(class010542, n, n2, f);
    }

    @Override
    public class00392 method_37006() {
        return class05691.n;
    }
}

