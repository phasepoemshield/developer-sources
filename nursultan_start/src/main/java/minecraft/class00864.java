/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class01210
 *  minecraft.class01362
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class08713
 *  minecraft.class08791
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01210;
import minecraft.class01362;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class08713;
import minecraft.class08791;

public abstract class class00864
extends class00891 {
    public class00864(class01362 class013622) {
        super(class013622);
    }

    protected boolean y(class00500 class005002) {
        return class005002.Y().W();
    }

    protected boolean N(class00500 class005002, class08791 class087912) {
        if (class087912 == class08791.field_51 && !this.I) {
            return true;
        }
        return super.N(class005002, class087912);
    }

    public class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (!class005002.N(class054872, class072092)) {
            return class00869.N.W();
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    protected boolean N(class00500 class005002, class07290 class072902, class07209 class072092) {
        return class005002.N(class01210.Ni) || class005002.N(class00869.Lr);
    }

    protected abstract MapCodec<? extends class00864> N();

    public boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        class07209 class072093 = class072092.method_10074();
        return this.N(class054872.method_8320(class072093), (class07290)class054872, class072093);
    }
}

