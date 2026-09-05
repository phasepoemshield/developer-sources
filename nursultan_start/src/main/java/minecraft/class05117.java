/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03432
 *  minecraft.class03434
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03432;
import minecraft.class03434;

public final class class05117
extends Record {
    final class03434 entry;
    final int index;
    final class03432 priority;

    public class03432 L() {
        return this.priority;
    }

    public class05117(class03434 class034342, int n, class03432 class034322) {
        this.entry = class034342;
        this.index = n;
        this.priority = class034322;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05117.class, "entry;index;priority", "entry", "index", "priority"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05117.class, "entry;index;priority", "entry", "index", "priority"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05117.class, "entry;index;priority", "entry", "index", "priority"}, this);
    }

    public int y() {
        return this.index;
    }

    public class03434 N() {
        return this.entry;
    }
}

