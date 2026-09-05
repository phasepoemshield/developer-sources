/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03457;

final class class03441
extends Record {
    final class03457 type;
    final int depth;

    class03441(class03457 class034572, int n) {
        this.type = class034572;
        this.depth = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03441.class, "type;depth", "type", "depth"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03441.class, "type;depth", "type", "depth"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03441.class, "type;depth", "type", "depth"}, this);
    }

    public int y() {
        return this.depth;
    }

    public class03457 N() {
        return this.type;
    }
}

