/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  minecraft.class01231
 *  minecraft.class04782
 *  minecraft.class05367
 *  minecraft.class05378
 *  minecraft.class07079
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import minecraft.class01231;
import minecraft.class04782;
import minecraft.class05367;
import minecraft.class05378;
import minecraft.class05765;
import minecraft.class07079;

public class class05739<T extends class07079>
extends class05765<T> {
    private final float N;

    public class05739(float f) {
        super((Map<class05378<?>, class05367>)ImmutableMap.of());
        this.N = f;
    }

    @Override
    protected void L(class04782 class047822, class07079 class070792, long l) {
        if (class070792.method_59922().z() < this.N) {
            class070792.A().y();
        }
    }

    @Override
    protected boolean N(class04782 class047822, class07079 class070792) {
        return class05739.N(class070792);
    }

    public static <T extends class07079> boolean N(T t) {
        return t.method_5799() && t.method_5861(class01231.N) > t.method_29241() || t.method_5771();
    }

    @Override
    protected boolean N(class04782 class047822, class07079 class070792, long l) {
        return this.N(class047822, class070792);
    }
}

