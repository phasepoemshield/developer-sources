/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class class00601
extends Record {
    private final float value;
    private final float alpha;
    private static final Codec<class00601> u = RecordCodecBuilder.create(instance -> instance.group((App)Codec.FLOAT.fieldOf("value").forGetter(class00601::N), (App)Codec.floatRange((float)0.0f, (float)1.0f).optionalFieldOf("alpha", (Object)Float.valueOf(1.0f)).forGetter(class00601::y)).apply(instance, class00601::new));
    public static final Codec<class00601> N = Codec.either((Codec)Codec.FLOAT, u).xmap(either -> (class00601)((Object)((Object)either.map(class00601::new, class006012 -> class006012))), class006012 -> class006012.y() == 1.0f ? Either.left((Object)Float.valueOf(class006012.N())) : Either.right((Object)class006012));

    public class00601(float f) {
        this(f, 1.0f);
    }

    public class00601(float f, float f2) {
        this.value = f;
        this.alpha = f2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00601.class, "value;alpha", "value", "alpha"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00601.class, "value;alpha", "value", "alpha"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00601.class, "value;alpha", "value", "alpha"}, this);
    }

    public float y() {
        return this.alpha;
    }

    public float N() {
        return this.value;
    }
}

