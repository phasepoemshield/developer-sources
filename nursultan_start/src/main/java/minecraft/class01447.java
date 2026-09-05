/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00753
 *  minecraft.class01478
 *  minecraft.class04336
 *  minecraft.class05974
 *  minecraft.class06058
 *  minecraft.class06069
 *  minecraft.class06391
 *  minecraft.class07209
 *  minecraft.class07218
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00753;
import minecraft.class01478;
import minecraft.class04336;
import minecraft.class05974;
import minecraft.class06058;
import minecraft.class06069;
import minecraft.class06391;
import minecraft.class07209;
import minecraft.class07218;

public class class01447
extends class06391<class01478> {
    public class01447(Codec<class01478> codec) {
        super(codec);
    }

    public boolean N(class06058<class01478> class060582) {
        class01478 class014782 = (class01478)class060582.R();
        class06069 class060692 = class060582.u();
        class07209 class072092 = class060582.i();
        class05974 class059742 = class060582.y();
        int n = 0;
        class07218 class072182 = new class07218();
        int n2 = class014782.y() + 1;
        int n3 = class014782.L() + 1;
        for (int i = 0; i < class014782.N(); ++i) {
            class072182.N((class00753)class072092, class060692.y(n2) - class060692.y(n2), class060692.y(n3) - class060692.y(n3), class060692.y(n2) - class060692.y(n2));
            if (!((class04336)class014782.i().N()).N(class059742, class060582.L(), class060692, (class07209)class072182)) continue;
            ++n;
        }
        return n > 0;
    }
}

