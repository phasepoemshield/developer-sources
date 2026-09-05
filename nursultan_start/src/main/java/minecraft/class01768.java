/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03448
 *  minecraft.class06148
 *  minecraft.class07107
 *  minecraft.class07126
 */
package minecraft;

import minecraft.class03448;
import minecraft.class06148;
import minecraft.class07107;
import minecraft.class07126;

public class class01768
extends class06148 {
    private final double N;
    private final int y;

    class01768(class03448 class034482, double d, double d2, double d3, double d4, int n, int n2) {
        super(class034482, d, d2, d3, 0.0, 0.0, 0.0);
        this.N = d4;
        this.field_3847 = n;
        this.y = n2;
    }

    public void method_3070() {
        if (this.field_3866 % (this.y + 1) == 0) {
            for (int i = 0; i < 3; ++i) {
                double d = this.field_3874 + (this.field_3840.U() - this.field_3840.U()) * this.N;
                double d2 = this.field_3854 + (this.field_3840.U() - this.field_3840.U()) * this.N;
                double d3 = this.field_3871 + (this.field_3840.U() - this.field_3840.U()) * this.N;
                this.field_3851.method_8406((class07126)class07107.d, d, d2, d3, (double)((float)this.field_3866 / (float)this.field_3847), 0.0, 0.0);
            }
        }
        if (this.field_3866++ == this.field_3847) {
            this.method_3085();
        }
    }
}

