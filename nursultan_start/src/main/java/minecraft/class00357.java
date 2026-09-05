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
 *  minecraft.class03360
 *  minecraft.class05911
 *  minecraft.class06563
 *  minecraft.class07211
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
import minecraft.class00337;
import minecraft.class00368;
import minecraft.class01894;
import minecraft.class03360;
import minecraft.class05911;
import minecraft.class06563;
import minecraft.class07211;

public final class class00357
extends Record
implements class00335 {
    private final class01894 texture;
    private final float openness;
    private final class07211 orientation;
    public static final MapCodec<class00357> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class01894.N.fieldOf("texture").forGetter(class00357::y), (App)Codec.FLOAT.optionalFieldOf("openness", (Object)Float.valueOf(0.0f)).forGetter(class00357::L), (App)class07211.field_29502.optionalFieldOf("orientation", (Object)class07211.field_11036).forGetter(class00357::u)).apply(instance, class00357::new));

    public float L() {
        return this.openness;
    }

    public class00357(class01894 class018942, float f, class07211 class072112) {
        this.texture = class018942;
        this.openness = f;
        this.orientation = class072112;
    }

    public class00357(class06563 class065632) {
        this(class05911.i((class06563)class065632), 0.0f, class07211.field_11036);
    }

    public class00357() {
        this(class01894.y((String)"shulker"), 0.0f, class07211.field_11036);
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00357.class, "texture;openness;orientation", "texture", "openness", "orientation"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00357.class, "texture;openness;orientation", "texture", "openness", "orientation"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00357.class, "texture;openness;orientation", "texture", "openness", "orientation"}, this);
    }

    public class07211 u() {
        return this.orientation;
    }

    public class01894 y() {
        return this.texture;
    }

    @Override
    public class00368<?> N(class00331 class003312) {
        return new class00337(new class03360(class003312), this.openness, this.orientation, class05911.n.N(this.texture));
    }

    public MapCodec<class00357> N() {
        return N;
    }
}

