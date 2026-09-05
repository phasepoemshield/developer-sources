/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.ModifyExpressionValue
 *  net.minecraft.class_1297
 *  net.minecraft.class_2561
 *  net.minecraft.class_310
 *  net.minecraft.class_329
 *  net.minecraft.class_332
 *  net.minecraft.class_433
 *  net.minecraft.class_5250
 *  net.minecraft.class_9779
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package ruhack.phobia.a;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.class_1297;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_329;
import net.minecraft.class_332;
import net.minecraft.class_433;
import net.minecraft.class_5250;
import net.minecraft.class_9779;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import ruhack.phobia.fo;
import ruhack.phobia.jk;
import ruhack.phobia.mo;

@Mixin(value={class_329.class})
public class an {
    @ModifyExpressionValue(method={"method_55439"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_268;method_1142(Lnet/minecraft/class_270;Lnet/minecraft/class_2561;)Lnet/minecraft/class_5250;")})
    private class_5250 phobia$filterScoreboardEntry(class_5250 original) {
        return fo.filterScoreboard((class_2561)original).method_27661();
    }

    @ModifyExpressionValue(method={"method_1757(Lnet/minecraft/class_332;Lnet/minecraft/class_266;)V"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_266;method_1114()Lnet/minecraft/class_2561;")})
    private class_2561 phobia$filterScoreboardTitle(class_2561 original) {
        return fo.filterScoreboard(original);
    }

    @ModifyExpressionValue(method={"method_1760"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_1657;method_6059(Lnet/minecraft/class_6880;)Z")})
    private boolean phobia$removeHealthEffect(boolean original) {
        jk removals = jk.getInstance();
        return original && (removals == null || !removals.isState() || !removals.modeSetting.isSelected("Health Effect"));
    }

    @Inject(method={"method_1736"}, at={@At(value="HEAD")}, cancellable=true)
    private void onRenderCrosshair(class_332 context, class_9779 tickCounter, CallbackInfo ci2) {
        if (class_310.method_1551().field_1755 instanceof mo || class_310.method_1551().field_1755 instanceof class_433) {
            ci2.cancel();
        }
    }

    @Inject(method={"method_61980"}, at={@At(value="HEAD")}, cancellable=true)
    private void onRenderNauseaOverlay(class_332 context, float nauseaStrength, CallbackInfo ci2) {
        jk noRender = jk.getInstance();
        if (noRender != null && noRender.isState() && noRender.modeSetting.isSelected("Nausea")) {
            ci2.cancel();
        }
    }

    @Inject(method={"method_55803"}, at={@At(value="HEAD")}, cancellable=true)
    private void onRenderScoreboard(class_332 context, class_9779 tickCounter, CallbackInfo ci2) {
        jk noRender = jk.getInstance();
        if (noRender != null && noRender.isState() && noRender.modeSetting.isSelected("Scoreboard")) {
            ci2.cancel();
        }
    }

    @Inject(method={"method_70837"}, at={@At(value="HEAD")}, cancellable=true)
    private void onRenderBossBar(class_332 context, class_9779 tickCounter, CallbackInfo ci2) {
        jk noRender = jk.getInstance();
        if (noRender != null && noRender.isState() && noRender.modeSetting.isSelected("BossBar")) {
            ci2.cancel();
        }
    }

    @Inject(method={"method_1735"}, at={@At(value="HEAD")}, cancellable=true)
    private void phobia$removeVignette(class_332 context, class_1297 entity, CallbackInfo ci2) {
        jk removals = jk.getInstance();
        if (removals != null && removals.isState() && removals.modeSetting.isSelected("Vignette")) {
            ci2.cancel();
        }
    }

    @Inject(method={"method_55801"}, at={@At(value="HEAD")}, cancellable=true)
    private void phobia$removeTitles(class_332 context, class_9779 tickCounter, CallbackInfo ci2) {
        jk removals = jk.getInstance();
        if (removals != null && removals.isState() && removals.modeSetting.isSelected("Titles")) {
            ci2.cancel();
        }
    }
}
