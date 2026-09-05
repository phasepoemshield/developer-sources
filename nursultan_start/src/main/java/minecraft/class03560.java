/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01210
 *  minecraft.class04206
 *  minecraft.class05974
 *  minecraft.class06058
 *  minecraft.class06069
 *  minecraft.class06225
 *  minecraft.class06391
 *  minecraft.class06996
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07221
 *  minecraft.class07284
 *  minecraft.class07774
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.Optional;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01210;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class05974;
import minecraft.class06058;
import minecraft.class06069;
import minecraft.class06225;
import minecraft.class06391;
import minecraft.class06996;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07221;
import minecraft.class07284;
import minecraft.class07774;
import minecraft.class08092;

public abstract class class03560
extends class06391<class06225> {
    public class03560(Codec<class06225> codec) {
        super(codec);
    }

    protected boolean y(class07284 class072842, class06069 class060692, class07209 class072092, class00500 class005002) {
        class07209 class072093 = class072092.method_10084();
        class00500 class005003 = class072842.method_8320(class072092);
        if (!class005003.N(class00869.K) && !class005003.N(class01210.NK) || !class072842.method_8320(class072093).N(class00869.K)) {
            return false;
        }
        class072842.method_8652(class072092, class005002, 3);
        if (class060692.z() < 0.25f) {
            class04206.i.N(class01210.NK, class060692).map(class03556::N).ifPresent(class008912 -> class072842.method_8652(class072093, class008912.W(), 2));
        } else if (class060692.z() < 0.05f) {
            class072842.method_8652(class072093, (class00500)class00869.mA.W().y((class08092)class06996.L, (Comparable)Integer.valueOf(class060692.y(4) + 1)), 2);
        }
        for (class07211 class072112 : class07221.field_11062) {
            class07209 class072094;
            if (!(class060692.z() < 0.2f) || !class072842.method_8320(class072094 = class072092.method_10093(class072112)).N(class00869.K)) continue;
            class04206.i.N(class01210.No, class060692).map(class03556::N).ifPresent(class008912 -> {
                class00500 class005002 = class008912.W();
                if (class005002.y((class08092)class07774.L)) {
                    class005002 = (class00500)class005002.y((class08092)class07774.L, (Comparable)class072112);
                }
                class072842.method_8652(class072094, class005002, 2);
            });
        }
        return true;
    }

    public boolean N(class06058<class06225> class060582) {
        class06069 class060692 = class060582.u();
        class05974 class059742 = class060582.y();
        class07209 class072092 = class060582.i();
        Optional<Object> optional = class04206.i.N(class01210.NJ, class060692).map(class03556::N);
        if (optional.isEmpty()) {
            return false;
        }
        return this.N((class07284)class059742, class060692, class072092, ((class00891)optional.get()).W());
    }

    protected abstract boolean N(class07284 var1, class06069 var2, class07209 var3, class00500 var4);
}

