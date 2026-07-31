package fun.wonderful.mixin;

import fun.wonderful.api.storages.implement.helpertstorages.enumvar.ModuleClass;
import fun.wonderful.client.modules.impl.render.Removals;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.GameRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={GameRenderer.class})
public class GameRendererMixin {
    @Inject(method={"showFloatingItem"}, at={@At(value="HEAD")}, cancellable=true)
    private void wonderful$hideTotemAnimation(ItemStack stack, CallbackInfo ci) {
        if (ModuleClass.INSTANCE == null || stack == null || !stack.isOf(Items.TOTEM_OF_UNDYING)) {
            return;
        }
        Removals removals = ModuleClass.removals;
        if (removals != null && removals.isTotemAnimationDisabled()) {
            ci.cancel();
        }
    }

    @Inject(method={"getFov"}, at={@At(value="RETURN")}, cancellable=true)
    private void wonderful$noFovChange(Camera camera, float tickDelta, boolean changingFov, CallbackInfoReturnable<Float> cir) {
        if (!changingFov) {
            return;
        }
        Removals removals = ModuleClass.removals;
        if (removals == null || !removals.isNoFovEnabled()) {
            return;
        }
        float baseFov = ((Integer)MinecraftClient.getInstance().options.getFov().getValue()).intValue();
        cir.setReturnValue((Object)Float.valueOf(baseFov));
    }
}