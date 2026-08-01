package l;

import antidaunleak.api.annotation.Native;
import net.minecraft.item.Item;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;

public class ItemScroller extends Helper242 {
   private final Helper339 stopWatch = new Helper339();
   private final Setting2 scrollerSetting = new Setting2("Задержка прокрутки предметов", "Выберите задержку прокрутки предметов")
      .method2086(50.0F)
      .method2079(0, 200);

   public ItemScroller() {
      super("ItemScroller", "Item Scroller", Helper269.PLAYER);
      this.setup(new Helper264[]{this.scrollerSetting});
   }

   @Helper104
   @Native(
      type = Native.Type.VMProtectBeginMutation
   )
   public void method2204(Event5 var1) {
      Slot var2 = var1.method3657();
      SlotActionType var3 = Helper38.method544(mc.options.dropKey)
         ? SlotActionType.THROW
         : (Helper38.method544(mc.options.attackKey) ? SlotActionType.QUICK_MOVE : null);
      if (Helper38.method544(mc.options.sneakKey)
         && !Helper38.method544(mc.options.sprintKey)
         && var2 != null
         && var2.hasStack()
         && var3 != null
         && this.stopWatch.method3357(this.scrollerSetting.method2082())) {
         mc.interactionManager.clickSlot(mc.player.currentScreenHandler.syncId, var2.id, var3.equals(SlotActionType.THROW) ? 1 : 0, var3, mc.player);
      }
   }

   @Helper104
   public void method2205(Helper371 var1) {
      int var2 = var1.method3649();
      if (var2 >= 0 && var2 <= mc.player.currentScreenHandler.slots.size()) {
         Slot var3 = mc.player.currentScreenHandler.getSlot(var2);
         Item var4 = var3.getStack().getItem();
         if (var4 != null && Helper38.method544(mc.options.sneakKey) && Helper38.method544(mc.options.sprintKey) && this.stopWatch.method3357(50.0)) {
            Helper66.method720()
               .filter(var2x -> var2x.getStack().getItem().equals(var4) && var2x.inventory.equals(var3.inventory))
               .forEach(var1x -> mc.interactionManager.clickSlot(mc.player.currentScreenHandler.syncId, var1x.id, 1, var1.method3651(), mc.player));
         }
      }
   }
}
