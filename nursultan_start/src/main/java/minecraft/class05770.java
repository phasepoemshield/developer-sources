/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  minecraft.class04782
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class07079
 *  minecraft.class07438
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import minecraft.class04782;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class05765;
import minecraft.class07079;
import minecraft.class07438;

public class class05770
extends class05765<class07079> {
    @Override
    protected void L(class04782 class047822, class07079 class070792, long l) {
        class070792.method_18868().L(class05378.P).ifPresent(class057792 -> class070792.p().N(class057792.N()));
    }

    public class05770(int n, int n2) {
        super((Map<class05378<?>, class05367>)ImmutableMap.of((Object)class05378.P, (Object)class05367.field_18456), n, n2);
    }

    @Override
    protected void y(class04782 class047822, class07079 class070792, long l) {
        class070792.method_18868().y(class05378.P);
    }

    @Override
    protected boolean N(class04782 class047822, class07079 class070792, long l) {
        return class070792.method_18868().L(class05378.P).filter(class057792 -> class057792.N((class07438)class070792)).isPresent();
    }
}

