/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03448
 *  minecraft.class05846
 *  minecraft.class05848
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class08388
 */
package minecraft;

import minecraft.class03448;
import minecraft.class05846;
import minecraft.class05848;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class08388;

public class class03617
extends class05848 {
    public class03617(class03448 class034482, double d, double d2, double d3, class08388 class083882) {
        super(class034482, d, d2, d3, 0.0, 0.0, 0.0, class083882);
        this.field_3852 *= (double)0.3f;
        this.field_3869 = this.field_3840.z() * 0.2f + 0.1f;
        this.field_3850 *= (double)0.3f;
        this.method_3080(0.01f, 0.01f);
        this.field_3844 = 0.06f;
        this.field_3847 = (int)(8.0 / ((double)this.field_3840.z() * 0.8 + 0.2));
    }

    public class05846 method_74255() {
        return class05846.L;
    }

    public void method_3070() {
        class07209 class072092;
        double d;
        this.field_3858 = this.field_3874;
        this.field_3838 = this.field_3854;
        this.field_3856 = this.field_3871;
        if (this.field_3847-- <= 0) {
            this.method_3085();
            return;
        }
        this.field_3869 -= (double)this.field_3844;
        this.method_3069(this.field_3852, this.field_3869, this.field_3850);
        this.field_3852 *= (double)0.98f;
        this.field_3869 *= (double)0.98f;
        this.field_3850 *= (double)0.98f;
        if (this.field_3845) {
            if (this.field_3840.z() < 0.5f) {
                this.method_3085();
            }
            this.field_3852 *= (double)0.7f;
            this.field_3850 *= (double)0.7f;
        }
        if ((d = Math.max(this.field_3851.method_8320(class072092 = class07209.method_49637((double)this.field_3874, (double)this.field_3854, (double)this.field_3871)).M((class07290)this.field_3851, class072092).method_1102(class07185.field_11052, this.field_3874 - (double)class072092.method_10263(), this.field_3871 - (double)class072092.method_10260()), (double)this.field_3851.method_8316(class072092).N((class07290)this.field_3851, class072092))) > 0.0 && this.field_3854 < (double)class072092.method_10264() + d) {
            this.method_3085();
        }
    }
}

