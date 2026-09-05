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

public class class03990<E extends class04003>
extends class05765<E> {
    protected void y(class04782 class047822, E e, long l) {
        if (e.method_41328(class01312.field_38099)) {
            e.method_18380(class01312.field_18076);
        }
    }

    public class03990(int n) {
        super((Map)ImmutableMap.of((Object)class05378.Nc, (Object)class05367.field_18456, (Object)class05378.m, (Object)class05367.field_18457, (Object)class05378.P, (Object)class05367.field_18458), n);
    }

    protected void u(class04782 class047822, E e, long l) {
        e.method_18380(class01312.field_38099);
        e.method_5783(class04909.IR, 5.0f, 1.0f);
    }

    protected boolean N(class04782 class047822, E e, long l) {
        return true;
    }
}

