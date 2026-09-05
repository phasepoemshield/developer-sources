/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03448
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class05846
 *  minecraft.class05848
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class08388
 */
package minecraft;

import minecraft.class03448;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class05846;
import minecraft.class05848;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class08388;

public class class03303
extends class05848 {
    private final class04651 y;
    protected boolean N;

    protected void L() {
    }

    public class03303(class03448 class034482, double d, double d2, double d3, class04651 class046512, class08388 class083882) {
        super(class034482, d, d2, d3, class083882);
        this.method_3080(0.01f, 0.01f);
        this.field_3844 = 0.06f;
        this.y = class046512;
    }

    protected void y() {
        if (this.field_3847-- <= 0) {
            this.method_3085();
        }
    }

    protected class04651 N() {
        return this.y;
    }

    public class05846 method_74255() {
        return class05846.L;
    }

    public int method_3068(float f) {
        if (this.N) {
            return 240;
        }
        return super.method_3068(f);
    }

    public void method_3070() {
        this.field_3858 = this.field_3874;
        this.field_3838 = this.field_3854;
        this.field_3856 = this.field_3871;
        this.y();
        if (this.field_3843) {
            return;
        }
        this.field_3869 -= (double)this.field_3844;
        this.method_3069(this.field_3852, this.field_3869, this.field_3850);
        this.L();
        if (this.field_3843) {
            return;
        }
        this.field_3852 *= (double)0.98f;
        this.field_3869 *= (double)0.98f;
        this.field_3850 *= (double)0.98f;
        if (this.y == class04684.N) {
            return;
        }
        class07209 class072092 = class07209.method_49637((double)this.field_3874, (double)this.field_3854, (double)this.field_3871);
        class04688 class046882 = this.field_3851.method_8316(class072092);
        if (class046882.N() == this.y && this.field_3854 < (double)((float)class072092.method_10264() + class046882.N((class07290)this.field_3851, class072092))) {
            this.method_3085();
        }
    }
}

