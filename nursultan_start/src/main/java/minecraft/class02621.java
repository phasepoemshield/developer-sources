/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03448
 *  minecraft.class05846
 *  minecraft.class05848
 *  minecraft.class08388
 */
package minecraft;

import minecraft.class02566;
import minecraft.class03448;
import minecraft.class05846;
import minecraft.class05848;
import minecraft.class08388;

public class class02621
extends class05848 {
    private final double N;
    private final double y;
    private final double L;
    private final int u;
    private final int i;

    class02621(class03448 class034482, double d, double d2, double d3, double d4, double d5, double d6, int n, int n2, class08388 class083882) {
        super(class034482, d, d2, d3, class083882);
        this.field_3852 = d4;
        this.field_3869 = d5;
        this.field_3850 = d6;
        this.N = d;
        this.y = d2;
        this.L = d3;
        this.field_3858 = d + d4;
        this.field_3838 = d2 + d5;
        this.field_3856 = d3 + d6;
        this.field_3874 = this.field_3858;
        this.field_3854 = this.field_3838;
        this.field_3871 = this.field_3856;
        this.field_17867 = 0.1f * (this.field_3840.z() * 0.5f + 0.2f);
        this.field_3862 = false;
        this.field_3847 = (int)(this.field_3840.z() * 5.0f) + 25;
        this.u = n;
        this.i = n2;
    }

    public class05846 method_74255() {
        return class05846.L;
    }

    public void method_3069(double d, double d2, double d3) {
    }

    public int method_3068(float f) {
        return 240;
    }

    public void method_3070() {
        this.field_3858 = this.field_3874;
        this.field_3838 = this.field_3854;
        this.field_3856 = this.field_3871;
        if (this.field_3866++ >= this.field_3847) {
            this.method_3085();
            return;
        }
        float f = (float)this.field_3866 / (float)this.field_3847;
        float f2 = 1.0f - f;
        this.field_3874 = this.N + this.field_3852 * (double)f2;
        this.field_3854 = this.y + this.field_3869 * (double)f2;
        this.field_3871 = this.L + this.field_3850 * (double)f2;
        int n = class02566.N(f, this.u, this.i);
        this.method_74305((float)class02566.L(n) / 255.0f, (float)class02566.u(n) / 255.0f, (float)class02566.i(n) / 255.0f);
        this.method_74308((float)class02566.y(n) / 255.0f);
    }
}

