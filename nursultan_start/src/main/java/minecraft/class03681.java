/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00392;
import minecraft.class03692;

public final class class03681
extends Record {
    private final class00392 text;
    private final int lineWidth;
    final class03692 textOpacity;
    final class03692 backgroundColor;
    private final byte flags;

    public class03692 L() {
        return this.textOpacity;
    }

    public class03681(class00392 class003922, int n, class03692 class036922, class03692 class036923, byte by) {
        this.text = class003922;
        this.lineWidth = n;
        this.textOpacity = class036922;
        this.backgroundColor = class036923;
        this.flags = by;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03681.class, "text;lineWidth;textOpacity;backgroundColor;flags", "text", "lineWidth", "textOpacity", "backgroundColor", "flags"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03681.class, "text;lineWidth;textOpacity;backgroundColor;flags", "text", "lineWidth", "textOpacity", "backgroundColor", "flags"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03681.class, "text;lineWidth;textOpacity;backgroundColor;flags", "text", "lineWidth", "textOpacity", "backgroundColor", "flags"}, this);
    }

    public byte i() {
        return this.flags;
    }

    public class03692 u() {
        return this.backgroundColor;
    }

    public int y() {
        return this.lineWidth;
    }

    public class00392 N() {
        return this.text;
    }
}

