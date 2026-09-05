/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03448
 *  minecraft.class04651
 *  minecraft.class07126
 *  minecraft.class08388
 */
package Nursultan;

import Nursultan.class10172;
import minecraft.class03448;
import minecraft.class04651;
import minecraft.class07126;
import minecraft.class08388;

public class class10173
extends class10172 {
    protected final class07126 y;

    @Override
    protected void L() {
        if (this.field_3845) {
            this.method_3085();
            this.field_3851.method_8406(this.y, this.field_3874, this.field_3854, this.field_3871, 0.0, 0.0, 0.0);
        }
    }

    public class10173(class03448 class034482, double d, double d2, double d3, class04651 class046512, class07126 class071262, class08388 class083882) {
        super(class034482, d, d2, d3, class046512, class083882);
        this.field_3847 = (int)(64.0 / ((double)this.field_3840.z() * 0.8 + 0.2));
        this.y = class071262;
    }
}

