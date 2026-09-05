/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class02006
 *  minecraft.class02012
 *  minecraft.class02028
 *  minecraft.class02601
 *  minecraft.class08529
 */
package minecraft;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import minecraft.class01894;
import minecraft.class02006;
import minecraft.class02012;
import minecraft.class02028;
import minecraft.class02601;
import minecraft.class08529;
import minecraft.class08874;
import minecraft.class08877;
import minecraft.class08881;

public class class08860
implements class02028 {
    private final class02601 y;
    private final class02012 L;
    private final class08881 u;
    private final Map<class02006<Object>, Object> i = new ConcurrentHashMap<class02006<Object>, Object>();
    private final Function<class02006<Object>, Object> R = class020062 -> class020062.y((class02028)this);
    final /* synthetic */ class08874 N;

    public class02012 L() {
        return this.L;
    }

    class08860(class08874 class088742, class02601 class026012, class02012 class020122, class08881 class088812) {
        this.N = class088742;
        this.y = class026012;
        this.L = class020122;
        this.u = class088812;
    }

    public class02601 y() {
        return this.y;
    }

    public class08529 N(class01894 class018942) {
        class08529 class085292 = this.N.s.get(class018942);
        if (class085292 == null) {
            class08874.P.warn("Requested a model that was not discovered previously: {}", (Object)class018942);
            return this.N.T;
        }
        return class085292;
    }

    public <T> T N(class02006<T> class020062) {
        return (T)this.i.computeIfAbsent(class020062, this.R);
    }

    public class08877 N() {
        return this.u.N();
    }
}

