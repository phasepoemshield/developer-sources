/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00500
 *  minecraft.class00659
 *  minecraft.class00869
 *  minecraft.class05974
 *  minecraft.class06058
 *  minecraft.class06225
 *  minecraft.class06391
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00500;
import minecraft.class00659;
import minecraft.class00869;
import minecraft.class05974;
import minecraft.class06058;
import minecraft.class06225;
import minecraft.class06391;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class08092;

public class class04772
extends class06391<class06225> {
    public class04772(Codec<class06225> codec) {
        super(codec);
    }

    public boolean N(class06058<class06225> class060582) {
        class05974 class059742 = class060582.y();
        class07209 class072092 = class060582.i();
        class060582.R();
        if (!class059742.R(class072092)) {
            return false;
        }
        for (class07211 class072112 : class07211.values()) {
            if (class072112 == class07211.field_11033 || !class00659.N((class07290)class059742, (class07209)class072092.method_10093(class072112), (class07211)class072112)) continue;
            class059742.method_8652(class072092, (class00500)class00869.Rc.W().y((class08092)class00659.N((class07211)class072112), (Comparable)Boolean.valueOf(true)), 2);
            return true;
        }
        return false;
    }
}

