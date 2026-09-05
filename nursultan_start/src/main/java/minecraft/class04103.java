/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00500
 *  minecraft.class03560
 *  minecraft.class06069
 *  minecraft.class06225
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07221
 *  minecraft.class07284
 *  minecraft.class07536
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.stream.Stream;
import minecraft.class00500;
import minecraft.class03560;
import minecraft.class06069;
import minecraft.class06225;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07221;
import minecraft.class07284;
import minecraft.class07536;

public class class04103
extends class03560 {
    public class04103(Codec<class06225> codec) {
        super(codec);
    }

    protected boolean N(class07284 class072842, class06069 class060692, class07209 class072092, class00500 class005002) {
        if (!this.y(class072842, class060692, class072092, class005002)) {
            return false;
        }
        class07211 class072112 = class07221.field_11062.N(class060692);
        int n = class060692.y(2) + 2;
        block0: for (class07211 class072113 : class07536.N(Stream.of(class072112, class072112.R(), class072112.M()), (class06069)class060692).subList(0, n)) {
            int n2;
            int n3;
            class07211 class072114;
            class07218 class072182 = class072092.method_25503();
            int n4 = class060692.y(2) + 1;
            class072182.N(class072113);
            if (class072113 == class072112) {
                class072114 = class072112;
                n3 = class060692.y(3) + 2;
            } else {
                class072182.N(class07211.field_11036);
                Object[] objectArray = new class07211[]{class072113, class07211.field_11036};
                class072114 = (class07211)class07536.N((Object[])objectArray, (class06069)class060692);
                n3 = class060692.y(3) + 3;
            }
            for (n2 = 0; n2 < n4 && this.y(class072842, class060692, (class07209)class072182, class005002); ++n2) {
                class072182.N(class072114);
            }
            class072182.N(class072114.b());
            class072182.N(class07211.field_11036);
            for (n2 = 0; n2 < n3; ++n2) {
                class072182.N(class072112);
                if (!this.y(class072842, class060692, (class07209)class072182, class005002)) continue block0;
                if (!(class060692.z() < 0.25f)) continue;
                class072182.N(class07211.field_11036);
            }
        }
        return true;
    }
}

