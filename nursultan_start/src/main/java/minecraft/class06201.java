/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class04336
 *  minecraft.class05974
 *  minecraft.class06058
 *  minecraft.class06069
 *  minecraft.class06391
 *  minecraft.class07209
 *  minecraft.class08088
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class04336;
import minecraft.class05974;
import minecraft.class06058;
import minecraft.class06069;
import minecraft.class06189;
import minecraft.class06391;
import minecraft.class07209;
import minecraft.class08088;

public class class06201
extends class06391<class06189> {
    public class06201(Codec<class06189> codec) {
        super(codec);
    }

    public boolean N(class06058<class06189> class060582) {
        class06069 class060692 = class060582.u();
        class06189 class061892 = (class06189)class060582.R();
        class05974 class059742 = class060582.y();
        class08088 class080882 = class060582.L();
        class07209 class072092 = class060582.i();
        return ((class04336)(class060692.Z() ? class061892.y : class061892.L).N()).N(class059742, class080882, class060692, class072092);
    }
}

