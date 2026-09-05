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

final class class04841
extends Record {
    private final class01894 fontId;
    private final String pack;
    private final int index;

    public int L() {
        return this.index;
    }

    class04841(class01894 class018942, String string, int n) {
        this.fontId = class018942;
        this.pack = string;
        this.index = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04841.class, "fontId;pack;index", "fontId", "pack", "index"}, this, object);
    }

    public String toString() {
        return "(" + String.valueOf(this.fontId) + ": builder #" + this.index + " from pack " + this.pack + ")";
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04841.class, "fontId;pack;index", "fontId", "pack", "index"}, this);
    }

    public String y() {
        return this.pack;
    }

    public class01894 N() {
        return this.fontId;
    }
}

