/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06338
 *  minecraft.class08895
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class06338;
import minecraft.class08895;
import minecraft.class08913;

public final class class08940<T>
extends Record {
    final List<T> values;
    final class08895 model;

    public class08940(List<T> list, class08895 class088952) {
        this.values = list;
        this.model = class088952;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08940.class, "values;model", "values", "model"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08940.class, "values;model", "values", "model"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08940.class, "values;model", "values", "model"}, this);
    }

    public class08895 y() {
        return this.model;
    }

    public List<T> N() {
        return this.values;
    }

    public static <T> Codec<class08940<T>> N(Codec<T> codec) {
        return RecordCodecBuilder.create(instance -> instance.group((App)class06338.y((Codec)class06338.N((Codec)codec)).fieldOf("when").forGetter(class08940::N), (App)class08913.y.fieldOf("model").forGetter(class08940::y)).apply((Applicative)instance, class08940::new));
    }
}

