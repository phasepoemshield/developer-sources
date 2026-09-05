/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01894;

public final class class06359
extends Record {
    private final class01894 id;
    private final boolean tag;

    public String L() {
        return this.tag ? "#" + String.valueOf(this.id) : this.id.toString();
    }

    public class06359(class01894 class018942, boolean bl) {
        this.id = class018942;
        this.tag = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06359.class, "id;tag", "id", "tag"}, this, object);
    }

    public String toString() {
        return this.L();
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06359.class, "id;tag", "id", "tag"}, this);
    }

    public boolean y() {
        return this.tag;
    }

    public class01894 N() {
        return this.id;
    }
}

