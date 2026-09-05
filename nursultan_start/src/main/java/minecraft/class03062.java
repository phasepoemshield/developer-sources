/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04469
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.BooleanSupplier;
import minecraft.class04469;
import org.jspecify.annotations.Nullable;

final class class03062
extends Record {
    private final @Nullable class04469 signature;
    private final BooleanSupplier handler;

    public BooleanSupplier L() {
        return this.handler;
    }

    class03062(@Nullable class04469 class044692, BooleanSupplier booleanSupplier) {
        this.signature = class044692;
        this.handler = booleanSupplier;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03062.class, "signature;handler", "signature", "handler"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03062.class, "signature;handler", "signature", "handler"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03062.class, "signature;handler", "signature", "handler"}, this);
    }

    public @Nullable class04469 y() {
        return this.signature;
    }

    public boolean N() {
        return this.handler.getAsBoolean();
    }
}

