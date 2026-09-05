/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03448
 *  minecraft.class04651
 *  minecraft.class07126
 *  minecraft.class08388
 */
package minecraft;

import minecraft.class03303;
import minecraft.class03448;
import minecraft.class04651;
import minecraft.class07126;
import minecraft.class08388;

public class class03311
extends class03303 {
    private final class07126 y;

    @Override
    protected void L() {
        this.field_3852 *= 0.02;
        this.field_3869 *= 0.02;
        this.field_3850 *= 0.02;
    }

    public class03311(class03448 class034482, double d, double d2, double d3, class04651 class046512, class07126 class071262, class08388 class083882) {
        super(class034482, d, d2, d3, class046512, class083882);
        this.y = class071262;
        this.field_3844 *= 0.02f;
        this.field_3847 = 40;
    }

    @Override
    protected void y() {
        if (this.field_3847-- <= 0) {
            this.method_3085();
            this.field_3851.method_8406(this.y, this.field_3874, this.field_3854, this.field_3871, this.field_3852, this.field_3869, this.field_3850);
        }
    }
}

