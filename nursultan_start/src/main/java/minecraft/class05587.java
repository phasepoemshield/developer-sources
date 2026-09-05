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
import minecraft.class05602;
import minecraft.class05974;
import minecraft.class06058;
import minecraft.class06069;
import minecraft.class06391;
import minecraft.class07209;
import minecraft.class08088;

public class class05587
extends class06391<class05602> {
    public class05587(Codec<class05602> codec) {
        super(codec);
    }

    public boolean N(class06058<class05602> class060582) {
        class06069 class060692 = class060582.u();
        class05602 class056022 = (class05602)class060582.R();
        class05974 class059742 = class060582.y();
        class07209 class072092 = class060582.i();
        class08088 class080882 = class060582.L();
        int n = class060692.y(class056022.y.y());
        return ((class04336)class056022.y.N(n).N()).N(class059742, class080882, class060692, class072092);
    }
}

