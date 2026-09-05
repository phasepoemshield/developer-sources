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
 *  minecraft.class04995
 *  minecraft.class06572
 *  minecraft.class06584
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
import minecraft.class04995;
import minecraft.class06572;
import minecraft.class06584;
import minecraft.class08961;
import org.jspecify.annotations.Nullable;

public final class class08942
extends Record
implements class06572 {
    private final boolean normalize;
    public static final MapCodec<class08942> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.BOOL.optionalFieldOf("normalize", (Object)true).forGetter(class08942::y)).apply(instance, class08942::new));

    public class08942(boolean bl) {
        this.normalize = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08942.class, "normalize", "normalize"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08942.class, "normalize", "normalize"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08942.class, "normalize", "normalize"}, this);
    }

    public boolean y() {
        return this.normalize;
    }

    public MapCodec<class08942> N() {
        return N;
    }

    public float N(class06584 class065842, @Nullable class03448 class034482, @Nullable class08961 class089612, int n) {
        float f = class065842.c();
        float f2 = class065842.U();
        if (this.normalize) {
            return class04995.N((float)(f / f2), (float)0.0f, (float)1.0f);
        }
        return class04995.N((float)f, (float)0.0f, (float)f2);
    }
}

