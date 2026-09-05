/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01028
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01028;

public final class class05468
extends Record {
    final class01028 text;
    final int width;

    public class05468(class01028 class010282, int n) {
        this.text = class010282;
        this.width = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05468.class, "text;width", "text", "width"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05468.class, "text;width", "text", "width"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05468.class, "text;width", "text", "width"}, this);
    }

    public int y() {
        return this.width;
    }

    public class01028 N() {
        return this.text;
    }
}

