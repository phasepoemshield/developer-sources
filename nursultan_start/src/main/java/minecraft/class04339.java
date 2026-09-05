/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 *  org.joml.Vector3fc
 */
package minecraft;

import minecraft.class04342;
import minecraft.class04995;
import org.joml.Vector3fc;

public class class04339 {
    public static final class04342 N = (vector3f, f, class04341Array, n, n2, f2) -> {
        Vector3fc vector3fc = class04341Array[n].L();
        Vector3fc vector3fc2 = class04341Array[n2].y();
        return vector3fc.lerp(vector3fc2, f, vector3f).mul(f2);
    };
    public static final class04342 y = (vector3f, f, class04341Array, n, n2, f2) -> {
        Vector3fc vector3fc = class04341Array[Math.max(0, n - 1)].L();
        Vector3fc vector3fc2 = class04341Array[n].L();
        Vector3fc vector3fc3 = class04341Array[n2].L();
        Vector3fc vector3fc4 = class04341Array[Math.min(class04341Array.length - 1, n2 + 1)].L();
        vector3f.set(class04995.N((float)f, (float)vector3fc.x(), (float)vector3fc2.x(), (float)vector3fc3.x(), (float)vector3fc4.x()) * f2, class04995.N((float)f, (float)vector3fc.y(), (float)vector3fc2.y(), (float)vector3fc3.y(), (float)vector3fc4.y()) * f2, class04995.N((float)f, (float)vector3fc.z(), (float)vector3fc2.z(), (float)vector3fc3.z(), (float)vector3fc4.z()) * f2);
        return vector3f;
    };
}

