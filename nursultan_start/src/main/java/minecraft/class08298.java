/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.DataResult$Error
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04480
 */
package minecraft;

import com.mojang.serialization.DataResult;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class04480;

public final class class08298
extends Record
implements class04480 {
    private final Object value;
    private final DataResult.Error<?> error;

    public DataResult.Error<?> L() {
        return this.error;
    }

    public class08298(Object object, DataResult.Error<?> error) {
        this.value = object;
        this.error = error;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08298.class, "value;error", "value", "error"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08298.class, "value;error", "value", "error"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08298.class, "value;error", "value", "error"}, this);
    }

    public Object y() {
        return this.value;
    }

    public String N() {
        return "Failed to merge value '" + String.valueOf(this.value) + "' to an object: " + this.error.message();
    }
}

