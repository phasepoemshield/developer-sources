/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00807
 *  minecraft.class00869
 *  minecraft.class04995
 *  minecraft.class05974
 *  minecraft.class06058
 *  minecraft.class06069
 *  minecraft.class06225
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00807;
import minecraft.class00869;
import minecraft.class04995;
import minecraft.class05974;
import minecraft.class06058;
import minecraft.class06069;
import minecraft.class06225;
import minecraft.class06391;
import minecraft.class07209;

public class class06397
extends class06391<class06225> {
    public class06397(Codec<class06225> codec) {
        super(codec);
    }

    @Override
    public boolean N(class06058<class06225> class060582) {
        class05974 class059742 = class060582.y();
        class06069 class060692 = class060582.u();
        class07209 class072092 = class060582.i();
        float f = (float)class060692.y(3) + 4.0f;
        int n = 0;
        while (f > 0.5f) {
            for (int i = class04995.y((float)(-f)); i <= class04995.u((float)f); ++i) {
                for (int j = class04995.y((float)(-f)); j <= class04995.u((float)f); ++j) {
                    if (!((float)(i * i + j * j) <= (f + 1.0f) * (f + 1.0f))) continue;
                    this.N((class00807)class059742, class072092.method_10069(i, n, j), class00869.MP.W());
                }
            }
            f -= (float)class060692.y(2) + 0.5f;
            --n;
        }
        return true;
    }
}

