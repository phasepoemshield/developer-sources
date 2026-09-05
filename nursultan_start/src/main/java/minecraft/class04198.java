/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  minecraft.class01404
 *  minecraft.class02012
 *  minecraft.class02022
 *  minecraft.class02052
 *  minecraft.class02054
 *  minecraft.class02067
 *  minecraft.class03920
 *  minecraft.class03941
 *  minecraft.class04673
 *  minecraft.class04809
 *  minecraft.class07211
 *  minecraft.class08388
 *  minecraft.class08511
 *  org.joml.GeometryUtils
 *  org.joml.Matrix4fc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Objects;
import minecraft.class01404;
import minecraft.class02012;
import minecraft.class02022;
import minecraft.class02052;
import minecraft.class02054;
import minecraft.class02067;
import minecraft.class03920;
import minecraft.class03941;
import minecraft.class04120;
import minecraft.class04673;
import minecraft.class04809;
import minecraft.class07211;
import minecraft.class08388;
import minecraft.class08511;
import org.joml.GeometryUtils;
import org.joml.Matrix4fc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public class class04198 {
    private static final Vector3fc N = new Vector3f(0.5f, 0.5f, 0.5f);

    private static float y(float f) {
        return f + 0.5f;
    }

    private static int N(Vector3fc[] vector3fcArray, int n, float f, float f2, float f3) {
        for (int i = n; i < 4; ++i) {
            Vector3fc vector3fc = vector3fcArray[i];
            if (f != vector3fc.x() || f2 != vector3fc.y() || f3 != vector3fc.z()) continue;
            return i;
        }
        return -1;
    }

    private static void N(Vector3fc[] vector3fcArray, long[] lArray, class07211 class072112) {
        float f;
        float f2;
        float f3 = 999.0f;
        float f4 = 999.0f;
        float f5 = 999.0f;
        float f6 = -999.0f;
        float f7 = -999.0f;
        float f8 = -999.0f;
        for (int i = 0; i < 4; ++i) {
            Vector3fc vector3fc = vector3fcArray[i];
            float f9 = vector3fc.x();
            f2 = vector3fc.y();
            f = vector3fc.z();
            if (f9 < f3) {
                f3 = f9;
            }
            if (f2 < f4) {
                f4 = f2;
            }
            if (f < f5) {
                f5 = f;
            }
            if (f9 > f6) {
                f6 = f9;
            }
            if (f2 > f7) {
                f7 = f2;
            }
            if (!(f > f8)) continue;
            f8 = f;
        }
        class03941 class039412 = class03941.N((class07211)class072112);
        for (int i = 0; i < 4; ++i) {
            float f10;
            class03920 class039202 = class039412.N(i);
            f2 = class039202.N().N(f3, f4, f5, f6, f7, f8);
            int n = class04198.N(vector3fcArray, i, f2, f = class039202.y().N(f3, f4, f5, f6, f7, f8), f10 = class039202.L().N(f3, f4, f5, f6, f7, f8));
            if (n == -1) {
                throw new IllegalStateException("Can't find vertex to swap");
            }
            if (n == i) continue;
            class04198.N(vector3fcArray, n, i);
            class04198.N(lArray, n, i);
        }
    }

    private static @Nullable class07211 N(Vector3f vector3f) {
        if (!vector3f.isFinite()) {
            return null;
        }
        class07211 class072112 = null;
        float f = 0.0f;
        for (class07211 class072113 : class07211.values()) {
            float f2 = vector3f.dot(class072113.m());
            if (!(f2 >= 0.0f) || !(f2 > f)) continue;
            f = f2;
            class072112 = class072113;
        }
        return class072112;
    }

    private static @Nullable class07211 N(Vector3fc[] vector3fcArray) {
        Vector3f vector3f = new Vector3f();
        GeometryUtils.normal((Vector3fc)vector3fcArray[0], (Vector3fc)vector3fcArray[1], (Vector3fc)vector3fcArray[2], (Vector3f)vector3f);
        return class04198.N(vector3f);
    }

    private static void N(Vector3fc[] vector3fcArray, int n, int n2) {
        Vector3fc vector3fc = vector3fcArray[n];
        vector3fcArray[n] = vector3fcArray[n2];
        vector3fcArray[n2] = vector3fc;
    }

    private static void N(long[] lArray, int n, int n2) {
        long l = lArray[n];
        lArray[n] = lArray[n2];
        lArray[n2] = l;
    }

    public static class02022 N(class02012 class020122, Vector3fc vector3fc, Vector3fc vector3fc2, class02067 class020672, class08388 class083882, class07211 class072112, class04673 class046732, @Nullable class04120 class041202, boolean bl, int n) {
        class02052 class020522 = class020672.u();
        if (class020522 == null) {
            class020522 = class04198.N(vector3fc, vector3fc2, class072112);
        }
        Matrix4fc matrix4fc = class046732.method_68012(class072112);
        Vector3fc[] vector3fcArray = new Vector3fc[4];
        long[] lArray = new long[4];
        class03941 class039412 = class03941.N((class07211)class072112);
        for (int i = 0; i < 4; ++i) {
            class04198.N(i, class039412, class020522, class020672.i(), matrix4fc, vector3fc, vector3fc2, class083882, class046732.method_3509(), class041202, vector3fcArray, lArray, class020122);
        }
        class07211 class072113 = class04198.N(vector3fcArray);
        if (class041202 == null && class072113 != null) {
            class04198.N(vector3fcArray, lArray, class072113);
        }
        return new class02022(vector3fcArray[0], vector3fcArray[1], vector3fcArray[2], vector3fcArray[3], lArray[0], lArray[1], lArray[2], lArray[3], class020672.y(), Objects.requireNonNullElse(class072113, class07211.field_11036), class083882, bl, n);
    }

    private static void N(int n, class03941 class039412, class02052 class020522, class08511 class085112, Matrix4fc matrix4fc, Vector3fc vector3fc, Vector3fc vector3fc2, class08388 class083882, class01404 class014042, @Nullable class04120 class041202, Vector3fc[] vector3fcArray, long[] lArray, class02012 class020122) {
        float f;
        float f2;
        Vector3f vector3f = class039412.N(n).N(vector3fc, vector3fc2).div(16.0f);
        if (class041202 != null) {
            class04198.N(vector3f, class041202.N(), class041202.u());
        }
        if (class014042 != class01404.N()) {
            class04198.N(vector3f, N, class014042.L());
        }
        float f3 = class02067.N((class02052)class020522, (class08511)class085112, (int)n);
        float f4 = class02067.y((class02052)class020522, (class08511)class085112, (int)n);
        if (class02054.N((Matrix4fc)matrix4fc)) {
            f2 = f3;
            f = f4;
        } else {
            Vector3f vector3f2 = matrix4fc.transformPosition(new Vector3f(class04198.N(f3), class04198.N(f4), 0.0f));
            f2 = class04198.y(vector3f2.x);
            f = class04198.y(vector3f2.y);
        }
        vector3fcArray[n] = class020122.N((Vector3fc)vector3f);
        lArray[n] = class04809.N((float)class083882.method_4580(f2), (float)class083882.method_4570(f));
    }

    private static float N(float f) {
        return f - 0.5f;
    }

    private static void N(Vector3f vector3f, Vector3fc vector3fc, Matrix4fc matrix4fc) {
        vector3f.sub(vector3fc);
        matrix4fc.transformPosition(vector3f);
        vector3f.add(vector3fc);
    }

    static class02052 N(Vector3fc vector3fc, Vector3fc vector3fc2, class07211 class072112) {
        return switch (class072112) {
            default -> throw new MatchException(null, null);
            case class07211.field_11033 -> new class02052(vector3fc.x(), 16.0f - vector3fc2.z(), vector3fc2.x(), 16.0f - vector3fc.z());
            case class07211.field_11036 -> new class02052(vector3fc.x(), vector3fc.z(), vector3fc2.x(), vector3fc2.z());
            case class07211.field_11043 -> new class02052(16.0f - vector3fc2.x(), 16.0f - vector3fc2.y(), 16.0f - vector3fc.x(), 16.0f - vector3fc.y());
            case class07211.field_11035 -> new class02052(vector3fc.x(), 16.0f - vector3fc2.y(), vector3fc2.x(), 16.0f - vector3fc.y());
            case class07211.field_11039 -> new class02052(vector3fc.z(), 16.0f - vector3fc2.y(), vector3fc2.z(), 16.0f - vector3fc.y());
            case class07211.field_11034 -> new class02052(16.0f - vector3fc2.z(), 16.0f - vector3fc2.y(), 16.0f - vector3fc.z(), 16.0f - vector3fc.y());
        };
    }
}

