/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06338
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Map;
import minecraft.class06338;
import minecraft.class08704;
import minecraft.class08706;
import minecraft.class08719;

public final class class08732
extends Record {
    private final Map<class08719, List<class08706>> layers;
    private static final Codec<List<class08706>> L = class06338.y((Codec)class08706.N.listOf());
    public static final Codec<class08732> N = RecordCodecBuilder.create(instance -> instance.group((App)class06338.u((Codec)Codec.unboundedMap(class08719.field_54131, L)).fieldOf("layers").forGetter(class08732::y)).apply(instance, class08732::new));

    public class08732(Map<class08719, List<class08706>> map) {
        this.layers = map;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08732.class, "layers", "layers"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08732.class, "layers", "layers"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08732.class, "layers", "layers"}, this);
    }

    public Map<class08719, List<class08706>> y() {
        return this.layers;
    }

    public List<class08706> N(class08719 class087192) {
        return this.layers.getOrDefault((Object)class087192, List.of());
    }

    public static class08704 N() {
        return new class08704();
    }
}

