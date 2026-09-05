/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class07311
 *  org.joml.Vector3f
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class07311;
import minecraft.class08107;
import org.joml.Vector3f;

public final class class08108<S>
extends Record {
    private final class08107<S> modelSubmit;
    private final class07311 renderType;
    private final Vector3f position;

    public Vector3f L() {
        return this.position;
    }

    public class08108(class08107<S> class081072, class07311 class073112, Vector3f vector3f) {
        this.modelSubmit = class081072;
        this.renderType = class073112;
        this.position = vector3f;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08108.class, "modelSubmit;renderType;position", "modelSubmit", "renderType", "position"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08108.class, "modelSubmit;renderType;position", "modelSubmit", "renderType", "position"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08108.class, "modelSubmit;renderType;position", "modelSubmit", "renderType", "position"}, this);
    }

    public class07311 y() {
        return this.renderType;
    }

    public class08107<S> N() {
        return this.modelSubmit;
    }
}

