/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.RecordBuilder
 *  minecraft.class01289
 *  minecraft.class01491
 *  minecraft.class04206
 *  minecraft.class05378
 */
package Nursultan;

import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.RecordBuilder;
import java.util.Optional;
import minecraft.class01289;
import minecraft.class01491;
import minecraft.class04206;
import minecraft.class05378;

public final class class10536<U> {
    private final class05378<U> N;
    private final Optional<? extends class01491<U>> y;

    class10536(class05378<U> class053782, Optional<? extends class01491<U>> optional) {
        this.N = class053782;
        this.y = optional;
    }

    public <T> void N(DynamicOps<T> dynamicOps, RecordBuilder<T> recordBuilder) {
        this.N.N().ifPresent(codec -> this.y.ifPresent(class014912 -> recordBuilder.add(class04206.k.T().encodeStart(dynamicOps, this.N), codec.encodeStart(dynamicOps, class014912))));
    }

    public void N(class01289<?> class012892) {
        class012892.y(this.N, this.y);
    }

    public static <U> class10536<U> N(class05378<U> class053782, Optional<? extends class01491<?>> optional) {
        return new class10536<U>(class053782, optional);
    }
}

