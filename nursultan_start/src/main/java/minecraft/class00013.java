/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00155
 *  minecraft.class04891
 *  minecraft.class04911
 *  minecraft.class06069
 *  minecraft.class07049
 */
package minecraft;

import minecraft.class00155;
import minecraft.class04891;
import minecraft.class04911;
import minecraft.class06069;
import minecraft.class07049;

public class class00013
extends class00155 {
    private final class07049 m;

    public void P() {
        if (this.m.method_31481()) {
            this.y();
            return;
        }
        this.R = (float)this.m.method_23317();
        this.M = (float)this.m.method_23318();
        this.B = (float)this.m.method_23321();
    }

    public class00013(class04891 class048912, class04911 class049112, float f, float f2, class07049 class070492, long l) {
        super(class048912, class049112, class06069.y((long)l));
        this.u = f;
        this.i = f2;
        this.m = class070492;
        this.R = (float)this.m.method_23317();
        this.M = (float)this.m.method_23318();
        this.B = (float)this.m.method_23321();
    }

    public boolean s() {
        return !this.m.method_5701();
    }
}

