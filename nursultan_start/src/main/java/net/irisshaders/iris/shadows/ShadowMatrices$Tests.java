/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01421
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 */
package net.irisshaders.iris.shadows;

import minecraft.class01421;
import net.irisshaders.iris.shadows.ShadowMatrices;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

final class ShadowMatrices$Tests {
    private ShadowMatrices$Tests() {
    }

    public static void main(String[] stringArray) {
        Matrix4f matrix4f = new Matrix4f(0.03125f, 0.0f, 0.0f, 0.0f, 0.0f, 0.03125f, 0.0f, 0.0f, 0.0f, 0.0f, -0.007814026f, 0.0f, 0.0f, 0.0f, -1.0003906f, 1.0f);
        ShadowMatrices$Tests.test("ortho projection hpl=32", matrix4f, ShadowMatrices.createOrthoMatrix(32.0f, 0.05f, 256.0f));
        Matrix4f matrix4f2 = new Matrix4f(0.009090909f, 0.0f, 0.0f, 0.0f, 0.0f, 0.009090909f, 0.0f, 0.0f, 0.0f, 0.0f, -0.007814026f, 0.0f, 0.0f, 0.0f, -1.0003906f, 1.0f);
        ShadowMatrices$Tests.test("ortho projection hpl=110", matrix4f2, ShadowMatrices.createOrthoMatrix(110.0f, 0.05f, 256.0f));
        Matrix4f matrix4f3 = new Matrix4f(1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0003906f, -1.0f, 0.0f, 0.0f, -0.10001954f, 0.0f);
        ShadowMatrices$Tests.test("perspective projection fov=90", matrix4f3, ShadowMatrices.createPerspectiveMatrix(90.0f));
        Matrix4f matrix4f4 = new Matrix4f(0.2154504f, 5.8204815E-8f, 0.9765147f, 0.0f, -0.97651476f, 1.2841845E-8f, 0.21545039f, 0.0f, 0.0f, -0.99999994f, 5.9604645E-8f, 0.0f, 0.3800215f, 1.0264281f, -100.44631f, 1.0f);
        class01421 class014212 = new class01421();
        ShadowMatrices.createModelViewMatrix(class014212, 0.03451777f, 2.0f, 0.0f, 0.646045982837677, 82.53274536132812, -514.0264282226562, -100.05f, 156.0f);
        ShadowMatrices$Tests.test("model view at dawn", matrix4f4, class014212.L().N());
    }

    private static void test(String string, Matrix4f matrix4f, Matrix4f matrix4f2) {
        if (matrix4f.equals((Matrix4fc)matrix4f2, 5.0E-4f)) {
            System.err.println("test " + string + " failed: ");
            System.err.println("    expected: ");
            System.err.print(matrix4f);
            System.err.println("    created: ");
            System.err.print(matrix4f2.toString());
        } else {
            System.out.println("test " + string + " passed");
        }
    }
}

