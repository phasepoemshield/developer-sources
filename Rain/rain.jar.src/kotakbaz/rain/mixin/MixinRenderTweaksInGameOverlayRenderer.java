/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.mixin;

import kotakbaz.rain.module.modules.render.RenderTweaksModule;
import net.minecraft.client.gui.hud.InGameOverlayRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.random.Random;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={InGameOverlayRenderer.class})
public class MixinRenderTweaksInGameOverlayRenderer {
    @Inject(method={"method_70938"}, at={@At(value="HEAD")}, cancellable=true)
    private void rain$cancelTotemAnimation(ItemStack stack, Random random, CallbackInfo ci) {
        if (!RenderTweaksModule.INSTANCE.isEnabled()) {
            return;
        }
        if (((Boolean)RenderTweaksModule.INSTANCE.getNoTotemAnimation().getValue()).booleanValue() && stack.isOf(Items.TOTEM_OF_UNDYING)) {
            ci.cancel();
        }
    }
}

