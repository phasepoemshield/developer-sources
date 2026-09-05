/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00751
 *  minecraft.class05946
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import minecraft.class00751;
import minecraft.class05946;
import minecraft.class08249;
import minecraft.class08269;
import minecraft.class08271;

final class class08267
extends Record {
    private final Map<class05946<? extends class00751<?>>, class08269> registries;
    private final Map<String, class08249> others;
    public static final Codec<class08267> N = RecordCodecBuilder.create(instance -> instance.group((App)Codec.unboundedMap(class08271.N, class08269.y).fieldOf("registries").forGetter(class08267::N), (App)Codec.unboundedMap((Codec)Codec.STRING, class08249.N).fieldOf("others").forGetter(class08267::y)).apply(instance, class08267::new));

    class08267(Map<class05946<? extends class00751<?>>, class08269> map, Map<String, class08249> map2) {
        this.registries = map;
        this.others = map2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08267.class, "registries;others", "registries", "others"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08267.class, "registries;others", "registries", "others"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08267.class, "registries;others", "registries", "others"}, this);
    }

    public Map<String, class08249> y() {
        return this.others;
    }

    public Map<class05946<? extends class00751<?>>, class08269> N() {
        return this.registries;
    }
}

