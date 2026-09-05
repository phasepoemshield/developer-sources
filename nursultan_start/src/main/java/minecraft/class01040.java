/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01276
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01276;
import org.jspecify.annotations.Nullable;

public final class class01040
extends Record {
    private final @Nullable String logPath;
    private final class01276 variant;

    public class01276 L() {
        return this.variant;
    }

    public class01040(@Nullable String string, class01276 class012762) {
        this.logPath = string;
        this.variant = class012762;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01040.class, "logPath;variant", "logPath", "variant"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01040.class, "logPath;variant", "logPath", "variant"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01040.class, "logPath;variant", "logPath", "variant"}, this);
    }

    public @Nullable String y() {
        return this.logPath;
    }

    public boolean N() {
        return this.variant.N();
    }
}

