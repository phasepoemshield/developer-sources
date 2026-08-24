package moscow.rockstar.util.mixins;

import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentType;

public interface ArmorItemAddition {
   EquipmentType rockstar$getType();

   ArmorMaterial rockstar$getMaterial();
}
