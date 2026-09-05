/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03448
 *  minecraft.class06148
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07126
 */
package minecraft;

import minecraft.class03448;
import minecraft.class06148;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07126;

public class class03646
extends class06148 {
    private final class07049 N;
    private int y;
    private final int L;
    private final class07126 u;

    private class03646(class03448 class034482, class07049 class070492, class07126 class071262, int n, class06889 class068892) {
        super(class034482, class070492.method_23317(), class070492.method_23323(0.5), class070492.method_23321(), class068892.M, class068892.B, class068892.Z);
        this.N = class070492;
        this.L = n;
        this.u = class071262;
        this.method_3070();
    }

    public class03646(class03448 class034482, class07049 class070492, class07126 class071262, int n) {
        this(class034482, class070492, class071262, n, class070492.method_18798());
    }

    public class03646(class03448 class034482, class07049 class070492, class07126 class071262) {
        this(class034482, class070492, class071262, 3);
    }

    public void method_3070() {
        for (int i = 0; i < 16; ++i) {
            double d;
            double d2;
            double d3 = this.field_3840.z() * 2.0f - 1.0f;
            if (d3 * d3 + (d2 = (double)(this.field_3840.z() * 2.0f - 1.0f)) * d2 + (d = (double)(this.field_3840.z() * 2.0f - 1.0f)) * d > 1.0) continue;
            double d4 = this.N.method_23316(d3 / 4.0);
            double d5 = this.N.method_23323(0.5 + d2 / 4.0);
            double d6 = this.N.method_23324(d / 4.0);
            this.field_3851.method_8406(this.u, d4, d5, d6, d3, d2 + 0.2, d);
        }
        ++this.y;
        if (this.y >= this.L) {
            this.method_3085();
        }
    }
}

