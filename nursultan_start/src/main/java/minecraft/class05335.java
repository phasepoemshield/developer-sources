/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class05679
 *  minecraft.class06276
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import java.util.Optional;
import minecraft.class01894;
import minecraft.class05679;
import minecraft.class06276;

final class class05335
extends Record {
    private final Optional<class05679> profile;
    private final Optional<Map<class01894, class06276>> custom;
    private static final Codec<Map<class01894, class06276>> u = Codec.unboundedMap((Codec)class01894.N, (Codec)class06276.field_61596);
    public static final Codec<class05335> N = RecordCodecBuilder.create(instance -> instance.group((App)class05679.field_61601.optionalFieldOf("profile").forGetter(class05335::N), (App)u.optionalFieldOf("custom").forGetter(class05335::y)).apply(instance, class05335::new));

    class05335(Optional<class05679> optional, Optional<Map<class01894, class06276>> optional2) {
        this.profile = optional;
        this.custom = optional2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05335.class, "profile;custom", "profile", "custom"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05335.class, "profile;custom", "profile", "custom"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05335.class, "profile;custom", "profile", "custom"}, this);
    }

    public Optional<Map<class01894, class06276>> y() {
        return this.custom;
    }

    public Optional<class05679> N() {
        return this.profile;
    }
}

