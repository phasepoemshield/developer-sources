/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00394
 *  minecraft.class00491
 *  minecraft.class00807
 *  minecraft.class00869
 *  minecraft.class05974
 *  minecraft.class06058
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00394;
import minecraft.class00491;
import minecraft.class00807;
import minecraft.class00869;
import minecraft.class05974;
import minecraft.class06058;
import minecraft.class06391;
import minecraft.class06414;
import minecraft.class07209;

public class class06389
extends class06391<class06414> {
    public class06389(Codec<class06414> codec) {
        super(codec);
    }

    @Override
    public boolean N(class06058<class06414> class060582) {
        class07209 class072092 = class060582.i();
        class05974 class059742 = class060582.y();
        class06414 class064142 = (class06414)class060582.R();
        for (class07209 class072094 : class07209.method_10097((class07209)class072092.method_10069(-1, -2, -1), (class07209)class072092.method_10069(1, 2, 1))) {
            boolean bl;
            boolean bl2 = class072094.method_10263() == class072092.method_10263();
            boolean bl3 = class072094.method_10264() == class072092.method_10264();
            boolean bl4 = class072094.method_10260() == class072092.method_10260();
            boolean bl5 = bl = Math.abs(class072094.method_10264() - class072092.method_10264()) == 2;
            if (bl2 && bl3 && bl4) {
                class07209 class072095 = class072094.method_10062();
                this.N((class00807)class059742, class072095, class00869.EY.W());
                class064142.y().ifPresent(class072093 -> {
                    class00394 class003942 = class059742.method_8321(class072095);
                    if (class003942 instanceof class00491) {
                        ((class00491)class003942).N(class072093, class064142.L());
                    }
                });
                continue;
            }
            if (bl3) {
                this.N((class00807)class059742, class072094, class00869.N.W());
                continue;
            }
            if (bl && bl2 && bl4) {
                this.N((class00807)class059742, class072094, class00869.q.W());
                continue;
            }
            if (!bl2 && !bl4 || bl) {
                this.N((class00807)class059742, class072094, class00869.N.W());
                continue;
            }
            this.N((class00807)class059742, class072094, class00869.q.W());
        }
        return true;
    }
}

