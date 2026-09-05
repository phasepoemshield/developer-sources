/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 *  net.minecraft.class_332
 *  net.minecraft.class_3928
 *  net.minecraft.class_408
 *  net.minecraft.class_435
 *  net.minecraft.class_437
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package ruhack.phobia.a;

import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_3928;
import net.minecraft.class_408;
import net.minecraft.class_435;
import net.minecraft.class_437;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ruhack.phobia.as;
import ruhack.phobia.ax;
import ruhack.phobia.bu;
import ruhack.phobia.dz;
import ruhack.phobia.ff;
import ruhack.phobia.jp;
import ruhack.phobia.jr;
import ruhack.phobia.ki;
import ruhack.phobia.mo;
import ruhack.phobia.oq;

@Mixin(value={class_437.class})
public class br {
    @Inject(method={"applyBlur"}, at={@At(value="HEAD")}, cancellable=true)
    private void phobia$skipVanillaClientScreenBlur(class_332 context, CallbackInfo ci2) {
        class_437 screen = (class_437)this;
        if (ff.blurDisabled() || br.isClientScreen(screen)) {
            ci2.cancel();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Inject(method={"renderWithTooltip(Lnet/minecraft/client/gui/DrawContext;IIF)V"}, at={@At(value="HEAD")})
    private void onRenderHead(class_332 context, int mouseX, int mouseY, float delta, CallbackInfo ci2) {
        jp shulkerPreview;
        jr tags;
        boolean chat;
        class_437 self = (class_437)this;
        if (!br.isGameOverlay(self) || class_310.method_1551().field_1690.field_1842) {
            return;
        }
        if (self instanceof mo) {
            ki.clearOverrideTasks();
            as.onDraw(context, 0, 0, delta, false);
            ki.renderOverrides(context);
            oq.reset();
            return;
        }
        if (!br.isClientScreen(self) && !(self instanceof class_408)) {
            ki.clearOverrideTasks();
        }
        if (chat = self instanceof class_408) {
            ki.beginCapturedBlurFrameForced();
        }
        dz.beginFrame();
        try {
            ax.callEvent(new bu(context, delta));
        }
        finally {
            dz.endFrame();
        }
        if (!chat) {
            as.onDraw(context, 0, 0, delta, false);
        }
        if (!chat) {
            ki.renderOverrides(context);
        }
        if ((tags = jr.getInstance()) != null) {
            tags.queueEquipmentModels(context);
        }
        if ((shulkerPreview = jp.getInstance()) != null) {
            shulkerPreview.queueWorldPreviews(context);
        }
    }

    private static boolean isGameOverlay(class_437 screen) {
        class_310 client = class_310.method_1551();
        return client.field_1687 != null && client.field_1724 != null && !(screen instanceof class_3928) && !(screen instanceof class_435);
    }

    private static boolean isClientScreen(class_437 screen) {
        return screen.getClass().getName().startsWith("ruhack.phobia.");
    }
}
