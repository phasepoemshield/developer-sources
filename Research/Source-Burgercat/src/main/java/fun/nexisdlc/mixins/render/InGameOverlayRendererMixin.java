package fun.nexisdlc.mixins.render;

import fun.nexisdlc.modules.impl.render.NoRender;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.texture.Sprite;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(net.minecraft.client.gui.hud.InGameOverlayRenderer.class)
public class InGameOverlayRendererMixin {
    @Inject(method = "setFloatingItem", at = @At("HEAD"), cancellable = true)
    private void cancelTotemAnimation(ItemStack stack, net.minecraft.util.math.random.Random random, CallbackInfo ci) {
        if (NoRender.isEnabled("Тотем на экране") && stack.isOf(Items.TOTEM_OF_UNDYING)) {
            ci.cancel();
        }
    }

    @Inject(method = "renderInWallOverlay", at = @At("HEAD"), cancellable = true)
    private static void nexis$cancelInWallOverlay(Sprite sprite, MatrixStack matrices, VertexConsumerProvider vertexConsumers, CallbackInfo ci) {
        if (NoRender.isEnabled("Оверлей блоков")) {
            ci.cancel();
        }
    }

    @Inject(method = "renderFireOverlay", at = @At("HEAD"), cancellable = true)
    private static void nexis$cancelFireOverlay(MatrixStack matrices, VertexConsumerProvider vertexConsumers, Sprite sprite, CallbackInfo ci) {
        if (NoRender.isEnabled("Огонь")) {
            ci.cancel();
        }
    }

    @Inject(method = "renderUnderwaterOverlay", at = @At("HEAD"), cancellable = true)
    private static void nexis$cancelUnderwaterOverlay(MinecraftClient client, MatrixStack matrices, VertexConsumerProvider vertexConsumers, CallbackInfo ci) {
        if (NoRender.isEnabled("Оверлей блоков")) {
            ci.cancel();
        }
    }
}
