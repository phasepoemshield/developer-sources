/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03448
 *  minecraft.class05848
 *  minecraft.class08388
 */
package minecraft;

import minecraft.class03448;
import minecraft.class05848;
import minecraft.class08388;

public abstract class class01342
extends class05848 {
    protected class01342(class03448 class034482, double d, double d2, double d3, double d4, double d5, double d6, class08388 class083882) {
        super(class034482, d, d2, d3, d4, d5, d6, class083882);
        this.field_28786 = 0.96f;
        this.field_3852 = this.field_3852 * (double)0.01f + d4;
        this.field_3869 = this.field_3869 * (double)0.01f + d5;
        this.field_3850 = this.field_3850 * (double)0.01f + d6;
        this.field_3874 += (double)((this.field_3840.z() - this.field_3840.z()) * 0.05f);
        this.field_3854 += (double)((this.field_3840.z() - this.field_3840.z()) * 0.05f);
        this.field_3871 += (double)((this.field_3840.z() - this.field_3840.z()) * 0.05f);
        this.field_3847 = (int)(8.0 / ((double)this.field_3840.z() * 0.8 + 0.2)) + 4;
    }
}

