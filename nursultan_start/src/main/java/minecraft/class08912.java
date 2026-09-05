/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class08895
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Comparator;
import minecraft.class08895;
import minecraft.class08913;

public final class class08912
extends Record {
    final float threshold;
    final class08895 model;
    public static final Codec<class08912> L = RecordCodecBuilder.create(instance -> instance.group((App)Codec.FLOAT.fieldOf("threshold").forGetter(class08912::N), (App)class08913.y.fieldOf("model").forGetter(class08912::y)).apply(instance, class08912::new));
    public static final Comparator<class08912> u = Comparator.comparingDouble(class08912::N);

    public class08912(float f, class08895 class088952) {
        this.threshold = f;
        this.model = class088952;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08912.class, "threshold;model", "threshold", "model"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08912.class, "threshold;model", "threshold", "model"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08912.class, "threshold;model", "threshold", "model"}, this);
    }

    public class08895 y() {
        return this.model;
    }

    public float N() {
        return this.threshold;
    }
}

