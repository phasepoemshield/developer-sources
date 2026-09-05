/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02546
 *  minecraft.class06069
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02536;
import minecraft.class02546;
import minecraft.class06069;

public final class class02521
extends Record
implements class02536 {
    private final class02546 chance;
    public static final MapCodec<class02521> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class02546.y.fieldOf("chance").forGetter(class02521::y)).apply(instance, class02521::new));

    public class02521(class02546 class025462) {
        this.chance = class025462;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02521.class, "chance", "chance"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02521.class, "chance", "chance"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02521.class, "chance", "chance"}, this);
    }

    public class02546 y() {
        return this.chance;
    }

    public MapCodec<class02521> N() {
        return N;
    }

    @Override
    public float N(int n, class06069 class060692, float f) {
        float f2 = this.chance.N(n);
        int n2 = 0;
        if (f <= 128.0f || f * f2 < 20.0f || f * (1.0f - f2) < 20.0f) {
            int n3 = 0;
            while ((float)n3 < f) {
                if (class060692.z() < f2) {
                    ++n2;
                }
                ++n3;
            }
        } else {
            double d = Math.floor(f * f2);
            double d2 = Math.sqrt(f * f2 * (1.0f - f2));
            n2 = (int)Math.round(d + class060692.E() * d2);
            n2 = Math.clamp((long)n2, (int)0, (int)((int)f));
        }
        return f - (float)n2;
    }
}

