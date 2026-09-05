/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 *  net.irisshaders.iris.compat.dh.DHCompat
 *  net.irisshaders.iris.gl.uniform.UniformHolder
 *  net.irisshaders.iris.gl.uniform.UniformUpdateFrequency
 *  net.irisshaders.iris.shaderpack.properties.PackDirectives
 *  net.irisshaders.iris.shadows.ShadowMatrices
 *  net.irisshaders.iris.shadows.ShadowRenderer
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 */
package net.irisshaders.iris.uniforms;

import java.util.function.Supplier;
import minecraft.class04995;
import net.irisshaders.iris.compat.dh.DHCompat;
import net.irisshaders.iris.gl.uniform.UniformHolder;
import net.irisshaders.iris.gl.uniform.UniformUpdateFrequency;
import net.irisshaders.iris.shaderpack.properties.PackDirectives;
import net.irisshaders.iris.shadows.ShadowMatrices;
import net.irisshaders.iris.shadows.ShadowRenderer;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import net.irisshaders.iris.uniforms.MatrixUniforms$Inverted;
import net.irisshaders.iris.uniforms.MatrixUniforms$Previous;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

public final class MatrixUniforms {
    private MatrixUniforms() {
    }

    public static void addMatrixUniforms(UniformHolder uniformHolder, PackDirectives packDirectives) {
        MatrixUniforms.addMatrix(uniformHolder, "ModelView", CapturedRenderingState.INSTANCE::getGbufferModelView);
        MatrixUniforms.addMatrix(uniformHolder, "Projection", CapturedRenderingState.INSTANCE::getGbufferProjection);
        MatrixUniforms.addDHMatrix(uniformHolder, "Projection", DHCompat::getProjection);
        MatrixUniforms.addShadowMatrix(uniformHolder, "ModelView", () -> new Matrix4f((Matrix4fc)ShadowRenderer.createShadowModelView((float)packDirectives.getSunPathRotation(), (float)packDirectives.getShadowDirectives().getIntervalSize(), (float)(class04995.y((float)packDirectives.getShadowDirectives().getNearPlane(), (float)-1.0f) ? (float)(-DHCompat.getRenderDistance() * 16) : packDirectives.getShadowDirectives().getNearPlane()), (float)(class04995.y((float)packDirectives.getShadowDirectives().getFarPlane(), (float)-1.0f) ? (float)(DHCompat.getRenderDistance() * 16) : packDirectives.getShadowDirectives().getFarPlane())).L().N()));
        MatrixUniforms.addShadowMatrix(uniformHolder, "Projection", () -> ShadowMatrices.createOrthoMatrix((float)packDirectives.getShadowDirectives().getDistance(), (float)(class04995.y((float)packDirectives.getShadowDirectives().getNearPlane(), (float)-1.0f) ? (float)(-DHCompat.getRenderDistance() * 16) : packDirectives.getShadowDirectives().getNearPlane()), (float)(class04995.y((float)packDirectives.getShadowDirectives().getFarPlane(), (float)-1.0f) ? (float)(DHCompat.getRenderDistance() * 16) : packDirectives.getShadowDirectives().getFarPlane())));
    }

    private static void addDHMatrix(UniformHolder uniformHolder, String string, Supplier<Matrix4fc> supplier) {
        uniformHolder.uniformMatrix(UniformUpdateFrequency.PER_FRAME, "dh" + string, supplier).uniformMatrix(UniformUpdateFrequency.PER_FRAME, "dh" + string + "Inverse", (Supplier)new MatrixUniforms$Inverted(supplier)).uniformMatrix(UniformUpdateFrequency.PER_FRAME, "dhPrevious" + string, (Supplier)new MatrixUniforms$Previous(supplier));
    }

    private static void addShadowMatrix(UniformHolder uniformHolder, String string, Supplier<Matrix4fc> supplier) {
        uniformHolder.uniformMatrix(UniformUpdateFrequency.PER_FRAME, "shadow" + string, supplier).uniformMatrix(UniformUpdateFrequency.PER_FRAME, "shadow" + string + "Inverse", (Supplier)new MatrixUniforms$Inverted(supplier));
    }

    private static void addMatrix(UniformHolder uniformHolder, String string, Supplier<Matrix4fc> supplier) {
        uniformHolder.uniformMatrix(UniformUpdateFrequency.PER_FRAME, "gbuffer" + string, supplier).uniformMatrix(UniformUpdateFrequency.PER_FRAME, "gbuffer" + string + "Inverse", (Supplier)new MatrixUniforms$Inverted(supplier)).uniformMatrix(UniformUpdateFrequency.PER_FRAME, "gbufferPrevious" + string, (Supplier)new MatrixUniforms$Previous(supplier));
    }
}

