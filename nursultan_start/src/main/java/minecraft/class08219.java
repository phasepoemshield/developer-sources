/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03622
 *  minecraft.class03631
 *  minecraft.class04782
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07881
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class03622;
import minecraft.class03631;
import minecraft.class04782;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07881;
import org.jspecify.annotations.Nullable;

public final class class08219
extends Record
implements class03622 {
    private final Optional<Boolean> sheared;
    public static final MapCodec<class08219> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.BOOL.optionalFieldOf("sheared").forGetter(class08219::L)).apply(instance, class08219::new));

    public Optional<Boolean> L() {
        return this.sheared;
    }

    public class08219(Optional<Boolean> optional) {
        this.sheared = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08219.class, "sheared", "sheared"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08219.class, "sheared", "sheared"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08219.class, "sheared", "sheared"}, this);
    }

    public static class08219 y() {
        return new class08219(Optional.of(false));
    }

    public boolean N(class07049 class070492, class04782 class047822, @Nullable class06889 class068892) {
        if (class070492 instanceof class07881) {
            class07881 class078812 = (class07881)class070492;
            return !this.sheared.isPresent() || class078812.m() == this.sheared.get().booleanValue();
        }
        return false;
    }

    public MapCodec<class08219> N() {
        return class03631.R;
    }
}

