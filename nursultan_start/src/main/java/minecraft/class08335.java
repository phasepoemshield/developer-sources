/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.DataResult$Error
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04480
 *  minecraft.class07709
 */
package minecraft;

import com.mojang.serialization.DataResult;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class04480;
import minecraft.class07709;

public final class class08335
extends Record
implements class04480 {
    private final String name;
    private final class07709 tag;
    private final DataResult.Error<?> error;

    public class07709 L() {
        return this.tag;
    }

    public class08335(String string, class07709 class077092, DataResult.Error<?> error) {
        this.name = string;
        this.tag = class077092;
        this.error = error;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08335.class, "name;tag;error", "name", "tag", "error"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08335.class, "name;tag;error", "name", "tag", "error"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08335.class, "name;tag;error", "name", "tag", "error"}, this);
    }

    public DataResult.Error<?> u() {
        return this.error;
    }

    public String y() {
        return this.name;
    }

    public String N() {
        return "Failed to decode value '" + String.valueOf(this.tag) + "' from field '" + this.name + "': " + this.error.message();
    }
}

