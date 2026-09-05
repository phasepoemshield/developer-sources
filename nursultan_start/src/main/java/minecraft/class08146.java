/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class08804
 *  org.joml.Matrix4f
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class08804;
import org.joml.Matrix4f;

public final class class08146
extends Record {
    private final Matrix4f pose;
    private final class08804 leashState;

    public class08146(Matrix4f matrix4f, class08804 class088042) {
        this.pose = matrix4f;
        this.leashState = class088042;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08146.class, "pose;leashState", "pose", "leashState"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08146.class, "pose;leashState", "pose", "leashState"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08146.class, "pose;leashState", "pose", "leashState"}, this);
    }

    public class08804 y() {
        return this.leashState;
    }

    public Matrix4f N() {
        return this.pose;
    }
}

