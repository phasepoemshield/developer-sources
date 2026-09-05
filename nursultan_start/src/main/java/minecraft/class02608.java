/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04127
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class04127;

final class class02608
extends Record {
    final String source;
    final class04127 contents;

    class02608(String string, class04127 class041272) {
        this.source = string;
        this.contents = class041272;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02608.class, "source;contents", "source", "contents"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02608.class, "source;contents", "source", "contents"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02608.class, "source;contents", "source", "contents"}, this);
    }

    public class04127 y() {
        return this.contents;
    }

    public String N() {
        return this.source;
    }
}

