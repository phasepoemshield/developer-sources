/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class05974
 *  minecraft.class06058
 *  minecraft.class06209
 *  minecraft.class06391
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class05591;
import minecraft.class05974;
import minecraft.class06058;
import minecraft.class06209;
import minecraft.class06391;
import minecraft.class07209;

public class class05621
extends class06391<class05591> {
    public class05621(Codec<class05591> codec) {
        super(codec);
    }

    public boolean N(class06058<class05591> class060582) {
        class05974 class059742 = class060582.y();
        class07209 class072092 = class060582.i();
        for (class06209 class062092 : ((class05591)class060582.R()).y) {
            if (!class062092.y.N(class059742.method_8320(class072092), class060582.u())) continue;
            class059742.method_8652(class072092, class062092.L, 2);
            break;
        }
        return true;
    }
}

