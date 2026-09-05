/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03956;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public final class class03920
extends Record {
    private final class03956 xFace;
    private final class03956 yFace;
    private final class03956 zFace;

    public class03956 L() {
        return this.zFace;
    }

    public class03920(class03956 class039562, class03956 class039563, class03956 class039564) {
        this.xFace = class039562;
        this.yFace = class039563;
        this.zFace = class039564;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03920.class, "xFace;yFace;zFace", "xFace", "yFace", "zFace"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03920.class, "xFace;yFace;zFace", "xFace", "yFace", "zFace"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03920.class, "xFace;yFace;zFace", "xFace", "yFace", "zFace"}, this);
    }

    public class03956 y() {
        return this.yFace;
    }

    public class03956 N() {
        return this.xFace;
    }

    public Vector3f N(Vector3fc vector3fc, Vector3fc vector3fc2) {
        return new Vector3f(this.xFace.N(vector3fc, vector3fc2), this.yFace.N(vector3fc, vector3fc2), this.zFace.N(vector3fc, vector3fc2));
    }
}

