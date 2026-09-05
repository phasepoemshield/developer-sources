/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03448
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class06069
 *  minecraft.class07126
 *  minecraft.class08388
 */
package Nursultan;

import Nursultan.class10173;
import minecraft.class03448;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class06069;
import minecraft.class07126;
import minecraft.class08388;

class class10184
extends class10173 {
    @Override
    protected void L() {
        if (this.field_3845) {
            this.method_3085();
            this.field_3851.method_8406(this.y, this.field_3874, this.field_3854, this.field_3871, 0.0, 0.0, 0.0);
            class04891 class048912 = this.N() == class04684.i ? class04909.zR : class04909.zM;
            float f = class04995.y((class06069)this.field_3840, (float)0.3f, (float)1.0f);
            this.field_3851.method_8486(this.field_3874, this.field_3854, this.field_3871, class048912, class04911.field_15245, f, 1.0f, false);
        }
    }

    class10184(class03448 class034482, double d, double d2, double d3, class04651 class046512, class07126 class071262, class08388 class083882) {
        super(class034482, d, d2, d3, class046512, class071262, class083882);
    }
}

