/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class class00614
extends Record {
    final float brightness;
    final float factor;
    public static final Codec<class00614> L = RecordCodecBuilder.create(instance -> instance.group((App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("brightness").forGetter(class00614::N), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("factor").forGetter(class00614::y)).apply(instance, class00614::new));

    public class00614(float f, float f2) {
        this.brightness = f;
        this.factor = f2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00614.class, "brightness;factor", "brightness", "factor"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00614.class, "brightness;factor", "brightness", "factor"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00614.class, "brightness;factor", "brightness", "factor"}, this);
    }

    public float y() {
        return this.factor;
    }

    public float N() {
        return this.brightness;
    }
}

