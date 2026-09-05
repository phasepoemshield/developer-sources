/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04018
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class04018;

final class class03009
extends Record
implements class04018 {
    private final class04018 target;

    class03009(class04018 class040182) {
        this.target = class040182;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03009.class, "target", "target"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03009.class, "target", "target"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03009.class, "target", "target"}, this);
    }

    public boolean y() {
        return !this.target.y();
    }

    public class04018 N() {
        return this.target;
    }
}

