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
 *  minecraft.class03448
 *  minecraft.class06572
 *  minecraft.class06584
 *  minecraft.class07438
 *  minecraft.class08961
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03448;
import minecraft.class06572;
import minecraft.class06584;
import minecraft.class07438;
import minecraft.class08961;
import org.jspecify.annotations.Nullable;

public final class class00334
extends Record
implements class06572 {
    private final boolean remaining;
    public static final MapCodec<class00334> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.BOOL.optionalFieldOf("remaining", (Object)false).forGetter(class00334::y)).apply(instance, class00334::new));

    public class00334(boolean bl) {
        this.remaining = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00334.class, "remaining", "remaining"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00334.class, "remaining", "remaining"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00334.class, "remaining", "remaining"}, this);
    }

    public boolean y() {
        return this.remaining;
    }

    public MapCodec<class00334> N() {
        return N;
    }

    public float N(class06584 class065842, @Nullable class03448 class034482, @Nullable class08961 class089612, int n) {
        class07438 class074382;
        class07438 class074383 = class074382 = class089612 == null ? null : class089612.method_72393();
        if (class074382 == null || class074382.method_6030() != class065842) {
            return 0.0f;
        }
        return this.remaining ? (float)class074382.method_6014() : (float)class00334.N(class065842, class074382);
    }

    public static int N(class06584 class065842, class07438 class074382) {
        return class065842.N(class074382) - class074382.method_6014();
    }
}

