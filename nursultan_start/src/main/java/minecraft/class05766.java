/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  minecraft.class01289
 *  minecraft.class04782
 *  minecraft.class05352
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class07049
 *  minecraft.class08036
 *  minecraft.class08041
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import minecraft.class01289;
import minecraft.class04782;
import minecraft.class05352;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class05751;
import minecraft.class05765;
import minecraft.class05779;
import minecraft.class07049;
import minecraft.class08036;
import minecraft.class08041;

public class class05766
extends class05765<class08041> {
    private final float N;

    @Override
    protected void L(class04782 class047822, class08041 class080412, long l) {
        class01289 var5 = class080412.method_18868();
        var5.y(class05378.m);
        var5.y(class05378.P);
    }

    public class05766(float f) {
        super((Map<class05378<?>, class05367>)ImmutableMap.of((Object)class05378.m, (Object)class05367.field_18458, (Object)class05378.P, (Object)class05367.field_18458), Integer.MAX_VALUE);
        this.N = f;
    }

    @Override
    protected void u(class04782 class047822, class08041 class080412, long l) {
        this.N(class080412);
    }

    @Override
    protected void y(class04782 class047822, class08041 class080412, long l) {
        this.N(class080412);
    }

    @Override
    protected boolean N(class04782 class047822, class08041 class080412) {
        class08036 class080362 = class080412.N();
        return class080412.method_5805() && class080362 != null && !class080412.method_5799() && !class080412.field_6037 && class080412.method_5858((class07049)class080362) <= 16.0;
    }

    @Override
    protected boolean N(long l) {
        return false;
    }

    private void N(class08041 class080412) {
        class01289 var2 = class080412.method_18868();
        var2.N(class05378.m, (Object)new class05352((class05779)new class05751((class07049)class080412.N(), false), this.N, 2));
        var2.N(class05378.P, (Object)new class05751((class07049)class080412.N(), true));
    }

    @Override
    protected boolean N(class04782 class047822, class08041 class080412, long l) {
        return this.N(class047822, class080412);
    }
}

