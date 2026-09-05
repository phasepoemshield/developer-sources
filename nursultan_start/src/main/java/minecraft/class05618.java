/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class04336
 *  minecraft.class04747
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
import minecraft.class04747;
import minecraft.class05629;
import minecraft.class05974;
import minecraft.class06058;
import minecraft.class06069;
import minecraft.class06391;
import minecraft.class07209;
import minecraft.class08088;

public class class05618
extends class06391<class05629> {
    public class05618(Codec<class05629> codec) {
        super(codec);
    }

    public boolean N(class06058<class05629> class060582) {
        class05629 class056292 = (class05629)class060582.R();
        class06069 class060692 = class060582.u();
        class05974 class059742 = class060582.y();
        class08088 class080882 = class060582.L();
        class07209 class072092 = class060582.i();
        for (class04747 class047472 : class056292.y) {
            if (!(class060692.z() < class047472.L)) continue;
            return class047472.N(class059742, class080882, class060692, class072092);
        }
        return ((class04336)class056292.L.N()).N(class059742, class080882, class060692, class072092);
    }
}

