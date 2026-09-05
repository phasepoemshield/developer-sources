/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01423
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01423;

public final class class08141
extends Record {
    private final int progress;
    private final class01423 cameraPose;

    public class08141(int n, class01423 class014232) {
        this.progress = n;
        this.cameraPose = class014232;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08141.class, "progress;cameraPose", "progress", "cameraPose"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08141.class, "progress;cameraPose", "progress", "cameraPose"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08141.class, "progress;cameraPose", "progress", "cameraPose"}, this);
    }

    public class01423 y() {
        return this.cameraPose;
    }

    public int N() {
        return this.progress;
    }
}

