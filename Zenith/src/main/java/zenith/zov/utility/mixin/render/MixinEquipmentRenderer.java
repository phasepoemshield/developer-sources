package zenith.zov.utility.mixin.render;

import net.minecraft.client.render.entity.equipment.EquipmentRenderer;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.client.model.Model;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.registry.RegistryKey;
import net.minecraft.client.render.entity.equipment.EquipmentModel.CopyNameLootFunction90;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import zenith.ZenithInternal076;
import zenith.ViewArmorDurability;

@Mixin({EquipmentRenderer.class})
public class MixinEquipmentRenderer implements ZenithInternal076 {
   @Unique
   private ItemStack renderStack = ItemStack.EMPTY;

   @Inject(
      method = {"render(Lnet/minecraft/client/render/entity/equipment/EquipmentModel$LayerType;Lnet/minecraft/registry/RegistryKey;Lnet/minecraft/client/model/Model;Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;ILnet/minecraft/util/Identifier;)V"},
      at = {@At("HEAD")}
   )
   private void onRenderHead(
      CopyNameLootFunction90 CopyNameLootFunction90,
      RegistryKey<EquipmentAsset> RegistryKey,
      Model Model,
      ItemStack ItemStack,
      MatrixStack MatrixStack,
      VertexConsumerProvider VertexConsumerProvider,
      int i,
      Identifier Identifier,
      CallbackInfo callbackinfo
   ) {
      this.renderStack = ItemStack;
   }

   @Inject(
      method = {"render(Lnet/minecraft/client/render/entity/equipment/EquipmentModel$LayerType;Lnet/minecraft/registry/RegistryKey;Lnet/minecraft/client/model/Model;Lnet/minecraft/item/ItemStack;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;ILnet/minecraft/util/Identifier;)V"},
      at = {@At("TAIL")}
   )
   private void onRenderTail(
      CopyNameLootFunction90 CopyNameLootFunction90,
      RegistryKey<EquipmentAsset> RegistryKey,
      Model Model,
      ItemStack ItemStack,
      MatrixStack MatrixStack,
      VertexConsumerProvider VertexConsumerProvider,
      int i,
      Identifier Identifier,
      CallbackInfo callbackinfo
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
   private int onModifyColor(int i) {
      if (l11I1I1ll1Illll1I1l1111l1II.player == null || l11I1I1ll1Illll1I1l1111l1II.world == null) {
         return i;
      } else if (this.renderStack != null && !this.renderStack.isEmpty()) {
         ViewArmorDurability ll1lil1ii1iil1l = ViewArmorDurability.III11I1l11llIl1I;
         if (!ll1lil1ii1iil1l.Spider()) {
            return i;
         } else {
            boolean flag = this.isSelfArmor(this.renderStack);
            return !ll1lil1ii1iil1l.StringHolder_8(this.renderStack, flag) ? i : ll1lil1ii1iil1l.StringHolder_5(this.renderStack);
         }
      } else {
         return i;
      }
   }

   @Unique
   private boolean isSelfArmor(ItemStack ItemStack) {
      if (l11I1I1ll1Illll1I1l1111l1II.player == null) {
         return false;
      } else {
         for (ItemStack ItemStack : l11I1I1ll1Illll1I1l1111l1II.player.getInventory().armor) {
            if (ItemStack == null) {
               return true;
            }
         }

         return false;
      }
   }
}
