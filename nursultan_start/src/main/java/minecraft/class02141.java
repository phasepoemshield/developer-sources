/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  minecraft.class01312
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04911
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class05765
 *  minecraft.class07049
 *  minecraft.class07079
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import minecraft.class01312;
import minecraft.class02135;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04911;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class05765;
import minecraft.class07049;
import minecraft.class07079;

public class class02141
extends class05765<class07079> {
    public static final int N = 100;
    private final class02135 y;
    private final class04891 L;

    protected void y(class04782 class047822, class07079 class070792, long l) {
        if (class070792.method_24828()) {
            class070792.method_18799(class070792.method_18798().u((double)0.1f, 1.0, (double)0.1f));
            class047822.method_43129(null, (class07049)class070792, this.L, class04911.field_15254, 2.0f, 1.0f);
        }
        class070792.method_35054(false);
        class070792.method_18380(class01312.field_18076);
        class070792.method_18868().y(class05378.C);
        class070792.method_18868().N(class05378.f, (Object)this.y.N(class047822.field_9229));
    }

    public class02141(class02135 class021352, class04891 class048912) {
        super((Map)ImmutableMap.of((Object)class05378.P, (Object)class05367.field_18458, (Object)class05378.C, (Object)class05367.field_18456), 100);
        this.y = class021352;
        this.L = class048912;
    }

    protected void u(class04782 class047822, class07079 class070792, long l) {
        class070792.method_35054(true);
        class070792.method_18380(class01312.field_30095);
    }

    protected boolean N(class04782 class047822, class07079 class070792, long l) {
        return !class070792.method_24828();
    }
}

