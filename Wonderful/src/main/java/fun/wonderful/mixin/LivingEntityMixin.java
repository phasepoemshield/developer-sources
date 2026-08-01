package fun.wonderful.mixin;

import fun.wonderful.api.storages.implement.helpertstorages.enumvar.ModuleClass;
import fun.wonderful.api.utils.player.InventoryUtils;
import fun.wonderful.api.utils.player.ViaProtocolUtils;
import fun.wonderful.client.modules.impl.render.SwingAnimations;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.entry.RegistryEntry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value={LivingEntity.class})
public abstract class LivingEntityMixin {
    @Redirect(method={"travelInFluid"}, at=@At(value="INVOKE", target="Lnet/minecraft/entity/LivingEntity;getAttributeValue(Lnet/minecraft/registry/entry/RegistryEntry;)D"), require = 0)
    private double onLegacyWaterMovementEfficiency(LivingEntity entity, RegistryEntry<EntityAttribute> attribute) {
        MinecraftClient client = MinecraftClient.getInstance();
        if (entity == client.player && attribute == EntityAttributes.WATER_MOVEMENT_EFFICIENCY && ViaProtocolUtils.isLegacyWaterActive(client)) {
            int depthStrider = InventoryUtils.getEnchantmentLevel(entity.getEquippedStack(EquipmentSlot.FEET), (RegistryKey<Enchantment>)Enchantments.DEPTH_STRIDER);
            return (double)Math.min(depthStrider, 3) / 3.0;
        }
        return entity.getAttributeValue(attribute);
    }

    @Inject(method={"getHandSwingDuration"}, at={@At(value="HEAD")}, cancellable=true)
    private void onGetHandSwingDuration(CallbackInfoReturnable<Integer> cir) {
        if ((Object)this != MinecraftClient.getInstance().player) {
            return;
        }
        if (ModuleClass.INSTANCE == null) {
            return;
        }
        SwingAnimations tweaks = ModuleClass.swingAnimations;
        if (tweaks != null && tweaks.isEnable() && tweaks.smoothEnabled.isState()) {
            cir.setReturnValue(((int)tweaks.slowAnimationSpeed.get()));
        }
    }
}