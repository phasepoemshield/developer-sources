/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  minecraft.class01289
 *  minecraft.class01312
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class05765
 *  minecraft.class06244
 *  minecraft.class06293
 *  minecraft.class07049
 *  minecraft.class07438
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import minecraft.class01289;
import minecraft.class01312;
import minecraft.class03984;
import minecraft.class04003;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class05765;
import minecraft.class06244;
import minecraft.class06293;
import minecraft.class07049;
import minecraft.class07438;

public class class04012
extends class05765<class04003> {
    private static final int N = 25;
    private static final int y = 20;

    protected void L(class04782 class047822, class04003 class040032, long l) {
        if (class040032.method_18868().N(class05378.NX) || class040032.method_18868().N(class05378.Np)) {
            return;
        }
        class040032.method_18868().N(class05378.Np, (Object)class06244.field_17274, (long)(class03984.y - 25));
        class040032.method_5783(class04909.Im, 3.0f, 1.0f);
    }

    public class04012() {
        super((Map)ImmutableMap.of((Object)class05378.NK, (Object)class05367.field_18456, (Object)class05378.s, (Object)class05367.field_18457, (Object)class05378.Np, (Object)class05367.field_18458, (Object)class05378.NX, (Object)class05367.field_18458), class03984.y);
    }

    protected void u(class04782 class047822, class04003 class040032, long l) {
        if (class040032.method_41328(class01312.field_38097)) {
            class040032.method_18380(class01312.field_18076);
        }
        class040032.method_18868().L(class05378.NK).ifPresent(class040032::N);
        class040032.method_18868().y(class05378.NK);
    }

    protected boolean y(class04782 class047822, class04003 class040032, long l) {
        return true;
    }

    protected void N(class04782 class047822, class04003 class040032, long l) {
        class01289<class04003> var5 = class040032.method_18868();
        var5.N(class05378.NX, (Object)class06244.field_17274, 25L);
        var5.y(class05378.m);
        class07438 class074382 = (class07438)class040032.method_18868().L(class05378.NK).get();
        class06293.N((class07438)class040032, (class07438)class074382);
        class040032.method_18380(class01312.field_38097);
        class040032.N((class07049)class074382, 20, false);
    }
}

