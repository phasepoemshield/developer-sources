/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01929
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01929;

public final class class04144
extends Record {
    private final class01929 full;
    private final class01929 patches;

    public class04144(class01929 class019292, class01929 class019293) {
        this.full = class019292;
        this.patches = class019293;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04144.class, "full;patches", "full", "patches"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04144.class, "full;patches", "full", "patches"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04144.class, "full;patches", "full", "patches"}, this);
    }

    public class01929 y() {
        return this.patches;
    }

    public class01929 N() {
        return this.full;
    }
}

