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

public final class class05535
extends Record {
    private final int color;
    final String text;
    final long removeAtTime;

    public long L() {
        return this.removeAtTime;
    }

    public class05535(int n, String string, long l) {
        this.color = n;
        this.text = string;
        this.removeAtTime = l;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05535.class, "color;text;removeAtTime", "color", "text", "removeAtTime"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05535.class, "color;text;removeAtTime", "color", "text", "removeAtTime"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05535.class, "color;text;removeAtTime", "color", "text", "removeAtTime"}, this);
    }

    public String y() {
        return this.text;
    }

    public int N() {
        return this.color;
    }
}

