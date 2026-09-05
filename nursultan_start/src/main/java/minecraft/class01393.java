/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00836
 *  minecraft.class04782
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00836;
import minecraft.class04782;
import minecraft.class07209;

public final class class01393
extends Record {
    private final class00836 composite;
    public static final Codec<class01393> N = RecordCodecBuilder.create(instance -> instance.group((App)class00836.u.optionalFieldOf("light", (Object)class00836.L).forGetter(class01393::N)).apply(instance, class01393::new));

    public class01393(class00836 class008362) {
        this.composite = class008362;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01393.class, "composite", "composite"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01393.class, "composite", "composite"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01393.class, "composite", "composite"}, this);
    }

    public class00836 N() {
        return this.composite;
    }

    public boolean N(class04782 class047822, class07209 class072092) {
        if (!class047822.method_8477(class072092)) {
            return false;
        }
        return this.composite.u(class047822.U(class072092));
    }
}

