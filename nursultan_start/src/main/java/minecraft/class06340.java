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
 *  minecraft.class01766
 *  minecraft.class05908
 *  minecraft.class05919
 *  minecraft.class07491
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Set;
import minecraft.class01766;
import minecraft.class05908;
import minecraft.class05919;
import minecraft.class06332;
import minecraft.class06348;
import minecraft.class06353;
import minecraft.class07491;
import org.jspecify.annotations.Nullable;

public final class class06340
extends Record
implements class06348 {
    private final class05919 target;
    public static final MapCodec<class06340> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class05919.field_45792.fieldOf("target").forGetter(class06340::L)).apply(instance, class06340::new));
    public static final Codec<class06340> y = class05919.field_45792.xmap(class06340::new, class06340::L);

    public class05919 L() {
        return this.target;
    }

    public class06340(class05919 class059192) {
        this.target = class059192;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06340.class, "target", "target"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06340.class, "target", "target"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06340.class, "target", "target"}, this);
    }

    @Override
    public Set<class07491<?>> y() {
        return Set.of(this.target.N());
    }

    @Override
    public @Nullable class01766 N(class05908 class059082) {
        return (class01766)class059082.L(this.target.N());
    }

    public static class06348 N(class05919 class059192) {
        return new class06340(class059192);
    }

    @Override
    public class06353 N() {
        return class06332.L;
    }
}

