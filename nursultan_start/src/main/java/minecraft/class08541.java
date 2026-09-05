/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00507
 *  minecraft.class00517
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01894
 *  minecraft.class04206
 *  minecraft.class06665
 *  minecraft.class08092
 */
package minecraft;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import minecraft.class00500;
import minecraft.class00507;
import minecraft.class00517;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01894;
import minecraft.class04206;
import minecraft.class06665;
import minecraft.class08092;

public class class08541 {
    private static final class00507<class00891, class00500> N = class08541.y();
    private static final class00507<class00891, class00500> y = class08541.y();
    private static final class01894 L = class01894.y((String)"glow_item_frame");
    private static final class01894 u = class01894.y((String)"item_frame");
    private static final Map<class01894, class00507<class00891, class00500>> i = Map.of(u, N, L, y);

    private static class00507<class00891, class00500> y() {
        return new class00517((Object)class00869.N).N(new class08092[]{class06665.yq}).N(class00891::W, class00500::new);
    }

    static Function<class01894, class00507<class00891, class00500>> N() {
        HashMap<class01894, class00507<class00891, class00500>> hashMap = new HashMap<class01894, class00507<class00891, class00500>>(i);
        for (class00891 class008912 : class04206.i) {
            hashMap.put(class008912.s().B().N(), (class00507<class00891, class00500>)class008912.E());
        }
        return hashMap::get;
    }

    public static class00500 N(boolean bl, boolean bl2) {
        return (class00500)((class00500)(bl ? y : N).y()).y((class08092)class06665.yq, (Comparable)Boolean.valueOf(bl2));
    }
}

