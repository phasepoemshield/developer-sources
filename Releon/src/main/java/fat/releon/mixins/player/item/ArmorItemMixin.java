package fat.releon.mixins.player.item;

import l.Helper150;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item.Settings;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin({ArmorItem.class})
public abstract class ArmorItemMixin implements Helper150 {
   @Unique
   private ArmorMaterial armorMaterial;
   @Unique
   private EquipmentType type;

   public ArmorItemMixin() {
   }

   @Inject(
      method = {"<init>"},
      at = {@At("RETURN")}
   )
   public void hookCatchArgs(ArmorMaterial var1, EquipmentType var2, Settings var3, CallbackInfo var4) {
      this.armorMaterial = var1;
      this.type = var2;
   }

   @Override
   public ArmorMaterial zov_pidarok$getMaterial() {
      return this.armorMaterial;
   }

   @Override
   public EquipmentType zov_pidarok$getType() {
      return this.type;
   }
}
