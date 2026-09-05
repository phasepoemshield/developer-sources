/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00500
 *  minecraft.class03560
 *  minecraft.class06069
 *  minecraft.class06225
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07284
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00500;
import minecraft.class03560;
import minecraft.class06069;
import minecraft.class06225;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07284;

public class class01936
extends class03560 {
    public class01936(Codec<class06225> codec) {
        super(codec);
    }

    protected boolean N(class07284 class072842, class06069 class060692, class07209 class072092, class00500 class005002) {
        int n = class060692.y(3) + 3;
        int n2 = class060692.y(3) + 3;
        int n3 = class060692.y(3) + 3;
        int n4 = class060692.y(3) + 1;
        class07218 class072182 = class072092.method_25503();
        for (int i = 0; i <= n2; ++i) {
            for (int j = 0; j <= n; ++j) {
                for (int k = 0; k <= n3; ++k) {
                    class072182.N(i + class072092.method_10263(), j + class072092.method_10264(), k + class072092.method_10260());
                    class072182.N(class07211.field_11033, n4);
                    if ((i != 0 && i != n2 || j != 0 && j != n) && (k != 0 && k != n3 || j != 0 && j != n) && (i != 0 && i != n2 || k != 0 && k != n3) && (i == 0 || i == n2 || j == 0 || j == n || k == 0 || k == n3) && !(class060692.z() < 0.1f) && this.y(class072842, class060692, (class07209)class072182, class005002)) continue;
                }
            }
        }
        return true;
    }
}

