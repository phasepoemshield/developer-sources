/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00869
 *  minecraft.class00898
 *  minecraft.class05974
 *  minecraft.class06058
 *  minecraft.class06069
 *  minecraft.class06225
 *  minecraft.class06391
 *  minecraft.class07209
 *  minecraft.class07284
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00869;
import minecraft.class00898;
import minecraft.class05974;
import minecraft.class06058;
import minecraft.class06069;
import minecraft.class06225;
import minecraft.class06391;
import minecraft.class07209;
import minecraft.class07284;

public class class03613
extends class06391<class06225> {
    public class03613(Codec<class06225> codec) {
        super(codec);
    }

    public boolean N(class06058<class06225> class060582) {
        class05974 class059742 = class060582.y();
        class07209 class072092 = class060582.i();
        class06069 class060692 = class060582.u();
        if (class059742.R(class072092) && class059742.method_8320(class072092.method_10074()).N(class00869.MP)) {
            class00898.N((class07284)class059742, (class07209)class072092, (class06069)class060692, (int)8);
            return true;
        }
        return false;
    }
}

