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
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import minecraft.class07389;

public final class class07422
extends Record {
    private final Map<String, class07389<?>> schemas;
    public static final MapCodec<class07422> N = class07422.y();

    public class07422(Map<String, class07389<?>> map) {
        this.schemas = map;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07422.class, "schemas", "schemas"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07422.class, "schemas", "schemas"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07422.class, "schemas", "schemas"}, this);
    }

    private static MapCodec<class07422> y() {
        return RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.unboundedMap((Codec)Codec.STRING, class07389.N).fieldOf("schemas").forGetter(class07422::N)).apply(instance, class07422::new));
    }

    public Map<String, class07389<?>> N() {
        return this.schemas;
    }
}

