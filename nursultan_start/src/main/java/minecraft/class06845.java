/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class08188
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Supplier;
import minecraft.class01894;
import minecraft.class08188;
import org.jspecify.annotations.Nullable;

final class class06845
extends Record {
    final class01894 location;
    private final Supplier<@Nullable class08188> sampler;

    class06845(class01894 class018942, Supplier<@Nullable class08188> supplier) {
        this.location = class018942;
        this.sampler = supplier;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06845.class, "location;sampler", "location", "sampler"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06845.class, "location;sampler", "location", "sampler"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06845.class, "location;sampler", "location", "sampler"}, this);
    }

    public Supplier<@Nullable class08188> y() {
        return this.sampler;
    }

    public class01894 N() {
        return this.location;
    }
}

