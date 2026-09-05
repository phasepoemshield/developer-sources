/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00494
 *  minecraft.class05236
 *  org.apache.commons.lang3.mutable.MutableObject
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00494;
import minecraft.class05236;
import org.apache.commons.lang3.mutable.MutableObject;

final class class04867
extends Record {
    final class05236 piece;
    final MutableObject<class00494> free;
    final int depth;

    public int L() {
        return this.depth;
    }

    class04867(class05236 class052362, MutableObject<class00494> mutableObject, int n) {
        this.piece = class052362;
        this.free = mutableObject;
        this.depth = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04867.class, "piece;free;depth", "piece", "free", "depth"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04867.class, "piece;free;depth", "piece", "free", "depth"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04867.class, "piece;free;depth", "piece", "free", "depth"}, this);
    }

    public MutableObject<class00494> y() {
        return this.free;
    }

    public class05236 N() {
        return this.piece;
    }
}

