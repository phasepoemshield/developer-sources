/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  minecraft.class01312
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class05765
 *  minecraft.class07049
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import minecraft.class01312;
import minecraft.class03984;
import minecraft.class04003;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class05765;
import minecraft.class07049;

public class class04004<E extends class04003>
extends class05765<E> {
    private static final double N = 6.0;
    private static final double y = 20.0;

    protected void y(class04782 class047822, E e, long l) {
        if (e.method_41328(class01312.field_38098)) {
            e.method_18380(class01312.field_18076);
        }
        ((class04003)((Object)e)).method_18868().y(class05378.NH);
        ((class04003)((Object)e)).method_18868().L(class05378.Q).filter(arg_0 -> e.L(arg_0)).ifPresent(class074382 -> {
            if (e.method_43259((class07049)class074382, 6.0, 20.0)) {
                e.i((class07049)class074382);
            }
            if (!e.method_18868().N(class05378.NV)) {
                class03984.N(e, class074382.method_24515());
            }
        });
    }

    public class04004(int n) {
        super((Map)ImmutableMap.of((Object)class05378.NH, (Object)class05367.field_18456, (Object)class05378.s, (Object)class05367.field_18457, (Object)class05378.m, (Object)class05367.field_18457, (Object)class05378.P, (Object)class05367.field_18458, (Object)class05378.Q, (Object)class05367.field_18458, (Object)class05378.NV, (Object)class05367.field_18458, (Object)class05378.NF, (Object)class05367.field_18458), n);
    }

    protected void u(class04782 class047822, E e, long l) {
        e.method_5783(class04909.IP, 5.0f, 1.0f);
    }

    protected boolean N(class04782 class047822, E e, long l) {
        return true;
    }
}

