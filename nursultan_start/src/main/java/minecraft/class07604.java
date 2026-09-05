/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  org.joml.Vector3fc
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.joml.Vector3fc;

public final class class07604
extends Record {
    private final Vector3fc forwardVector;

    public class07604(Vector3fc vector3fc) {
        this.forwardVector = vector3fc;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07604.class, "forwardVector", "forwardVector"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07604.class, "forwardVector", "forwardVector"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07604.class, "forwardVector", "forwardVector"}, this);
    }

    public Vector3fc N() {
        return this.forwardVector;
    }
}

