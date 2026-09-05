/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10552
 *  Nursultan.class10553
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00500
 *  minecraft.class06025
 *  minecraft.class06029
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class08092
 */
package minecraft;

import Nursultan.class10552;
import Nursultan.class10553;
import java.util.function.BiPredicate;
import java.util.function.Function;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00500;
import minecraft.class05992;
import minecraft.class06025;
import minecraft.class06029;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class08092;

public class class05994 {
    public static <S extends class00394> class06025<S> N(class00404<S> class004042, Function<class00500, class05992> function, Function<class00500, class07211> function2, class08092<class07211> class080922, class00500 class005002, class07284 class072842, class07209 class072092, BiPredicate<class07284, class07209> biPredicate) {
        class05992 class059922;
        boolean bl;
        class00394 class003942 = class004042.method_24182((class07290)class072842, class072092);
        if (class003942 == null) {
            return class06029::y;
        }
        if (biPredicate.test(class072842, class072092)) {
            return class06029::y;
        }
        class05992 class059923 = function.apply(class005002);
        boolean bl2 = class059923 == class05992.field_21783;
        boolean bl3 = bl = class059923 == class05992.field_21784;
        if (bl2) {
            return new class10552((Object)class003942);
        }
        class07209 class072093 = class072092.method_10093(function2.apply(class005002));
        class00500 class005003 = class072842.method_8320(class072093);
        if (class005003.N(class005002.i()) && (class059922 = function.apply(class005003)) != class05992.field_21783 && class059923 != class059922 && class005003.L(class080922) == class005002.L(class080922)) {
            if (biPredicate.test(class072842, class072093)) {
                return class06029::y;
            }
            class00394 class003943 = class004042.method_24182((class07290)class072842, class072093);
            if (class003943 != null) {
                class00394 class003944 = bl ? class003942 : class003943;
                class00394 class003945 = bl ? class003943 : class003942;
                return new class10553((Object)class003944, (Object)class003945);
            }
        }
        return new class10552((Object)class003942);
    }
}

