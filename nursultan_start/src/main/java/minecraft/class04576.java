/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03448
 *  minecraft.class05846
 *  minecraft.class05848
 *  minecraft.class08388
 *  minecraft.class08626
 */
package minecraft;

import minecraft.class03448;
import minecraft.class05846;
import minecraft.class05848;
import minecraft.class08388;
import minecraft.class08626;

public class class04576
extends class05848 {
    private final float N;
    private final float y;
    private final class05846 L;

    class04576(class03448 class034482, double d, double d2, double d3, double d4, double d5, double d6, class08388 class083882) {
        this(class034482, d, d2, d3, class083882);
        this.field_3852 *= (double)0.1f;
        this.field_3869 *= (double)0.1f;
        this.field_3850 *= (double)0.1f;
        this.field_3852 += d4;
        this.field_3869 += d5;
        this.field_3850 += d6;
    }

    public class04576(class03448 class034482, double d, double d2, double d3, class08388 class083882) {
        super(class034482, d, d2, d3, 0.0, 0.0, 0.0, class083882);
        this.field_3844 = 1.0f;
        this.field_17867 /= 2.0f;
        this.N = this.field_3840.z() * 3.0f;
        this.y = this.field_3840.z() * 3.0f;
        this.L = class083882.method_45852().equals((Object)class08626.N) ? class05846.N : class05846.y;
    }

    public class05846 method_74255() {
        return this.L;
    }

    protected float method_18133() {
        return this.field_62632.method_4580((this.N + 1.0f) / 4.0f);
    }

    protected float method_18134() {
        return this.field_62632.method_4580(this.N / 4.0f);
    }

    protected float method_18136() {
        return this.field_62632.method_4570((this.y + 1.0f) / 4.0f);
    }

    protected float method_18135() {
        return this.field_62632.method_4570(this.y / 4.0f);
    }
}

