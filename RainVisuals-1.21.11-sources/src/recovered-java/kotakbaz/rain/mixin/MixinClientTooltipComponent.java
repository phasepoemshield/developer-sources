/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.tooltip.TooltipComponent
 *  net.minecraft.item.tooltip.TooltipData
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package kotakbaz.rain.mixin;

import net.minecraft.client.gui.tooltip.TooltipComponent;
import net.minecraft.item.tooltip.TooltipData;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import oxxxde.\u062f\u0624;
import oxxxde.\u0636\u064d;

@Mixin(value={TooltipComponent.class})
public interface MixinClientTooltipComponent {
    @Inject(method={"method_32663"}, at={@At(value="HEAD")}, cancellable=true)
    private static void rain$createShulkerPreview(TooltipData component, CallbackInfoReturnable<TooltipComponent> cir) {
        if (component instanceof \u062f\u0624) {
            \u062f\u0624 shulkerPreview = (\u062f\u0624)component;
            cir.setReturnValue((Object)new \u0636\u064d(shulkerPreview));
        }
    }
}

