/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06839
 */
package minecraft;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import minecraft.class06839;
import minecraft.class07393;
import minecraft.class07403;
import minecraft.class07423;

public class class07405 {
    public static <T> class07423<T> N(class07393 class073932, class06839<T> class068392, T t) {
        return class073932.u().N(class068392, t);
    }

    public static <T> class07423<T> N(class07393 class073932, class07423<T> class074232, class07403 class074032) {
        return class073932.u().N(class074232, class074032);
    }

    private static <T> void N(class07393 class073932, class06839<T> class068392, List<class07423<?>> list) {
        T t = class073932.u().N(class068392);
        list.add(class07405.N(class073932, class068392, Objects.requireNonNull(t)));
    }

    public static List<class07423<?>> N(class07393 class073932) {
        ArrayList arrayList = new ArrayList();
        class073932.u().N().forEach(class068392 -> class07405.N(class073932, class068392, arrayList));
        return arrayList;
    }
}

