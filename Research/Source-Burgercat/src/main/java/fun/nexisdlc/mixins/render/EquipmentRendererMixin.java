package fun.nexisdlc.mixins.render;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import fun.nexisdlc.NexisClient;
import fun.nexisdlc.modules.impl.render.ArmorDurability;
import net.minecraft.client.render.entity.equipment.EquipmentRenderer;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(EquipmentRenderer.class)
public class EquipmentRendererMixin {

    @ModifyExpressionValue(
            method = "render(Lnet/minecraft/client/render/entity/equipment/EquipmentModel$LayerType;Lnet/minecraft/registry/RegistryKey;Lnet/minecraft/client/model/Model;Ljava/lang/Object;Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/command/OrderedRenderCommandQueue;ILnet/minecraft/util/Identifier;II)V",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/client/render/entity/equipment/EquipmentRenderer;getDyeColor(Lnet/minecraft/client/render/entity/equipment/EquipmentModel$Layer;I)I"
            )
    )
    private int nexis$tintArmorDurability(int original, @Local(argsOnly = true) ItemStack stack) {
        ArmorDurability mod = NexisClient.getFunctionManager().getArmorDurability();
        if (mod != null && mod.isState() && stack != null && stack.isDamageable()) {
            return mod.getColor(stack);
        }
        return original;
    }
}