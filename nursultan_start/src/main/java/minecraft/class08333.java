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

public final class class08333
extends Record
implements class04480 {
    private final DataResult.Error<?> error;

    public class08333(DataResult.Error<?> error) {
        this.error = error;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08333.class, "error", "error"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08333.class, "error", "error"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08333.class, "error", "error"}, this);
    }

    public DataResult.Error<?> y() {
        return this.error;
    }

    public String N() {
        return "Failed to decode from map: " + this.error.message();
    }
}

