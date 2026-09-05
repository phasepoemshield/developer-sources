/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class01137
 *  minecraft.class01362
 *  minecraft.class06183
 *  minecraft.class07082
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07796
 *  minecraft.class08036
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00394;
import minecraft.class00500;
import minecraft.class01137;
import minecraft.class01362;
import minecraft.class06183;
import minecraft.class07082;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07796;
import minecraft.class08036;
import minecraft.class08610;
import org.jspecify.annotations.Nullable;

public class class08615
extends class07796
implements class01137 {
    public static final MapCodec<class08615> N = class08615.y(class08615::new);

    public class08615(class01362 class013622) {
        super(class013622);
    }

    public @Nullable class00394 N(class07209 class072092, class00500 class005002) {
        return new class08610(class072092, class005002);
    }

    protected MapCodec<class08615> N() {
        return N;
    }

    protected class07082 N(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class06183 class061832) {
        class00394 class003942 = class072992.method_8321(class072092);
        if (!(class003942 instanceof class08610)) {
            return class07082.i;
        }
        class08610 class086102 = (class08610)class003942;
        if (!class080362.method_7338()) {
            return class07082.i;
        }
        if (class080362.method_73183().method_8608()) {
            class080362.method_66696(class086102);
        }
        return class07082.N;
    }
}

