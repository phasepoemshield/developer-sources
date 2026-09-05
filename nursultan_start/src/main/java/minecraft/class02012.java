/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
package minecraft;

import org.joml.Vector3f;
import org.joml.Vector3fc;

public interface class02012 {
    default public Vector3fc N(float f, float f2, float f3) {
        return this.N((Vector3fc)new Vector3f(f, f2, f3));
    }

    public Vector3fc N(Vector3fc var1);
}

