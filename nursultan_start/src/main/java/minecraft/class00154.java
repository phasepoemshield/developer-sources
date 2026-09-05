/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00157;
import minecraft.class00162;
import org.jspecify.annotations.Nullable;

final class class00154
extends Record {
    final @Nullable class00162 signed;
    final @Nullable class00157 type;
    public static final class00154 L = new class00154(null, null);

    class00154(@Nullable class00162 class001622, @Nullable class00157 class001572) {
        this.signed = class001622;
        this.type = class001572;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00154.class, "signed;type", "signed", "type"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00154.class, "signed;type", "signed", "type"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00154.class, "signed;type", "signed", "type"}, this);
    }

    public @Nullable class00157 y() {
        return this.type;
    }

    public @Nullable class00162 N() {
        return this.signed;
    }
}

