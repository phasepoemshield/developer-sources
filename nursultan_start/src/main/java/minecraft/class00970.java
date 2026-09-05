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
import java.util.List;
import java.util.Optional;
import minecraft.class01894;

final class class00970
extends Record {
    private final class01894 id;
    private final Optional<List<class01894>> sprites;

    class00970(class01894 class018942, Optional<List<class01894>> optional) {
        this.id = class018942;
        this.sprites = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00970.class, "id;sprites", "id", "sprites"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00970.class, "id;sprites", "id", "sprites"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00970.class, "id;sprites", "id", "sprites"}, this);
    }

    public Optional<List<class01894>> y() {
        return this.sprites;
    }

    public class01894 N() {
        return this.id;
    }
}

