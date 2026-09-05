/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00419
 *  minecraft.class00500
 *  minecraft.class01118
 *  minecraft.class01235
 *  minecraft.class01362
 *  minecraft.class05700
 *  minecraft.class06183
 *  minecraft.class06237
 *  minecraft.class06563
 *  minecraft.class07082
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class08036
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00419;
import minecraft.class00500;
import minecraft.class01118;
import minecraft.class01235;
import minecraft.class01362;
import minecraft.class05700;
import minecraft.class06183;
import minecraft.class06237;
import minecraft.class06563;
import minecraft.class07082;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07796;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;

public class class07763
extends class07796
implements class05700 {
    public static final MapCodec<class07763> N = class07763.y(class07763::new);

    public class07763(class01362 class013622) {
        super(class013622);
    }

    public class06563 y() {
        return class06563.field_7952;
    }

    public MapCodec<class07763> N() {
        return N;
    }

    protected class07082 N(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class06183 class061832) {
        class00394 class003942;
        if (!class072992.method_8608() && (class003942 = class072992.method_8321(class072092)) instanceof class00419) {
            class00419 class004192 = (class00419)class003942;
            class080362.method_17355((class06237)class004192);
            class080362.method_7281(class01235.Nu);
        }
        return class07082.N;
    }

    public <T extends class00394> @Nullable class01118<T> N(class07299 class072992, class00500 class005002, class00404<T> class004042) {
        return class07763.N(class004042, class00404.field_11890, class00419::N);
    }

    public class00394 N(class07209 class072092, class00500 class005002) {
        return new class00419(class072092, class005002);
    }
}

