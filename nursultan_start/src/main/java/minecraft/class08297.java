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

public final class class08297
extends Record
implements class04480 {
    private final String name;
    private final Object value;
    private final DataResult.Error<?> error;

    public Object L() {
        return this.value;
    }

    public class08297(String string, Object object, DataResult.Error<?> error) {
        this.name = string;
        this.value = object;
        this.error = error;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08297.class, "name;value;error", "name", "value", "error"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08297.class, "name;value;error", "name", "value", "error"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08297.class, "name;value;error", "name", "value", "error"}, this);
    }

    public DataResult.Error<?> u() {
        return this.error;
    }

    public String y() {
        return this.name;
    }

    public String N() {
        return "Failed to append value '" + String.valueOf(this.value) + "' to list '" + this.name + "': " + this.error.message();
    }
}

