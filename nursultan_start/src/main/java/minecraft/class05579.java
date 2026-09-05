/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  minecraft.class01289
 *  minecraft.class04782
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class05538
 *  minecraft.class05765
 *  minecraft.class07047
 *  minecraft.class07055
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import minecraft.class01289;
import minecraft.class04782;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class05538;
import minecraft.class05765;
import minecraft.class07047;
import minecraft.class07055;

public class class05579
extends class05765<class05538> {
    public class05579() {
        super((Map)ImmutableMap.of((Object)class05378.X, (Object)class05367.field_18456, (Object)class05378.w, (Object)class05367.field_18456), 200);
    }

    protected void u(class04782 class047822, class05538 class055382, long l) {
        class01289 var5 = class055382.method_18868();
        var5.y(class05378.m);
        var5.y(class05378.P);
        class055382.method_6092(new class07055(class07047.z, 200, 0));
    }

    protected boolean N(class04782 class047822, class05538 class055382, long l) {
        return class055382.method_5799() && class055382.method_18868().N(class05378.X);
    }

    protected boolean N(class04782 class047822, class05538 class055382) {
        return class055382.method_5799();
    }
}

