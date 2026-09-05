/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04341
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class04341;
import minecraft.class04364;

public final class class04373
extends Record {
    private final class04364 target;
    private final class04341[] keyframes;

    public class04373(class04364 class043642, class04341 ... class04341Array) {
        this.target = class043642;
        this.keyframes = class04341Array;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04373.class, "target;keyframes", "target", "keyframes"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04373.class, "target;keyframes", "target", "keyframes"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04373.class, "target;keyframes", "target", "keyframes"}, this);
    }

    public class04341[] y() {
        return this.keyframes;
    }

    public class04364 N() {
        return this.target;
    }
}

