/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03571
 *  minecraft.class06563
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00331;
import minecraft.class00335;
import minecraft.class00368;
import minecraft.class00375;
import minecraft.class03571;
import minecraft.class06563;

public final class class00364
extends Record
implements class00335 {
    private final class06563 baseColor;
    public static final MapCodec<class00364> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06563.field_41600.fieldOf("color").forGetter(class00364::y)).apply(instance, class00364::new));

    public class00364(class06563 class065632) {
        this.baseColor = class065632;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00364.class, "baseColor", "baseColor"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00364.class, "baseColor", "baseColor"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00364.class, "baseColor", "baseColor"}, this);
    }

    public class06563 y() {
        return this.baseColor;
    }

    @Override
    public class00368<?> N(class00331 class003312) {
        return new class00375(this.baseColor, new class03571(class003312));
    }

    public MapCodec<class00364> N() {
        return N;
    }
}

