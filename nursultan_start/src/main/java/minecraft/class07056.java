/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06584
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class06584;
import org.jspecify.annotations.Nullable;

public final class class07056
extends Record {
    final boolean wasItemInteraction;
    final @Nullable class06584 heldItemTransformedTo;
    static class07056 L = new class07056(false, null);
    static class07056 u = new class07056(true, null);

    public class07056(boolean bl, @Nullable class06584 class065842) {
        this.wasItemInteraction = bl;
        this.heldItemTransformedTo = class065842;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07056.class, "wasItemInteraction;heldItemTransformedTo", "wasItemInteraction", "heldItemTransformedTo"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07056.class, "wasItemInteraction;heldItemTransformedTo", "wasItemInteraction", "heldItemTransformedTo"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07056.class, "wasItemInteraction;heldItemTransformedTo", "wasItemInteraction", "heldItemTransformedTo"}, this);
    }

    public @Nullable class06584 y() {
        return this.heldItemTransformedTo;
    }

    public boolean N() {
        return this.wasItemInteraction;
    }
}

