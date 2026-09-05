/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class03560
 *  minecraft.class06069
 *  minecraft.class06225
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07221
 *  minecraft.class07284
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class03560;
import minecraft.class06069;
import minecraft.class06225;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07221;
import minecraft.class07284;

public class class03324
extends class03560 {
    public class03324(Codec<class06225> codec) {
        super(codec);
    }

    protected boolean N(class07284 class072842, class06069 class060692, class07209 class072092, class00500 class005002) {
        class07218 class072182 = class072092.method_25503();
        int n = class060692.y(3) + 1;
        for (int i = 0; i < n; ++i) {
            if (!this.y(class072842, class060692, (class07209)class072182, class005002)) {
                return true;
            }
            class072182.N(class07211.field_11036);
        }
        class07209 class072093 = class072182.method_10062();
        int n2 = class060692.y(3) + 2;
        for (class07211 class072112 : class07221.field_11062.L(class060692).subList(0, n2)) {
            class072182.N((class00753)class072093);
            class072182.N(class072112);
            int n3 = class060692.y(5) + 2;
            int n4 = 0;
            for (int i = 0; i < n3 && this.y(class072842, class060692, (class07209)class072182, class005002); ++i) {
                class072182.N(class07211.field_11036);
                if (i != 0 && (++n4 < 2 || !(class060692.z() < 0.25f))) continue;
                class072182.N(class072112);
                n4 = 0;
            }
        }
        return true;
    }
}

