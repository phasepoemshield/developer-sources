/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class06069
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01894;
import minecraft.class02320;
import minecraft.class02339;
import minecraft.class06069;

final class class02330
extends Record
implements class02339 {
    private final int extraRounds;
    private final float probability;
    private static final Codec<class02330> u = RecordCodecBuilder.create(instance -> instance.group((App)Codec.INT.fieldOf("extra").forGetter(class02330::y), (App)Codec.FLOAT.fieldOf("probability").forGetter(class02330::L)).apply(instance, class02330::new));
    public static final class02320 N = new class02320(class01894.y((String)"binomial_with_bonus_count"), u);

    public float L() {
        return this.probability;
    }

    class02330(int n, float f) {
        this.extraRounds = n;
        this.probability = f;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02330.class, "extraRounds;probability", "extraRounds", "probability"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02330.class, "extraRounds;probability", "extraRounds", "probability"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02330.class, "extraRounds;probability", "extraRounds", "probability"}, this);
    }

    public int y() {
        return this.extraRounds;
    }

    @Override
    public class02320 N() {
        return N;
    }

    @Override
    public int N(class06069 class060692, int n, int n2) {
        for (int i = 0; i < n2 + this.extraRounds; ++i) {
            if (!(class060692.z() < this.probability)) continue;
            ++n;
        }
        return n;
    }
}

