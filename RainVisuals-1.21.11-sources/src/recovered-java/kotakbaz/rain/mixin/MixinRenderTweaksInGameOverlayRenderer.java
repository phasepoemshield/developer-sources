/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.hud.InGameOverlayRenderer
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.util.math.random.Random
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package kotakbaz.rain.mixin;

import net.minecraft.client.gui.hud.InGameOverlayRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.random.Random;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oxxxde.\u0635\u0650;

@Mixin(value={InGameOverlayRenderer.class})
public class MixinRenderTweaksInGameOverlayRenderer {
    @Inject(method={"method_70938"}, at={@At(value="HEAD")}, cancellable=true)
    private void rain$cancelTotemAnimation(ItemStack stack, Random random, CallbackInfo ci) {
        if (!\u0635\u0650.INSTANCE.isEnabled()) {
            return;
        }
        if (((Boolean)\u0635\u0650.INSTANCE.getNoTotemAnimation().getValue()).booleanValue() && stack.isOf(Items.TOTEM_OF_UNDYING)) {
            ci.cancel();
        }
    }
}

