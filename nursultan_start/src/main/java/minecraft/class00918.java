/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00018
 *  minecraft.class00155
 *  minecraft.class04891
 *  minecraft.class04911
 *  minecraft.class05363
 *  minecraft.class06069
 *  minecraft.class06889
 */
package minecraft;

import minecraft.class00018;
import minecraft.class00155;
import minecraft.class04891;
import minecraft.class04911;
import minecraft.class05363;
import minecraft.class06069;
import minecraft.class06889;

public class class00918
extends class00155 {
    private final class05363 m;
    private final float P;
    private final float s;

    public void P() {
        this.b();
    }

    public class00918(class04891 class048912, class04911 class049112, class06069 class060692, class05363 class053632, float f, float f2) {
        super(class048912, class049112, class060692);
        this.m = class053632;
        this.P = f;
        this.s = f2;
        this.b();
    }

    private void b() {
        class06889 class068892 = class06889.N((float)this.P, (float)this.s).L(10.0);
        this.R = this.m.y().M + class068892.M;
        this.M = this.m.y().B + class068892.B;
        this.B = this.m.y().Z + class068892.Z;
        this.U = class00018.field_5478;
    }
}

