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

public class class03523
extends class06148 {
    public class03523(class03448 class034482, double d, double d2, double d3) {
        super(class034482, d, d2, d3, 0.0, 0.0, 0.0);
        this.field_3847 = 8;
    }

    public void method_3070() {
        for (int i = 0; i < 6; ++i) {
            double d = this.field_3874 + (this.field_3840.U() - this.field_3840.U()) * 4.0;
            double d2 = this.field_3854 + (this.field_3840.U() - this.field_3840.U()) * 4.0;
            double d3 = this.field_3871 + (this.field_3840.U() - this.field_3840.U()) * 4.0;
            this.field_3851.method_8406((class07126)class07107.l, d, d2, d3, (double)((float)this.field_3866 / (float)this.field_3847), 0.0, 0.0);
        }
        ++this.field_3866;
        if (this.field_3866 == this.field_3847) {
            this.method_3085();
        }
    }
}

