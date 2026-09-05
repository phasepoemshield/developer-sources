/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00203
 *  minecraft.class08906
 *  minecraft.class08913
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00203;
import minecraft.class08895;
import minecraft.class08906;
import minecraft.class08913;
import org.jspecify.annotations.Nullable;

public final class class08839
extends Record {
    private final class08895 model;
    private final class08906 properties;
    private final @Nullable class00203 registrySwapper;
    public static final Codec<class08839> N = RecordCodecBuilder.create(instance -> instance.group((App)class08913.y.fieldOf("model").forGetter(class08839::N), (App)class08906.y.forGetter(class08839::y)).apply(instance, class08839::new));

    public @Nullable class00203 L() {
        return this.registrySwapper;
    }

    public class08839(class08895 class088952, class08906 class089062) {
        this(class088952, class089062, null);
    }

    public class08839(class08895 class088952, class08906 class089062, @Nullable class00203 class002032) {
        this.model = class088952;
        this.properties = class089062;
        this.registrySwapper = class002032;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08839.class, "model;properties;registrySwapper", "model", "properties", "registrySwapper"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08839.class, "model;properties;registrySwapper", "model", "properties", "registrySwapper"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08839.class, "model;properties;registrySwapper", "model", "properties", "registrySwapper"}, this);
    }

    public class08906 y() {
        return this.properties;
    }

    public class08895 N() {
        return this.model;
    }

    public class08839 N(class00203 class002032) {
        return new class08839(this.model, this.properties, class002032);
    }
}

