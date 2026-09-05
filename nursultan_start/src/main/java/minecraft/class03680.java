/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06366
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.BooleanSupplier;
import minecraft.class06366;
import org.jspecify.annotations.Nullable;

final class class03680
extends Record {
    private final class06366<Boolean> button;
    private final BooleanSupplier stateSupplier;
    private final @Nullable BooleanSupplier isActiveCondition;

    public BooleanSupplier L() {
        return this.stateSupplier;
    }

    class03680(class06366<Boolean> class063662, BooleanSupplier booleanSupplier, @Nullable BooleanSupplier booleanSupplier2) {
        this.button = class063662;
        this.stateSupplier = booleanSupplier;
        this.isActiveCondition = booleanSupplier2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03680.class, "button;stateSupplier;isActiveCondition", "button", "stateSupplier", "isActiveCondition"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03680.class, "button;stateSupplier;isActiveCondition", "button", "stateSupplier", "isActiveCondition"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03680.class, "button;stateSupplier;isActiveCondition", "button", "stateSupplier", "isActiveCondition"}, this);
    }

    public @Nullable BooleanSupplier u() {
        return this.isActiveCondition;
    }

    public class06366<Boolean> y() {
        return this.button;
    }

    public void N() {
        this.button.N((Object)this.stateSupplier.getAsBoolean());
        if (this.isActiveCondition != null) {
            this.button.field_22763 = this.isActiveCondition.getAsBoolean();
        }
    }
}

