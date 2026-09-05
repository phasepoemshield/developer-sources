/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class01630
 *  minecraft.class05487
 *  minecraft.class05974
 *  minecraft.class06058
 *  minecraft.class06069
 *  minecraft.class06391
 *  minecraft.class06996
 *  minecraft.class07209
 *  minecraft.class07830
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class01630;
import minecraft.class05487;
import minecraft.class05974;
import minecraft.class06058;
import minecraft.class06069;
import minecraft.class06391;
import minecraft.class06996;
import minecraft.class07209;
import minecraft.class07830;
import minecraft.class08092;

public class class05619
extends class06391<class01630> {
    public class05619(Codec<class01630> codec) {
        super(codec);
    }

    public boolean N(class06058<class01630> class060582) {
        int n = 0;
        class06069 class060692 = class060582.u();
        class05974 class059742 = class060582.y();
        class07209 class072092 = class060582.i();
        int n2 = ((class01630)class060582.R()).N().N(class060692);
        for (int i = 0; i < n2; ++i) {
            int n3 = class060692.y(8) - class060692.y(8);
            int n4 = class060692.y(8) - class060692.y(8);
            int n5 = class059742.method_8624(class07830.field_13200, class072092.method_10263() + n3, class072092.method_10260() + n4);
            class07209 class072093 = new class07209(class072092.method_10263() + n3, n5, class072092.method_10260() + n4);
            class00500 class005002 = (class00500)class00869.mA.W().y((class08092)class06996.L, (Comparable)Integer.valueOf(class060692.y(4) + 1));
            if (!class059742.method_8320(class072093).N(class00869.K) || !class005002.N((class05487)class059742, class072093)) continue;
            class059742.method_8652(class072093, class005002, 2);
            ++n;
        }
        return n > 0;
    }
}

