/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.logging.LogUtils
 *  minecraft.class00392
 *  minecraft.class01341
 *  minecraft.class01454
 *  minecraft.class01529
 *  minecraft.class03133
 *  minecraft.class04206
 *  minecraft.class04946
 *  minecraft.class04963
 *  minecraft.class05096
 *  minecraft.class05254
 *  minecraft.class05385
 *  minecraft.class05417
 *  minecraft.class05419
 *  minecraft.class05661
 *  minecraft.class05907
 *  minecraft.class05984
 *  minecraft.class06026
 *  minecraft.class06178
 *  minecraft.class06202
 *  minecraft.class06239
 *  minecraft.class06274
 *  minecraft.class07482
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.util.Map;
import minecraft.class00392;
import minecraft.class01341;
import minecraft.class01454;
import minecraft.class01529;
import minecraft.class03133;
import minecraft.class04206;
import minecraft.class04946;
import minecraft.class04963;
import minecraft.class05096;
import minecraft.class05254;
import minecraft.class05385;
import minecraft.class05417;
import minecraft.class05419;
import minecraft.class05661;
import minecraft.class05851;
import minecraft.class05870;
import minecraft.class05876;
import minecraft.class05877;
import minecraft.class05889;
import minecraft.class05907;
import minecraft.class05984;
import minecraft.class06026;
import minecraft.class06178;
import minecraft.class06202;
import minecraft.class06239;
import minecraft.class06274;
import minecraft.class07482;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class05866 {
    private static final Logger N = LogUtils.getLogger();
    private static final Map<class05851<?>, class05877<?, ?>> y = Maps.newHashMap();

    static {
        class05866.N(class05851.field_18664, class06026::new);
        class05866.N(class05851.field_18665, class06026::new);
        class05866.N(class05851.field_17326, class06026::new);
        class05866.N(class05851.field_18666, class06026::new);
        class05866.N(class05851.field_18667, class06026::new);
        class05866.N(class05851.field_17327, class06026::new);
        class05866.N(class05851.field_17328, class01529::new);
        class05866.N(class05851.field_46790, class03133::new);
        class05866.N(class05851.field_17329, class05889::new);
        class05866.N(class05851.field_17330, class01454::new);
        class05866.N(class05851.field_17331, class05661::new);
        class05866.N(class05851.field_17332, class05907::new);
        class05866.N(class05851.field_17333, class05984::new);
        class05866.N(class05851.field_17334, class04946::new);
        class05866.N(class05851.field_17335, class06274::new);
        class05866.N(class05851.field_17336, class05254::new);
        class05866.N(class05851.field_17337, class04963::new);
        class05866.N(class05851.field_17338, class05876::new);
        class05866.N(class05851.field_17339, class05385::new);
        class05866.N(class05851.field_17340, class05417::new);
        class05866.N(class05851.field_17341, class01341::new);
        class05866.N(class05851.field_22484, class05419::new);
        class05866.N(class05851.field_17342, class06239::new);
        class05866.N(class05851.field_17343, class05870::new);
        class05866.N(class05851.field_17625, class06178::new);
    }

    public static <M extends class07482, U extends class05096> void N(class05851<? extends M> class058512, class05877<M, U> class058772) {
        if (y.put(class058512, class058772) != null) {
            throw new IllegalStateException("Duplicate registration for " + String.valueOf(class04206.T.y(class058512)));
        }
    }

    public static boolean N() {
        boolean bl = false;
        for (class05851 var2 : class04206.T) {
            if (y.containsKey(var2)) continue;
            N.debug("Menu {} has no matching screen", (Object)class04206.T.y((Object)var2));
            bl = true;
        }
        return bl;
    }

    public static <T extends class07482> void N(class05851<T> class058512, class06202 class062022, int n, class00392 class003922) {
        class05877<T, ?> class058772 = class05866.N(class058512);
        if (class058772 == null) {
            N.warn("Failed to create screen for menu type: {}", (Object)class04206.T.y(class058512));
            return;
        }
        class058772.N(class003922, class058512, class062022, n);
    }

    public static <T extends class07482> @Nullable class05877<T, ?> N(class05851<T> class058512) {
        return y.get(class058512);
    }
}

