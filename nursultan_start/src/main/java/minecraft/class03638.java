/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00836
 *  minecraft.class03622
 *  minecraft.class04782
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07162
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00836;
import minecraft.class03622;
import minecraft.class03631;
import minecraft.class04782;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07162;
import org.jspecify.annotations.Nullable;

public final class class03638
extends Record
implements class03622 {
    private final class00836 size;
    public static final MapCodec<class03638> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class00836.u.optionalFieldOf("size", (Object)class00836.L).forGetter(class03638::y)).apply(instance, class03638::new));

    public class03638(class00836 class008362) {
        this.size = class008362;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03638.class, "size", "size"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03638.class, "size", "size"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03638.class, "size", "size"}, this);
    }

    public class00836 y() {
        return this.size;
    }

    public boolean N(class07049 class070492, class04782 class047822, @Nullable class06889 class068892) {
        if (class070492 instanceof class07162) {
            class07162 class071622 = (class07162)class070492;
            return this.size.u(class071622.t());
        }
        return false;
    }

    public static class03638 N(class00836 class008362) {
        return new class03638(class008362);
    }

    public MapCodec<class03638> N() {
        return class03631.u;
    }
}

