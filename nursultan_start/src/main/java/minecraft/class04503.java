/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  minecraft.class01289
 *  minecraft.class01312
 *  minecraft.class02289
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class05765
 *  minecraft.class06244
 *  minecraft.class06584
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07664
 *  minecraft.class08005
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import minecraft.class01289;
import minecraft.class01312;
import minecraft.class02289;
import minecraft.class04508;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class05765;
import minecraft.class06244;
import minecraft.class06584;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07664;
import minecraft.class08005;

public class class04503
extends class05765<class04508> {
    private static final int N = 256;
    private static final int y = 5;
    private static final int L = 4;
    private static final float u = 0.7f;
    private static final int i = Math.round(15.0f);
    private static final int R = Math.round(4.0f);
    private static final int Z = Math.round(10.0f);

    protected void L(class04782 class047822, class04508 class045082, long l) {
        if (class045082.method_18376() == class01312.field_47247) {
            class045082.method_18380(class01312.field_18076);
        }
        class045082.method_18868().N(class05378.yz, (Object)class06244.field_17274, (long)Z);
        class045082.method_18868().y(class05378.yM);
    }

    public class04503() {
        super((Map)ImmutableMap.of((Object)class05378.s, (Object)class05367.field_18456, (Object)class05378.yz, (Object)class05367.field_18457, (Object)class05378.yB, (Object)class05367.field_18457, (Object)class05378.yZ, (Object)class05367.field_18457, (Object)class05378.yM, (Object)class05367.field_18456, (Object)class05378.m, (Object)class05367.field_18457, (Object)class05378.yE, (Object)class05367.field_18457), i + 1 + R);
    }

    protected void u(class04782 class047822, class04508 class045082, long l) {
        class01289<class04508> var5 = class045082.method_18868();
        class07438 class074382 = var5.L(class05378.s).orElse(null);
        if (class074382 == null) {
            return;
        }
        class045082.method_5702(class07664.field_9851, class074382.method_73189());
        if (var5.L(class05378.yB).isPresent() || var5.L(class05378.yZ).isPresent()) {
            return;
        }
        var5.N(class05378.yZ, (Object)class06244.field_17274, (long)R);
        double d = class074382.method_23317() - class045082.method_23317();
        double d2 = class074382.method_23323(class074382.method_5765() ? 0.8 : 0.3) - class045082.v();
        double d3 = class074382.method_23321() - class045082.method_23321();
        class08005.N((class08005)new class02289(class045082, (class07299)class047822), (class04782)class047822, (class06584)class06584.E, (double)d, (double)d2, (double)d3, (float)0.7f, (float)(5 - class047822.y().N() * 4));
        class045082.method_5783(class04909.LS, 1.5f, 1.0f);
    }

    protected void y(class04782 class047822, class04508 class045082, long l) {
        class045082.method_18868().L(class05378.s).ifPresent(class074382 -> class045082.method_18380(class01312.field_47247));
        class045082.method_18868().N(class05378.yB, (Object)class06244.field_17274, (long)i);
        class045082.method_5783(class04909.LA, 1.0f, 1.0f);
    }

    protected boolean N(class04782 class047822, class04508 class045082) {
        if (class045082.method_18376() != class01312.field_18076) {
            return false;
        }
        return class045082.method_18868().L(class05378.s).map(class074382 -> class04503.N(class045082, class074382)).map(bl -> {
            if (!bl.booleanValue()) {
                class045082.method_18868().y(class05378.yM);
            }
            return bl;
        }).orElse(false);
    }

    protected boolean N(class04782 class047822, class04508 class045082, long l) {
        return class045082.method_18868().N(class05378.s) && class045082.method_18868().N(class05378.yM);
    }

    private static boolean N(class04508 class045082, class07438 class074382) {
        return class045082.method_73189().M(class074382.method_73189()) < 256.0;
    }
}

