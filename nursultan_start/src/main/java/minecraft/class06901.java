/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class06092
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class08092
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.Function;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class06092;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class08092;

public abstract class class06901
extends class00891 {
    public static final class06667 y = class06665.c;
    public static final class06667 L = class06665.X;
    public static final class06667 u = class06665.a;
    public static final class06667 i = class06665.p;
    public static final class06667 R = class06665.e;
    public static final class06667 M = class06665.H;
    public static final Map<class07211, class06667> B = ImmutableMap.copyOf((Map)Maps.newEnumMap(Map.of(class07211.field_11043, y, class07211.field_11034, L, class07211.field_11035, u, class07211.field_11039, i, class07211.field_11036, R, class07211.field_11033, M)));
    private final Function<class00500, class00494> N;

    public class06901(float f, class01362 class013622) {
        super(class013622);
        this.N = this.N(f);
    }

    protected boolean y(class00500 class005002) {
        return false;
    }

    private Function<class00500, class00494> N(float f) {
        class00494 class004942 = class00891.N((double)f);
        Map map = class00389.u((class00494)class00891.L((double)f, (double)0.0, (double)8.0));
        return this.N(class005002 -> {
            class00494 class004943 = class004942;
            for (Map.Entry<class07211, class06667> entry : B.entrySet()) {
                if (!((Boolean)class005002.L((class08092)entry.getValue())).booleanValue()) continue;
                class004943 = class00389.N((class00494)((class00494)map.get(entry.getKey())), (class00494)class004943);
            }
            return class004943;
        });
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return this.N.apply(class005002);
    }

    protected abstract MapCodec<? extends class06901> N();
}

