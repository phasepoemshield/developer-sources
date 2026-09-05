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
 *  minecraft.class02546
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02546;

public final class class02532
extends Record
implements class02546 {
    private final float base;
    private final float perLevelAboveFirst;
    public static final MapCodec<class02532> L = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.FLOAT.fieldOf("base").forGetter(class02532::y), (App)Codec.FLOAT.fieldOf("per_level_above_first").forGetter(class02532::L)).apply(instance, class02532::new));

    public float L() {
        return this.perLevelAboveFirst;
    }

    public class02532(float f, float f2) {
        this.base = f;
        this.perLevelAboveFirst = f2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02532.class, "base;perLevelAboveFirst", "base", "perLevelAboveFirst"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02532.class, "base;perLevelAboveFirst", "base", "perLevelAboveFirst"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02532.class, "base;perLevelAboveFirst", "base", "perLevelAboveFirst"}, this);
    }

    public float y() {
        return this.base;
    }

    public MapCodec<class02532> N() {
        return L;
    }

    public float N(int n) {
        return this.base + this.perLevelAboveFirst * (float)(n - 1);
    }
}

