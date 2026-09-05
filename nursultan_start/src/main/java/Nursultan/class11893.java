/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  org.joml.Vector2f
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.joml.Vector2f;

public class class11893
extends Record {
    public boolean inFront;
    public Vector2f pos;

    public class11893(Vector2f vector2f, boolean bl) {
        this.pos = vector2f;
        this.inFront = bl;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11893.class, "pos;inFront", "pos", "inFront"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11893.class, "pos;inFront", "pos", "inFront"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11893.class, "pos;inFront", "pos", "inFront"}, this);
    }

    public boolean y() {
        return this.inFront;
    }

    public Vector2f N() {
        return this.pos;
    }
}

