package org.zenith.utility.mixin.render;

import org.zenith.event.Event01;
import org.zenith.module.Module;
import org.zenith.ZenithClient;
import org.zenith.util.Item;

import org.zenith.module.ViewArmorDurability;

import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.CloudResponse;
import org.zenith.module.ViewArmorDurability;
import org.zenith.core.ClientProvider;















import net.minecraft.client.MinecraftClient;
import net.minecraft.client.model.Model;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.equipment.EquipmentRenderer;
import net.minecraft.client.render.entity.equipment.EquipmentModel.LayerType;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({EquipmentRenderer.class})
public class MixinEquipmentRenderer implements ClientProvider {
   @Unique
   public ItemStack renderStack = ItemStack.EMPTY;

   public MixinEquipmentRenderer() {
   }

   @Inject(
      method = {"render(Lnet/minecraft/client/render/entity/equipment/EquipmentModel$LayerType;Lnet/minecraft/registry/RegistryKey;Lnet/minecraft/client/model/Model;Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;ILnet/minecraft/util/Identifier;)V"},
      at = {@At("HEAD")}
   )
   public void onRenderHead(
      LayerType var1,
      RegistryKey<EquipmentAsset> var2,
      Model var3,
      ItemStack var4,
      MatrixStack var5,
      VertexConsumerProvider var6,
      int var7,
      Identifier var8,
      CallbackInfo var9
   ) {
      this.renderStack = var4;
   }

   @Inject(
      method = {"render(Lnet/minecraft/client/render/entity/equipment/EquipmentModel$LayerType;Lnet/minecraft/registry/RegistryKey;Lnet/minecraft/client/model/Model;Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;ILnet/minecraft/util/Identifier;)V"},
      at = {@At("TAIL")}
   )
   public void onRenderTail(
      LayerType var1,
      RegistryKey<EquipmentAsset> var2,
      Model var3,
      ItemStack var4,
      MatrixStack var5,
      VertexConsumerProvider var6,
      int var7,
      Identifier var8,
      CallbackInfo var9
   ) {
      this.renderStack = ItemStack.EMPTY;
   }

   @ModifyArg(
      method = {"render(Lnet/minecraft/client/render/entity/equipment/EquipmentModel$LayerType;Lnet/minecraft/registry/RegistryKey;Lnet/minecraft/client/model/Model;Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;ILnet/minecraft/util/Identifier;)V"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/client/model/Model;render(Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumer;III)V"
      ),
      index = 4
   )
   public int onModifyColor(int var1) {
      if (minecraftClient3.player == null || minecraftClient3.world == null) {
         return var1;
      } else if (this.renderStack != null && !this.renderStack.isEmpty()) {
         ViewArmorDurability li11lillliiliil1ilill1ii1 = ViewArmorDurability.viewArmorDurability;
         if (!li11lillliiliil1ilill1ii1.isEnabled()) {
            return var1;
         } else {
            boolean flag = this.isSelfArmor(this.renderStack);
            return !li11lillliiliil1ilill1ii1.on23(this.renderStack, flag) ? var1 : li11lillliiliil1ilill1ii1.Event01(this.renderStack);
         }
      } else {
         return var1;
      }
   }

   @Unique
   public boolean isSelfArmor(ItemStack var1) {
      if (minecraftClient3.player == null) {
         return false;
      } else {
         for (ItemStack itemstack : minecraftClient3.player.getInventory().armor) {
            if (itemstack == null) {
               return true;
            }
         }

         return false;
      }
   }
}
