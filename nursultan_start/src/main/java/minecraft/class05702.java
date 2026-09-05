/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class05974
 *  minecraft.class06058
 *  minecraft.class06391
 *  minecraft.class07209
 *  minecraft.class07218
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class05718;
import minecraft.class05974;
import minecraft.class06058;
import minecraft.class06391;
import minecraft.class07209;
import minecraft.class07218;

public class class05702
extends class06391<class05718> {
    public class05702(Codec<class05718> codec) {
        super(codec);
    }

    public boolean N(class06058<class05718> class060582) {
        class07209 class072092 = class060582.i();
        class05718 class057182 = (class05718)class060582.R();
        class05974 class059742 = class060582.y();
        class07218 class072182 = new class07218();
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                int n = class072092.method_10263() + i;
                int n2 = class072092.method_10260() + j;
                int n3 = class059742.method_31607() + class057182.y;
                class072182.N(n, n3, n2);
                if (!class059742.method_8320((class07209)class072182).P()) continue;
                class059742.method_8652((class07209)class072182, class057182.L, 2);
            }
        }
        return true;
    }
}

