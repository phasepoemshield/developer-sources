/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01404
 *  minecraft.class04673
 *  minecraft.class07211
 *  org.joml.Matrix4fc
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01404;
import minecraft.class04673;
import minecraft.class07211;
import minecraft.class08510;
import org.joml.Matrix4fc;

final class class08539
extends Record
implements class04673 {
    private final class08510 parent;

    class08539(class08510 class085102) {
        this.parent = class085102;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08539.class, "parent", "parent"}, this, object);
    }

    public String toString() {
        return "uvLocked[" + this.parent.y.method_15434() + "]";
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08539.class, "parent", "parent"}, this);
    }

    public class08510 N() {
        return this.parent;
    }

    public Matrix4fc method_68011(class07211 class072112) {
        return this.parent.u.getOrDefault(class072112, R);
    }

    public class01404 method_3509() {
        return this.parent.L;
    }

    public Matrix4fc method_68012(class07211 class072112) {
        return this.parent.i.getOrDefault(class072112, R);
    }
}

