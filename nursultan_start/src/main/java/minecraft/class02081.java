/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04120
 *  minecraft.class07211
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import minecraft.class02067;
import minecraft.class04120;
import minecraft.class07211;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public final class class02081
extends Record {
    private final Vector3fc from;
    private final Vector3fc to;
    private final Map<class07211, class02067> faces;
    private final @Nullable class04120 rotation;
    private final boolean shade;
    private final int lightEmission;
    private static final boolean M = false;
    private static final float B = -16.0f;
    private static final float Z = 32.0f;

    public Map<class07211, class02067> L() {
        return this.faces;
    }

    public class02081(Vector3fc vector3fc, Vector3fc vector3fc2, Map<class07211, class02067> map) {
        this(vector3fc, vector3fc2, map, null, true, 0);
    }

    public class02081(Vector3fc vector3fc, Vector3fc vector3fc2, Map<class07211, class02067> map, @Nullable class04120 class041202, boolean bl, int n) {
        this.from = vector3fc;
        this.to = vector3fc2;
        this.faces = map;
        this.rotation = class041202;
        this.shade = bl;
        this.lightEmission = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02081.class, "from;to;faces;rotation;shade;lightEmission", "from", "to", "faces", "rotation", "shade", "lightEmission"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02081.class, "from;to;faces;rotation;shade;lightEmission", "from", "to", "faces", "rotation", "shade", "lightEmission"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02081.class, "from;to;faces;rotation;shade;lightEmission", "from", "to", "faces", "rotation", "shade", "lightEmission"}, this);
    }

    public boolean i() {
        return this.shade;
    }

    public @Nullable class04120 u() {
        return this.rotation;
    }

    public Vector3fc y() {
        return this.to;
    }

    public Vector3fc N() {
        return this.from;
    }

    public int R() {
        return this.lightEmission;
    }
}

