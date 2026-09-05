/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Quaternionf
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
package minecraft;

import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.joml.Vector3fc;

@FunctionalInterface
public interface class02058 {
    public static final class02058 N = f -> new Quaternionf().rotationX(-f);
    public static final class02058 y = f -> new Quaternionf().rotationX(f);
    public static final class02058 L = f -> new Quaternionf().rotationY(-f);
    public static final class02058 u = f -> new Quaternionf().rotationY(f);
    public static final class02058 i = f -> new Quaternionf().rotationZ(-f);
    public static final class02058 R = f -> new Quaternionf().rotationZ(f);

    public Quaternionf rotation(float var1);

    public static class02058 N(Vector3f vector3f) {
        return f -> new Quaternionf().rotationAxis(f, (Vector3fc)vector3f);
    }

    default public Quaternionf N(float f) {
        return this.rotation(f * ((float)Math.PI / 180));
    }
}

