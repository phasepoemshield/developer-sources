/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class01210
 *  minecraft.class04995
 *  minecraft.class05456
 *  minecraft.class06889
 *  minecraft.class07131
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07475
 *  minecraft.class07977
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00753;
import minecraft.class01210;
import minecraft.class04995;
import minecraft.class05456;
import minecraft.class06889;
import minecraft.class07131;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07475;
import minecraft.class07977;
import org.jspecify.annotations.Nullable;

class class07638
extends class07977 {
    protected @Nullable class06889 M() {
        class06889 class068892 = null;
        if (this.y.method_5799()) {
            class068892 = class05456.N((class07475)this.y, (int)15, (int)15);
        }
        if (this.y.method_59922().z() >= this.z) {
            class068892 = this.U();
        }
        return class068892 == null ? super.M() : class068892;
    }

    public class07638(class07475 class074752, double d) {
        super(class074752, d);
    }

    private @Nullable class06889 U() {
        class07209 class072092 = this.y.method_24515();
        class07218 class072182 = new class07218();
        class07218 class072183 = new class07218();
        for (class07209 class072093 : class07209.method_10094((int)class04995.N((double)(this.y.method_23317() - 3.0)), (int)class04995.N((double)(this.y.method_23318() - 6.0)), (int)class04995.N((double)(this.y.method_23321() - 3.0)), (int)class04995.N((double)(this.y.method_23317() + 3.0)), (int)class04995.N((double)(this.y.method_23318() + 6.0)), (int)class04995.N((double)(this.y.method_23321() + 3.0)))) {
            class00500 class005002;
            if (class072092.equals((Object)class072093) || !((class005002 = this.y.method_73183().method_8320((class07209)class072183.N((class00753)class072093, class07211.field_11033))).i() instanceof class07131 || class005002.N(class01210.g)) || !this.y.method_73183().R(class072093) || !this.y.method_73183().R((class07209)class072182.N((class00753)class072093, class07211.field_11036))) continue;
            return class06889.L((class00753)class072093);
        }
        return null;
    }
}

