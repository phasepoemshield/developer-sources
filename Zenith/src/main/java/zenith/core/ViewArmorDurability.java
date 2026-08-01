package zenith;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;

@ModuleInfo(
   name = "View Armor Durability",
   category = Category.RENDER,
   description = "Показывает прочность брони"
)
public class ViewArmorDurability extends Module {
   public static final ViewArmorDurability III11I1l11llIl1I = new ViewArmorDurability();
   private final BooleanSetting lll1ll1l1IIIl1l11I11 = new BooleanSetting("module.viewArmorDurability.naSebe", true);
   private final BooleanSetting IlIl1llIIlIlll1l1IIIll = new BooleanSetting("module.viewArmorDurability.naEnemies", true);

   private ViewArmorDurability() {
   }

   public boolean StringHolder_8(ItemStack ItemStack, boolean flag) {
      if (ItemStack == null || ItemStack.isEmpty()) {
         return false;
      } else if (!(ItemStack.getItem() instanceof ArmorItem)) {
         return false;
      } else {
         return flag && !this.lll1ll1l1IIIl1l11I11.Spider() ? false : !flag || this.IlIl1llIIlIlll1l1IIIll.Spider();
      }
   }

   public int StringHolder_5(ItemStack ItemStack) {
      return ItemStack.getItemBarColor();
   }
}
