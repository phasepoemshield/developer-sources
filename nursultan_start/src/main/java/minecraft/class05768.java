/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  minecraft.class01289
 *  minecraft.class04782
 *  minecraft.class05359
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class07438
 *  minecraft.class08041
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import minecraft.class01289;
import minecraft.class04782;
import minecraft.class05359;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class05765;
import minecraft.class07438;
import minecraft.class08041;

public class class05768
extends class05765<class08041> {
    public static boolean L(class07438 class074382) {
        return class074382.method_18868().N(class05378.d);
    }

    @Override
    protected void L(class04782 class047822, class08041 class080412, long l) {
        if (l % 100L == 0L) {
            class080412.N(class047822, l, 3);
        }
    }

    public class05768() {
        super((Map<class05378<?>, class05367>)ImmutableMap.of());
    }

    public static boolean y(class07438 class074382) {
        return class074382.method_18868().N(class05378.Y);
    }

    @Override
    protected void u(class04782 class047822, class08041 class080412, long l) {
        if (class05768.L((class07438)class080412) || class05768.y((class07438)class080412)) {
            class01289 var5 = class080412.method_18868();
            if (!var5.L(class05359.M)) {
                var5.y(class05378.n);
                var5.y(class05378.m);
                var5.y(class05378.P);
                var5.y(class05378.j);
                var5.y(class05378.b);
            }
            var5.N(class05359.M);
        }
    }

    @Override
    protected boolean N(class04782 class047822, class08041 class080412, long l) {
        return class05768.L((class07438)class080412) || class05768.y((class07438)class080412);
    }
}

