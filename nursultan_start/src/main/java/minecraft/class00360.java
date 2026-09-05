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
 *  minecraft.class01894
 *  minecraft.class02443
 *  minecraft.class04802
 *  minecraft.class05911
 *  minecraft.class05913
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00331;
import minecraft.class00335;
import minecraft.class00344;
import minecraft.class00368;
import minecraft.class01894;
import minecraft.class02443;
import minecraft.class04802;
import minecraft.class05911;
import minecraft.class05913;

public final class class00360
extends Record
implements class00335 {
    private final class01894 texture;
    private final float openness;
    public static final MapCodec<class00360> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class01894.N.fieldOf("texture").forGetter(class00360::y), (App)Codec.FLOAT.optionalFieldOf("openness", (Object)Float.valueOf(0.0f)).forGetter(class00360::L)).apply(instance, class00360::new));

    public float L() {
        return this.openness;
    }

    public class00360(class01894 class018942) {
        this(class018942, 0.0f);
    }

    public class00360(class01894 class018942, float f) {
        this.texture = class018942;
        this.openness = f;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00360.class, "texture;openness", "texture", "openness"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00360.class, "texture;openness", "texture", "openness"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00360.class, "texture;openness", "texture", "openness"}, this);
    }

    public class01894 y() {
        return this.texture;
    }

    @Override
    public class00368<?> N(class00331 class003312) {
        class02443 class024432 = new class02443(class003312.y().N(class04802.D));
        class05913 class059132 = class05911.b.N(this.texture);
        return new class00344(class003312.L(), class024432, class059132, this.openness);
    }

    public MapCodec<class00360> N() {
        return N;
    }
}

