/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class07345
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class07345;

public final class class07341
extends Record
implements class07345 {
    private final int location;
    private final int samplerIndex;

    public class07341(int n, int n2) {
        this.location = n;
        this.samplerIndex = n2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07341.class, "location;samplerIndex", "location", "samplerIndex"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07341.class, "location;samplerIndex", "location", "samplerIndex"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07341.class, "location;samplerIndex", "location", "samplerIndex"}, this);
    }

    public int y() {
        return this.samplerIndex;
    }

    public int N() {
        return this.location;
    }
}

