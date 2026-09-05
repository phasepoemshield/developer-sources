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
 *  minecraft.class05908
 *  minecraft.class06339
 *  minecraft.class06341
 *  minecraft.class06378
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class05908;
import minecraft.class06339;
import minecraft.class06341;
import minecraft.class06378;

public final class class04711
extends Record
implements class06378 {
    private final float value;
    public static final MapCodec<class04711> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.FLOAT.fieldOf("value").forGetter(class04711::L)).apply(instance, class04711::new));
    public static final Codec<class04711> y = Codec.FLOAT.xmap(class04711::new, class04711::L);

    public float L() {
        return this.value;
    }

    public class04711(float f) {
        this.value = f;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || ((Object)((Object)this)).getClass() != object.getClass()) {
            return false;
        }
        return Float.compare(((class04711)((Object)object)).value, this.value) == 0;
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04711.class, "value", "value"}, this);
    }

    public int hashCode() {
        return this.value != 0.0f ? Float.floatToIntBits(this.value) : 0;
    }

    public float y(class05908 class059082) {
        return this.value;
    }

    public static class04711 N(float f) {
        return new class04711(f);
    }

    public class06341 N() {
        return class06339.y;
    }
}

