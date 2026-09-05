/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03448
 *  minecraft.class04406
 *  minecraft.class06166
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class08800
 */
package minecraft;

import minecraft.class03448;
import minecraft.class04406;
import minecraft.class06166;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class08800;

public class class03869
extends class04406 {
    protected static final int N = 3;
    private final class07049 z;
    protected int y;
    protected final class08800 L;
    protected double u;
    protected double i;
    protected double R;
    protected double M;
    protected double B;
    protected double Z;

    public class03869(class03448 class034482, class08800 class088002, class07049 class070492, class06889 class068892) {
        super(class034482, class088002.E, class088002.W, class088002.m, class068892.M, class068892.B, class068892.Z);
        this.z = class070492;
        this.L = class088002;
        this.L.l = 0;
        this.N();
        this.y();
    }

    private void y() {
        this.M = this.u;
        this.B = this.i;
        this.Z = this.R;
    }

    private void N() {
        this.u = this.z.method_23317();
        this.i = (this.z.method_23318() + this.z.method_23320()) / 2.0;
        this.R = this.z.method_23321();
    }

    public void method_3070() {
        ++this.y;
        if (this.y == 3) {
            this.method_3085();
        }
        this.y();
        this.N();
    }

    public class06166 method_74274() {
        return class06166.y;
    }
}

