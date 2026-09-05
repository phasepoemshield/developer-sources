/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01028
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01028;

public final class class10228
extends Record {
    private final class01028 contents;
    private final int width;

    public class10228(class01028 class010282, int n) {
        this.contents = class010282;
        this.width = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class10228.class, "contents;width", "contents", "width"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class10228.class, "contents;width", "contents", "width"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class10228.class, "contents;width", "contents", "width"}, this);
    }

    public int y() {
        return this.width;
    }

    public class01028 N() {
        return this.contents;
    }
}

