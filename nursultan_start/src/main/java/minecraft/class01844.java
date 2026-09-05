/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03448
 *  minecraft.class05846
 *  minecraft.class05848
 *  minecraft.class06143
 */
package minecraft;

import minecraft.class03448;
import minecraft.class05846;
import minecraft.class05848;
import minecraft.class06143;

public class class01844
extends class05848 {
    private final class06143 N;

    public class01844(class03448 class034482, double d, double d2, double d3, double d4, double d5, double d6, class06143 class061432) {
        super(class034482, d, d2, d3, class061432.method_74304());
        this.N = class061432;
        this.field_3847 = 4;
        this.field_3844 = 0.008f;
        this.field_3852 = d4;
        this.field_3869 = d5;
        this.field_3850 = d6;
        this.method_74306(class061432);
    }

    public class05846 method_74255() {
        return class05846.L;
    }

    public void method_3070() {
        this.field_3858 = this.field_3874;
        this.field_3838 = this.field_3854;
        this.field_3856 = this.field_3871;
        if (this.field_3866++ >= this.field_3847) {
            this.method_3085();
            return;
        }
        this.field_3869 -= (double)this.field_3844;
        this.method_3069(this.field_3852, this.field_3869, this.field_3850);
        this.method_74306(this.N);
    }
}

