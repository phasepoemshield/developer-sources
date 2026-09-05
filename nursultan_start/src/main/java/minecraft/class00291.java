/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02566
 *  minecraft.class03448
 *  minecraft.class04995
 *  minecraft.class05846
 *  minecraft.class05848
 *  minecraft.class06889
 *  minecraft.class08388
 */
package minecraft;

import minecraft.class02566;
import minecraft.class03448;
import minecraft.class04995;
import minecraft.class05846;
import minecraft.class05848;
import minecraft.class06889;
import minecraft.class08388;

public class class00291
extends class05848 {
    private final class06889 N;

    class00291(class03448 class034482, double d, double d2, double d3, double d4, double d5, double d6, class06889 class068892, int n, class08388 class083882) {
        super(class034482, d, d2, d3, d4, d5, d6, class083882);
        n = class02566.N((int)n, (float)(0.875f + this.field_3840.z() * 0.25f), (float)(0.875f + this.field_3840.z() * 0.25f), (float)(0.875f + this.field_3840.z() * 0.25f));
        this.field_62633 = (float)class02566.L((int)n) / 255.0f;
        this.field_62634 = (float)class02566.u((int)n) / 255.0f;
        this.field_62635 = (float)class02566.i((int)n) / 255.0f;
        this.field_17867 = 0.26f;
        this.N = class068892;
    }

    public class05846 method_74255() {
        return class05846.L;
    }

    public int method_3068(float f) {
        return 0xF000F0;
    }

    public void method_3070() {
        this.field_3858 = this.field_3874;
        this.field_3838 = this.field_3854;
        this.field_3856 = this.field_3871;
        if (this.field_3866++ >= this.field_3847) {
            this.method_3085();
            return;
        }
        int n = this.field_3847 - this.field_3866;
        double d = 1.0 / (double)n;
        this.field_3874 = class04995.u((double)d, (double)this.field_3874, (double)this.N.N());
        this.field_3854 = class04995.u((double)d, (double)this.field_3854, (double)this.N.y());
        this.field_3871 = class04995.u((double)d, (double)this.field_3871, (double)this.N.L());
    }
}

