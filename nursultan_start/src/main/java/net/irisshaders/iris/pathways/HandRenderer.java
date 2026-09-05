/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  com.mojang.blaze3d.systems.RenderSystem
 *  minecraft.class00062
 *  minecraft.class00312
 *  minecraft.class00500
 *  minecraft.class01386
 *  minecraft.class01421
 *  minecraft.class01590
 *  minecraft.class03386
 *  minecraft.class03443
 *  minecraft.class04453
 *  minecraft.class04790
 *  minecraft.class05363
 *  minecraft.class05630
 *  minecraft.class05885
 *  minecraft.class06202
 *  minecraft.class06581
 *  minecraft.class06918
 *  minecraft.class07050
 *  minecraft.class07085
 *  minecraft.class07282
 *  minecraft.class07438
 *  minecraft.class08036
 *  minecraft.class08133
 *  minecraft.class08700
 *  minecraft.class08743
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.mixin.GameRendererAccessor
 *  net.irisshaders.iris.pipeline.WorldRenderingPhase
 *  net.irisshaders.iris.pipeline.WorldRenderingPipeline
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 */
package net.irisshaders.iris.pathways;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.systems.RenderSystem;
import minecraft.class00062;
import minecraft.class00312;
import minecraft.class00500;
import minecraft.class01386;
import minecraft.class01421;
import minecraft.class01590;
import minecraft.class03386;
import minecraft.class03443;
import minecraft.class04453;
import minecraft.class04790;
import minecraft.class05363;
import minecraft.class05630;
import minecraft.class05885;
import minecraft.class06202;
import minecraft.class06581;
import minecraft.class06918;
import minecraft.class07050;
import minecraft.class07085;
import minecraft.class07282;
import minecraft.class07438;
import minecraft.class08036;
import minecraft.class08133;
import minecraft.class08700;
import minecraft.class08743;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.mixin.GameRendererAccessor;
import net.irisshaders.iris.pipeline.WorldRenderingPhase;
import net.irisshaders.iris.pipeline.WorldRenderingPipeline;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

public class HandRenderer {
    public static final HandRenderer INSTANCE = new HandRenderer();
    public static final float DEPTH = 0.125f;
    private final class01386 bufferSource = new class01386(Runtime.getRuntime().availableProcessors());
    private final class00062 cachedProjectionMatrixBuffer = new class00062("hand (Iris)");
    private boolean ACTIVE;
    private boolean renderingSolid;
    private class04790 submitNodeCollector = new class04790();
    private class08133 featureRenderDispatcher;

    public HandRenderer() {
        this.featureRenderDispatcher = new class08133(this.submitNodeCollector, class06202.Nq().yU(), this.bufferSource.L(), class06202.Nq().yW(), this.bufferSource.i(), this.bufferSource.u(), (class01590)class06202.Nq().i_3);
    }

    public void destroy() {
    }

    public boolean isActive() {
        return this.ACTIVE;
    }

    private class01421 setupGlState(class03386 class033862, class05363 class053632, Matrix4fc matrix4fc, float f) {
        class01421 class014212 = new class01421();
        Matrix4f matrix4f = new Matrix4f().scale(1.0f, 1.0f, 0.125f);
        matrix4f.mul((Matrix4fc)class033862.y(((GameRendererAccessor)class033862).invokeGetFov(class053632, f, false)));
        RenderSystem.setProjectionMatrix((GpuBufferSlice)this.cachedProjectionMatrixBuffer.N(matrix4f), (class00312)class00312.field_54953);
        class014212.i();
        ((GameRendererAccessor)class033862).invokeBobHurt(class014212, f);
        if (((Boolean)((class05630)class06202.Nq().i_7).Ns().method_41753()).booleanValue()) {
            ((GameRendererAccessor)class033862).invokeBobView(class014212, f);
        }
        return class014212;
    }

    public void renderSolid(Matrix4fc matrix4fc, float f, class05363 class053632, class03386 class033862, WorldRenderingPipeline worldRenderingPipeline) {
        if (!this.canRender(class053632, class033862) || !Iris.isPackInUseQuick()) {
            return;
        }
        RenderSystem.backupProjectionMatrix();
        this.ACTIVE = true;
        class01421 class014212 = this.setupGlState(class033862, class053632, matrix4fc, f);
        worldRenderingPipeline.setPhase(WorldRenderingPhase.HAND_SOLID);
        class014212.N();
        class08700.N().N("iris_hand");
        this.renderingSolid = true;
        RenderSystem.getModelViewStack().pushMatrix();
        RenderSystem.getModelViewStack().set((Matrix4fc)class014212.L().N());
        class033862.u.iris$renderHandsWithCustomRenderer(this, f, new class01421(), this.submitNodeCollector, (class04453)class06202.Nq().T_4, class06202.Nq().Ng().N(class053632.B(), f));
        class08700.N().L();
        RenderSystem.restoreProjectionMatrix();
        class014212.y();
        RenderSystem.getModelViewStack().popMatrix();
        this.renderingSolid = false;
        worldRenderingPipeline.setPhase(WorldRenderingPhase.NONE);
        this.ACTIVE = false;
    }

    public void renderTranslucent(Matrix4fc matrix4fc, float f, class05363 class053632, class03386 class033862, WorldRenderingPipeline worldRenderingPipeline) {
        if (!(this.canRender(class053632, class033862) && this.isAnyHandTranslucent() && Iris.isPackInUseQuick())) {
            this.submitNodeCollector.y();
            return;
        }
        RenderSystem.backupProjectionMatrix();
        this.ACTIVE = true;
        worldRenderingPipeline.setPhase(WorldRenderingPhase.HAND_TRANSLUCENT);
        class01421 class014212 = this.setupGlState(class033862, class053632, matrix4fc, f);
        class014212.N();
        class08700.N().N("iris_hand_translucent");
        RenderSystem.getModelViewStack().pushMatrix();
        RenderSystem.getModelViewStack().set((Matrix4fc)class014212.L().N());
        class033862.u.iris$renderHandsWithCustomRenderer(this, f, new class01421(), this.submitNodeCollector, (class04453)class06202.Nq().T_4, class06202.Nq().Ng().N(class053632.B(), f));
        class014212.y();
        class08700.N().L();
        this.submitNodeCollector.y();
        RenderSystem.restoreProjectionMatrix();
        RenderSystem.getModelViewStack().popMatrix();
        worldRenderingPipeline.setPhase(WorldRenderingPhase.NONE);
        this.ACTIVE = false;
    }

    public void endRender() {
        this.featureRenderDispatcher.N();
        this.bufferSource.L().u();
    }

    public boolean isRenderingSolid() {
        return this.renderingSolid;
    }

    public boolean isHandTranslucent(class07050 class070502) {
        class06581 class065812 = ((class04453)class06202.Nq().T_4).method_6118(class070502 == class07050.field_5810 ? class07085.field_6171 : class07085.field_6173).B();
        if (class065812 instanceof class06918) {
            return class05885.N((class00500)((class06918)class065812).L().W()) == class08743.field_60926;
        }
        return false;
    }

    public boolean isAnyHandTranslucent() {
        return this.isHandTranslucent(class07050.field_5808) || this.isHandTranslucent(class07050.field_5810);
    }

    private boolean canRender(class05363 class053632, class03386 class033862) {
        return !class053632.z() && class053632.B() instanceof class08036 && !class033862.R() && !((class05630)class06202.Nq().i_7).NG && (!(class053632.B() instanceof class07438) || !((class07438)class053632.B()).method_6113()) && ((class03443)class06202.Nq().T_2).U() != class07282.field_9219;
    }
}

