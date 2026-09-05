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

final class class05490
extends Record {
    private final class01894 first;
    private final class01894 middle;
    private final class01894 last;

    public class01894 L() {
        return this.last;
    }

    class05490(class01894 class018942, class01894 class018943, class01894 class018944) {
        this.first = class018942;
        this.middle = class018943;
        this.last = class018944;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05490.class, "first;middle;last", "first", "middle", "last"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05490.class, "first;middle;last", "first", "middle", "last"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05490.class, "first;middle;last", "first", "middle", "last"}, this);
    }

    public class01894 y() {
        return this.middle;
    }

    public class01894 N() {
        return this.first;
    }
}

