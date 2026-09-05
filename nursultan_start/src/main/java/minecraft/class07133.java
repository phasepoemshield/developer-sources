/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class00608
 *  minecraft.class00741
 *  minecraft.class00772
 *  minecraft.class00869
 *  minecraft.class01362
 *  minecraft.class02625
 *  minecraft.class03530
 *  minecraft.class04782
 *  minecraft.class06069
 *  minecraft.class06584
 *  minecraft.class07299
 *  minecraft.class07323
 *  minecraft.class08036
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00394;
import minecraft.class00500;
import minecraft.class00608;
import minecraft.class00741;
import minecraft.class00772;
import minecraft.class00869;
import minecraft.class01362;
import minecraft.class02625;
import minecraft.class03530;
import minecraft.class04782;
import minecraft.class06069;
import minecraft.class06584;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07323;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;

public class class07133
extends class00741 {
    public static final MapCodec<class07133> i = class07133.y(class07133::new);

    protected void L(class00500 class005002, class07299 class072992, class07209 class072092) {
        if (((Boolean)class072992.method_75728().N(class00608.Y, class072092)).booleanValue()) {
            class072992.method_8650(class072092, false);
            return;
        }
        class072992.method_8501(class072092, class07133.y());
        class072992.method_8492(class072092, class07133.y().i(), null);
    }

    public class07133(class01362 class013622) {
        super(class013622);
    }

    public static class00500 y() {
        return class00869.K.W();
    }

    protected void y_2(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        if (class047822.method_8314(class00772.field_9282, class072092) > 11 - class005002.z()) {
            this.L(class005002, (class07299)class047822, class072092);
        }
    }

    public MapCodec<? extends class07133> N() {
        return i;
    }

    public void N(class07299 class072992, class08036 class080362, class07209 class072092, class00500 class005002, @Nullable class00394 class003942, class06584 class065842) {
        super.N(class072992, class080362, class072092, class005002, class003942, class065842);
        if (!class07323.N((class06584)class065842, (class03530)class02625.j)) {
            if (((Boolean)class072992.method_75728().N(class00608.Y, class072092)).booleanValue()) {
                class072992.method_8650(class072092, false);
                return;
            }
            class00500 class005003 = class072992.method_8320(class072092.method_10074());
            if (class005003.M() || class005003.T()) {
                class072992.method_8501(class072092, class07133.y());
            }
        }
    }
}

