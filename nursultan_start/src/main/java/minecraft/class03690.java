/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class03556
 *  minecraft.class04382
 *  minecraft.class05964
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00392;
import minecraft.class03556;
import minecraft.class04382;
import minecraft.class05964;
import org.jspecify.annotations.Nullable;

public final class class03690
extends Record {
    private final @Nullable class03556<class04382> preset;
    private static final class00392 y = class00392.L((String)"generator.custom");

    public @Nullable class03556<class04382> L() {
        return this.preset;
    }

    public class03690(@Nullable class03556<class04382> class035562) {
        this.preset = class035562;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03690.class, "preset", "preset"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03690.class, "preset", "preset"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03690.class, "preset", "preset"}, this);
    }

    public boolean y() {
        return Optional.ofNullable(this.preset).flatMap(class03556::i).filter(class059462 -> class059462.equals(class05964.u)).isPresent();
    }

    public class00392 N() {
        return Optional.ofNullable(this.preset).flatMap(class03556::i).map(class059462 -> class00392.L((String)class059462.N().B("generator"))).orElse(y);
    }
}

