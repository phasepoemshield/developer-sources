/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class03556
 *  minecraft.class04247
 *  minecraft.class07055
 *  minecraft.class07084
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class03556;
import minecraft.class04247;
import minecraft.class07055;
import minecraft.class07084;

public final class class02679
extends Record {
    private final class03556<class07084> effect;
    private final int duration;
    public static final Codec<class02679> N = RecordCodecBuilder.create(instance -> instance.group((App)class07084.N.fieldOf("id").forGetter(class02679::y), (App)Codec.INT.lenientOptionalFieldOf("duration", (Object)160).forGetter(class02679::L)).apply(instance, class02679::new));
    public static final class02362<class04247, class02679> y = class02362.N((class02362)class07084.y, class02679::y, (class02362)class02389.B, class02679::L, class02679::new);

    public int L() {
        return this.duration;
    }

    public class02679(class03556<class07084> class035562, int n) {
        this.effect = class035562;
        this.duration = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02679.class, "effect;duration", "effect", "duration"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02679.class, "effect;duration", "effect", "duration"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02679.class, "effect;duration", "effect", "duration"}, this);
    }

    public class03556<class07084> y() {
        return this.effect;
    }

    public class07055 N() {
        return new class07055(this.effect, this.duration);
    }
}

