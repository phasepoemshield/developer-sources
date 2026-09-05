/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class03357
 *  minecraft.class05911
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
import minecraft.class00353;
import minecraft.class00368;
import minecraft.class01894;
import minecraft.class03357;
import minecraft.class05911;
import minecraft.class06563;

public final class class00346
extends Record
implements class00335 {
    private final class01894 texture;
    public static final MapCodec<class00346> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class01894.N.fieldOf("texture").forGetter(class00346::y)).apply(instance, class00346::new));

    public class00346(class06563 class065632) {
        this(class05911.y((class06563)class065632));
    }

    public class00346(class01894 class018942) {
        this.texture = class018942;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00346.class, "texture", "texture"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00346.class, "texture", "texture"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00346.class, "texture", "texture"}, this);
    }

    public class01894 y() {
        return this.texture;
    }

    @Override
    public class00368<?> N(class00331 class003312) {
        return new class00353(new class03357(class003312), class05911.v.N(this.texture));
    }

    public MapCodec<class00346> N() {
        return N;
    }
}

