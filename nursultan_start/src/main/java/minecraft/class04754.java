/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00500
 *  minecraft.class01470
 *  minecraft.class05974
 *  minecraft.class06058
 *  minecraft.class06391
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00500;
import minecraft.class01470;
import minecraft.class05974;
import minecraft.class06058;
import minecraft.class06391;
import minecraft.class07209;

public class class04754
extends class06391<class01470> {
    public class04754(Codec<class01470> codec) {
        super(codec);
    }

    public boolean N(class06058<class01470> class060582) {
        class07209 class072092;
        class01470 class014702 = (class01470)class060582.R();
        class05974 class059742 = class060582.y();
        if (!class059742.method_8320((class072092 = class060582.i()).method_10084()).N(class014702.M)) {
            return false;
        }
        if (class014702.L && !class059742.method_8320(class072092.method_10074()).N(class014702.M)) {
            return false;
        }
        class00500 class005002 = class059742.method_8320(class072092);
        if (!class005002.P() && !class005002.N(class014702.M)) {
            return false;
        }
        int n = 0;
        int n2 = 0;
        if (class059742.method_8320(class072092.method_10067()).N(class014702.M)) {
            ++n2;
        }
        if (class059742.method_8320(class072092.method_10078()).N(class014702.M)) {
            ++n2;
        }
        if (class059742.method_8320(class072092.method_10095()).N(class014702.M)) {
            ++n2;
        }
        if (class059742.method_8320(class072092.method_10072()).N(class014702.M)) {
            ++n2;
        }
        if (class059742.method_8320(class072092.method_10074()).N(class014702.M)) {
            ++n2;
        }
        int n3 = 0;
        if (class059742.R(class072092.method_10067())) {
            ++n3;
        }
        if (class059742.R(class072092.method_10078())) {
            ++n3;
        }
        if (class059742.R(class072092.method_10095())) {
            ++n3;
        }
        if (class059742.R(class072092.method_10072())) {
            ++n3;
        }
        if (class059742.R(class072092.method_10074())) {
            ++n3;
        }
        if (n2 == class014702.u && n3 == class014702.i) {
            class059742.method_8652(class072092, class014702.y.B(), 2);
            class059742.N(class072092, class014702.y.N(), 0);
            ++n;
        }
        return n > 0;
    }
}

