/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01001
 *  minecraft.class06058
 *  minecraft.class06225
 *  minecraft.class06391
 *  minecraft.class07209
 *  minecraft.class07218
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01001;
import minecraft.class06058;
import minecraft.class06225;
import minecraft.class06391;
import minecraft.class07209;
import minecraft.class07218;

public class class02611
extends class06391<class06225> {
    public class02611(Codec<class06225> codec) {
        super(codec);
    }

    public boolean N(class06058<class06225> class060582) {
        class02611.N((class01001)class060582.y(), class060582.i(), false);
        return true;
    }

    public static void N(class01001 class010012, class07209 class072092, boolean bl) {
        class07218 class072182 = class072092.method_25503();
        for (int i = -2; i <= 2; ++i) {
            for (int j = -2; j <= 2; ++j) {
                for (int k = -1; k < 3; ++k) {
                    class00891 class008912;
                    class07218 class072183 = class072182.N((class00753)class072092).y(j, k, i);
                    class00891 class008913 = class008912 = k == -1 ? class00869.LV : class00869.N;
                    if (class010012.method_8320((class07209)class072183).N(class008912)) continue;
                    if (bl) {
                        class010012.N((class07209)class072183, true, null);
                    }
                    class010012.method_8652((class07209)class072183, class008912.W(), 3);
                }
            }
        }
    }
}

