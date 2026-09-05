/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class01042
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02897
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class04248
 *  minecraft.class05946
 *  minecraft.class07001
 *  minecraft.class07209
 */
package minecraft;

import java.util.function.BiFunction;
import minecraft.class00381;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class01042;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02897;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class04248;
import minecraft.class05946;
import minecraft.class07001;
import minecraft.class07209;
import minecraft.class07280;

public class class07269
implements class00381<class07280> {
    public static final class02362<class04247, class07269> N = class02362.N((class02362)class07209.field_48404, class07269::N, (class02362)class02389.N((class05946)class04227.i), class07269::y, (class02362)class02389.v, class07269::L, class07269::new);
    private final class07209 y;
    private final class00404<?> L;
    private final class07001 u;

    public class07001 L() {
        return this.u;
    }

    private class07269(class07209 class072092, class00404<?> class004042, class07001 class070012) {
        this.y = class072092;
        this.L = class004042;
        this.u = class070012;
    }

    public class00404<?> y() {
        return this.L;
    }

    public static class07269 N(class00394 class003942, BiFunction<class00394, class01042, class07001> biFunction) {
        class01042 class010422 = class003942.G().method_30349();
        return new class07269(class003942.d(), class003942.O(), biFunction.apply(class003942, class010422));
    }

    public class07209 N() {
        return this.y;
    }

    public static class07269 N(class00394 class003942) {
        return class07269.N(class003942, class00394::N);
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public class02897<class07269> method_65080() {
        return class04248.B;
    }
}

