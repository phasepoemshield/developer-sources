/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.ModifyExpressionValue
 *  com.llamalad7.mixinextras.injector.ModifyReturnValue
 *  com.llamalad7.mixinextras.sugar.Local
 *  net.minecraft.class_10209
 *  net.minecraft.class_11228
 *  net.minecraft.class_1297
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_310
 *  net.minecraft.class_332
 *  net.minecraft.class_3928
 *  net.minecraft.class_4071
 *  net.minecraft.class_435
 *  net.minecraft.class_4587
 *  net.minecraft.class_757
 *  net.minecraft.class_758
 *  net.minecraft.class_758$class_4596
 *  net.minecraft.class_9779
 *  org.joml.Matrix4f
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.At$Shift
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package ruhack.phobia.a;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.class_10209;
import net.minecraft.class_11228;
import net.minecraft.class_1297;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_3928;
import net.minecraft.class_4071;
import net.minecraft.class_435;
import net.minecraft.class_4587;
import net.minecraft.class_757;
import net.minecraft.class_758;
import net.minecraft.class_9779;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ruhack.phobia.as;
import ruhack.phobia.ax;
import ruhack.phobia.bu;
import ruhack.phobia.dj;
import ruhack.phobia.dv;
import ruhack.phobia.dz;
import ruhack.phobia.ef;
import ruhack.phobia.go;
import ruhack.phobia.gr;
import ruhack.phobia.iu;
import ruhack.phobia.ix;
import ruhack.phobia.jj;
import ruhack.phobia.jk;
import ruhack.phobia.jn;
import ruhack.phobia.jp;
import ruhack.phobia.jr;
import ruhack.phobia.ki;
import ruhack.phobia.li;
import ruhack.phobia.lp;
import ruhack.phobia.lr;
import ruhack.phobia.ls;
import ruhack.phobia.lt;
import ruhack.phobia.lu;
import ruhack.phobia.lv;
import ruhack.phobia.lx;
import ruhack.phobia.lz;
import ruhack.phobia.ma;
import ruhack.phobia.mh;
import ruhack.phobia.mo;
import ruhack.phobia.nc;
import ruhack.phobia.on;
import ruhack.phobia.op;
import ruhack.phobia.oq;
import ruhack.phobia.ow;
import ruhack.phobia.oy;
import ruhack.phobia.pn;

@Mixin(value={class_757.class})
public abstract class ag {
    @Unique
    private static boolean phobia$shaderHandsTrailAvailable = true;
    @Shadow
    @Final
    private class_310 field_4015;
    @Shadow
    @Final
    private class_11228 field_59965;
    @Shadow
    @Final
    private class_758 field_60793;

    @ModifyReturnValue(method={"method_22973"}, at={@At(value="RETURN")})
    private Matrix4f phobia$aspectRatio(Matrix4f matrix) {
        ix aspect = ix.getInstance();
        if (aspect != null && aspect.isState()) {
            matrix.m00(matrix.m11() / Math.max(0.1f, aspect.getRatio()));
        }
        return matrix;
    }

    @Inject(method={"method_3188"}, at={@At(value="HEAD")})
    private void phobia$prepareShaderHandsFrame(class_9779 tickCounter, CallbackInfo ci2) {
        jn shaderHands = jn.getInstance();
        if (shaderHands != null && shaderHands.isState()) {
            shaderHands.refreshRenderCache();
        }
    }

    @Inject(method={"method_3188"}, at={@At(value="INVOKE_STRING", target="Lnet/minecraft/class_3695;method_15405(Ljava/lang/String;)V", args={"ldc=hand"})})
    private void hookWorldRender(class_9779 tickCounter, CallbackInfo ci2, @Local(ordinal=0) float tickDelta, @Local(ordinal=0) Matrix4f projection, @Local(ordinal=1) Matrix4f view, @Local class_4587 matrixStack) {
        float saturation;
        if (this.field_4015.field_1687 == null || this.field_4015.field_1724 == null) {
            return;
        }
        lp.setMatrices(projection, view);
        op.update(projection, view, tickDelta);
        lv.setMatrices(projection, view);
        lu.setMatrices(projection, view);
        ls.setMatrices(projection, view);
        lt.setMatrices(projection, view);
        lr.setMatrices(projection, view);
        lz.setMatrices(projection, view);
        lx.setMatrices(projection, view);
        ma.setMatrices(projection, view);
        iu ambience = iu.getInstance();
        if (ambience != null && ambience.isState() && Math.abs((saturation = ambience.getSaturationFactor()) - 1.0f) > 1.0E-4f) {
            li.applyWithCopy(saturation);
        }
        ax.callEvent(new dj(matrixStack, tickDelta));
        jn shaderHands = jn.getInstance();
        if (phobia$shaderHandsTrailAvailable && shaderHands != null && shaderHands.isTrailEnabled() && this.field_4015.field_1690.method_31044().method_31034()) {
            try {
                on.beginFrame();
            }
            catch (LinkageError error) {
                ag.phobia$disableBrokenShaderHandsTrail(shaderHands, error);
            }
        }
    }

    @Inject(method={"method_3188"}, at={@At(value="TAIL")})
    private void phobia$compositeShaderHandsTrail(class_9779 tickCounter, CallbackInfo ci2) {
        jn shaderHands = jn.getInstance();
        if (phobia$shaderHandsTrailAvailable && shaderHands != null && shaderHands.isTrailEnabled() && this.field_4015.field_1690.method_31044().method_31034()) {
            try {
                on.endFrame();
            }
            catch (LinkageError error) {
                ag.phobia$disableBrokenShaderHandsTrail(shaderHands, error);
            }
        }
        if (shaderHands != null && shaderHands.isTrailEnabled() && !this.field_4015.field_1690.method_31044().method_31034()) {
            on.reset();
        }
    }

    @Unique
    private static void phobia$disableBrokenShaderHandsTrail(jn shaderHands, LinkageError error) {
        phobia$shaderHandsTrailAvailable = false;
        shaderHands.trail.setValue(false);
        System.err.println("ShaderHands: trail disabled because its renderer could not be loaded: " + String.valueOf(error));
    }

    @Inject(method={"method_3190"}, at={@At(value="HEAD")}, cancellable=true)
    private void updateCrosshairTargetHook(float tickProgress, CallbackInfo ci2) {
        class_1297 entity;
        gr noEntityTrace = gr.getInstance();
        if (noEntityTrace != null && noEntityTrace.shouldIgnoreEntityTrace() && (entity = this.field_4015.method_1560()) != null && this.field_4015.field_1687 != null && this.field_4015.field_1724 != null) {
            double range = Math.max(this.field_4015.field_1724.method_55754(), this.field_4015.field_1724.method_55755());
            this.field_4015.field_1765 = entity.method_5745(range, tickProgress, false);
            this.field_4015.field_1692 = null;
            ci2.cancel();
        }
    }

    @Inject(method={"method_3190"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_746;method_76762(FLnet/minecraft/class_1297;)Lnet/minecraft/class_239;")}, cancellable=true)
    private void onUpdateTargetedEntity(float tickDelta, CallbackInfo ci2) {
        if (pn.nullCheck()) {
            return;
        }
        go freeCam = go.getInstance();
        if (freeCam.isState()) {
            class_10209.method_64146().method_15407();
            this.field_4015.field_1765 = oy.raycast(freeCam.pos, 4.5, ow.cameraAngle(), false);
            ci2.cancel();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Inject(method={"method_3192"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_11228;method_70890(Lcom/mojang/blaze3d/buffers/GpuBufferSlice;)V", shift=At.Shift.AFTER)})
    private void onAfterGuiRender(class_9779 tickCounter, boolean tick, CallbackInfo ci2, @Local class_332 drawContext) {
        class_4071 class_40712 = this.field_4015.method_18506();
        if (class_40712 instanceof nc) {
            nc resourceReloadOverlay = (nc)class_40712;
            ki.clearOverrideTasks();
            resourceReloadOverlay.phobia$renderAboveGui(drawContext);
            return;
        }
        if (this.field_4015.field_1755 instanceof mo) {
            try {
                ki.renderOverrides(drawContext);
            }
            finally {
                ag.closeActiveBlurFrames();
                oq.reset();
            }
            return;
        }
        if (ki.hasActiveBlurFrame()) {
            try {
                ki.renderOverrides(drawContext);
            }
            finally {
                ag.closeActiveBlurFrames();
                oq.reset();
            }
        }
        if (this.field_4015.field_1690.field_1842) {
            return;
        }
        boolean overlayScreen = this.isOverlayScreen();
        boolean mainMenu = this.isMainMenuScreen();
        if (this.field_4015.field_1755 == null) {
            ki.beginCapturedBlurFrameForced();
            try {
                if (!overlayScreen && !mainMenu) {
                    ag.dispatchDrawEvent(drawContext, tickCounter.method_60636());
                }
                as.onDraw(drawContext, 0, 0, tickCounter.method_60636(), false);
                ki.renderOverrides(drawContext);
            }
            finally {
                ki.endBlurFrameForced();
            }
        } else if (!overlayScreen && !mainMenu) {
            ag.dispatchDrawEvent(drawContext, tickCounter.method_60636());
        }
        jp shulkerPreview = jp.getInstance();
        jr tags = jr.getInstance();
        boolean tagsItemsQueued = !overlayScreen && !mainMenu && tags != null && tags.queueEquipmentModels(drawContext);
        boolean itemModelsQueued = dv.consumeQueuedItemModels();
        jj prediction = jj.getInstance();
        if (!overlayScreen && !mainMenu && prediction != null && prediction.hasQueuedItemModels()) {
            itemModelsQueued = true;
        }
        if (tagsItemsQueued) {
            itemModelsQueued = true;
        }
        if (!overlayScreen && !mainMenu && shulkerPreview != null && shulkerPreview.queueWorldPreviews(drawContext)) {
            itemModelsQueued = true;
        }
        if (itemModelsQueued) {
            this.field_59965.method_70890(this.field_60793.method_71109(class_758.class_4596.field_60101));
            ef targetHud = ef.getInstance();
            if (targetHud != null) {
                targetHud.drawQueuedItemCounts(drawContext);
            }
        }
    }

    private static void closeActiveBlurFrames() {
        while (ki.hasActiveBlurFrame()) {
            ki.endBlurFrameForced();
        }
    }

    private static void dispatchDrawEvent(class_332 context, float tickDelta) {
        dz.beginFrame();
        try {
            ax.callEvent(new bu(context, tickDelta));
        }
        finally {
            dz.endFrame();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Inject(method={"method_3192"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_11228;method_70890(Lcom/mojang/blaze3d/buffers/GpuBufferSlice;)V", shift=At.Shift.BEFORE)})
    private void onBeforeGuiRender(class_9779 tickCounter, boolean tick, CallbackInfo ci2, @Local class_332 drawContext) {
        boolean overlayScreen = this.isOverlayScreen();
        if (!overlayScreen && this.isMainMenuScreen() && !this.field_4015.field_1690.field_1842) {
            ki.beginCapturedBlurFrame();
            try {
                ki.renderOverrides(drawContext);
            }
            finally {
                ki.endBlurFrame();
            }
        }
    }

    @Inject(method={"method_3198"}, at={@At(value="HEAD")}, cancellable=true)
    private void onTiltViewWhenHurt(class_4587 matrices, float tickDelta, CallbackInfo ci2) {
        jk noRender = jk.getInstance();
        if (noRender != null && noRender.isState() && (noRender.modeSetting.isSelected("Damage") || noRender.modeSetting.isSelected("Camera Shake"))) {
            ci2.cancel();
        }
    }

    @Inject(method={"method_3189"}, at={@At(value="HEAD")}, cancellable=true)
    private void phobia$removeTotemAnimation(class_1799 stack, CallbackInfo ci2) {
        jk removals = jk.getInstance();
        if (removals != null && removals.isState() && removals.modeSetting.isSelected("Totem Animation") && stack.method_31574(class_1802.field_8288)) {
            ci2.cancel();
        }
    }

    @ModifyExpressionValue(method={"method_3188"}, at={@At(value="INVOKE", target="Ljava/lang/Math;max(FF)F", ordinal=0)})
    private float onNauseaDistortion(float original) {
        jk noRender = jk.getInstance();
        if (noRender != null && noRender.isState() && noRender.modeSetting.isSelected("Nausea")) {
            return 0.0f;
        }
        return original;
    }

    private boolean isMainMenuScreen() {
        return this.field_4015.field_1755 instanceof mh;
    }

    private boolean isOverlayScreen() {
        return this.field_4015.field_1755 != null && this.field_4015.field_1687 != null && this.field_4015.field_1724 != null && !(this.field_4015.field_1755 instanceof class_3928) && !(this.field_4015.field_1755 instanceof class_435);
    }
}

