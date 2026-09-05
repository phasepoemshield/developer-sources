/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  minecraft.class02054
 *  minecraft.class07211
 *  minecraft.class07536
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  org.joml.Vector3f
 */
package minecraft;

import com.google.common.collect.Maps;
import java.util.Map;
import minecraft.class01404;
import minecraft.class02054;
import minecraft.class07211;
import minecraft.class07536;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;

public class class01414 {
    private static final Map<class07211, class01404> N = Maps.newEnumMap(Map.of(class07211.field_11035, class01404.N(), class07211.field_11034, new class01404(null, (Quaternionfc)new Quaternionf().rotateY(1.5707964f), null, null), class07211.field_11039, new class01404(null, (Quaternionfc)new Quaternionf().rotateY(-1.5707964f), null, null), class07211.field_11043, new class01404(null, (Quaternionfc)new Quaternionf().rotateY((float)Math.PI), null, null), class07211.field_11036, new class01404(null, (Quaternionfc)new Quaternionf().rotateX(-1.5707964f), null, null), class07211.field_11033, new class01404(null, (Quaternionfc)new Quaternionf().rotateX(1.5707964f), null, null)));
    private static final Map<class07211, class01404> y = Maps.newEnumMap((Map)class07536.N(N, class01404::y));

    public static class01404 y(class01404 class014042) {
        Matrix4f matrix4f = new Matrix4f().translation(-0.5f, -0.5f, -0.5f);
        matrix4f.mul(class014042.L());
        matrix4f.translate(0.5f, 0.5f, 0.5f);
        return new class01404((Matrix4fc)matrix4f);
    }

    public static class01404 N(class01404 class014042, class07211 class072112) {
        if (class02054.N((Matrix4fc)class014042.L())) {
            return class014042;
        }
        class01404 class014043 = N.get(class072112);
        class014043 = class014042.N(class014043);
        Vector3f vector3f = class014043.L().transformDirection(new Vector3f(0.0f, 0.0f, 1.0f));
        class07211 class072113 = class07211.N((float)vector3f.x, (float)vector3f.y, (float)vector3f.z);
        return y.get(class072113).N(class014043);
    }

    public static class01404 N(class01404 class014042) {
        Matrix4f matrix4f = new Matrix4f().translation(0.5f, 0.5f, 0.5f);
        matrix4f.mul(class014042.L());
        matrix4f.translate(-0.5f, -0.5f, -0.5f);
        return new class01404((Matrix4fc)matrix4f);
    }
}

