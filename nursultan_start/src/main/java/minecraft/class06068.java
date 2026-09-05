/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03055
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Objects;
import minecraft.class03055;
import org.jspecify.annotations.Nullable;

public final class class06068
extends Record {
    private final String raw;
    private final class03055 mask;
    public static final class06068 N = class06068.N("");

    public boolean L() {
        return !this.mask.N();
    }

    public class06068(String string, class03055 class030552) {
        this.raw = string;
        this.mask = class030552;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06068.class, "raw;mask", "raw", "mask"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06068.class, "raw;mask", "raw", "mask"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06068.class, "raw;mask", "raw", "mask"}, this);
    }

    public class03055 i() {
        return this.mask;
    }

    public String u() {
        return this.raw;
    }

    public static class06068 y(String string) {
        return new class06068(string, class03055.y);
    }

    public String y() {
        return Objects.requireNonNullElse(this.N(), "");
    }

    public @Nullable String N() {
        return this.mask.N(this.raw);
    }

    public static class06068 N(String string) {
        return new class06068(string, class03055.L);
    }
}

