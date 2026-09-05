/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04192
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class04192;
import minecraft.class07072;
import org.jspecify.annotations.Nullable;

public final class class07066
extends Record {
    private final class07072 source;
    private final float damage;
    private final @Nullable class04192 fallLocation;
    private final float fallDistance;

    public @Nullable class04192 L() {
        return this.fallLocation;
    }

    public class07066(class07072 class070722, float f, @Nullable class04192 class041922, float f2) {
        this.source = class070722;
        this.damage = f;
        this.fallLocation = class041922;
        this.fallDistance = f2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07066.class, "source;damage;fallLocation;fallDistance", "source", "damage", "fallLocation", "fallDistance"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07066.class, "source;damage;fallLocation;fallDistance", "source", "damage", "fallLocation", "fallDistance"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07066.class, "source;damage;fallLocation;fallDistance", "source", "damage", "fallLocation", "fallDistance"}, this);
    }

    public float u() {
        return this.fallDistance;
    }

    public float y() {
        return this.damage;
    }

    public class07072 N() {
        return this.source;
    }
}

