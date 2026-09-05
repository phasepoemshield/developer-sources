/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06715
 *  minecraft.class06889
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class06715;
import minecraft.class06889;

public final class class10672
extends Record {
    private final class06889 pos;
    public final String text;
    public final class06715 style;

    public class06715 L() {
        return this.style;
    }

    public class10672(class06889 class068892, String string, class06715 class067152) {
        this.pos = class068892;
        this.text = string;
        this.style = class067152;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class10672.class, "pos;text;style", "pos", "text", "style"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class10672.class, "pos;text;style", "pos", "text", "style"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class10672.class, "pos;text;style", "pos", "text", "style"}, this);
    }

    public String y() {
        return this.text;
    }

    public class06889 N() {
        return this.pos;
    }
}

