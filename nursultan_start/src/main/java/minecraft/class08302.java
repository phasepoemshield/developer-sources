/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00050
 *  minecraft.class00082
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00050;
import minecraft.class00082;
import org.jspecify.annotations.Nullable;

public final class class08302
extends Record {
    final class00050 preference;
    private final @Nullable class00082 region;

    public class08302(class00050 class000502, @Nullable class00082 class000822) {
        this.preference = class000502;
        this.region = class000822;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08302.class, "preference;region", "preference", "region"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08302.class, "preference;region", "preference", "region"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08302.class, "preference;region", "preference", "region"}, this);
    }

    public @Nullable class00082 y() {
        return this.region;
    }

    public class00050 N() {
        return this.preference;
    }
}

