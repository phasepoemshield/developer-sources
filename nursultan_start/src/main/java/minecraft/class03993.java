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
 *  minecraft.class07062
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import minecraft.class01312;
import minecraft.class04003;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class05765;
import minecraft.class07062;

public class class03993<E extends class04003>
extends class05765<E> {
    protected void y(class04782 class047822, E e, long l) {
        if (e.method_35049() == null) {
            e.method_5650(class07062.field_26999);
        }
    }

    public class03993(int n) {
        super((Map)ImmutableMap.of((Object)class05378.s, (Object)class05367.field_18457, (Object)class05378.m, (Object)class05367.field_18457), n);
    }

    protected void u(class04782 class047822, E e, long l) {
        if (e.method_24828()) {
            e.method_18380(class01312.field_38100);
            e.method_5783(class04909.Ii, 5.0f, 1.0f);
        } else {
            e.method_5783(class04909.gr, 5.0f, 1.0f);
            this.y(class047822, e, l);
        }
    }

    protected boolean N(class04782 class047822, E e) {
        return e.method_24828() || e.method_5799() || e.method_5771();
    }

    protected boolean N(class04782 class047822, E e, long l) {
        return e.method_35049() == null;
    }
}

