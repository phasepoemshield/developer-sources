/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class05216
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class01762;
import minecraft.class05216;
import org.jspecify.annotations.Nullable;

public final class class01772
extends Record {
    private final String owner;
    private final int value;
    private final @Nullable class00392 display;
    private final @Nullable class01762 numberFormatOverride;

    public String L() {
        return this.owner;
    }

    public class01772(String string, int n, @Nullable class00392 class003922, @Nullable class01762 class017622) {
        this.owner = string;
        this.value = n;
        this.display = class003922;
        this.numberFormatOverride = class017622;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01772.class, "owner;value;display;numberFormatOverride", "owner", "value", "display", "numberFormatOverride"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01772.class, "owner;value;display;numberFormatOverride", "owner", "value", "display", "numberFormatOverride"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01772.class, "owner;value;display;numberFormatOverride", "owner", "value", "display", "numberFormatOverride"}, this);
    }

    public @Nullable class00392 i() {
        return this.display;
    }

    public int u() {
        return this.value;
    }

    public class00392 y() {
        if (this.display != null) {
            return this.display;
        }
        return class00392.y((String)this.L());
    }

    public class05216 N(class01762 class017622) {
        return Objects.requireNonNullElse(this.numberFormatOverride, class017622).N(this.value);
    }

    public boolean N() {
        return this.owner.startsWith("#");
    }

    public @Nullable class01762 R() {
        return this.numberFormatOverride;
    }
}

