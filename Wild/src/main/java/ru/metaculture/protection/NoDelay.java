package ru.metaculture.protection;

import net.minecraft.item.Items;
import org.wild.mixin.acceser.ClientPlayerInteractionManagerAccessor;
import org.wild.mixin.acceser.MinecraftClientAccessor;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "NoDelay",
   O000000000 = "Убирает задержку",
   O0000000000 = Category.Player
)
public class NoDelay extends Module {
   public static BooleanSetting O000000000O = new BooleanSetting("Прыжки", true);
   public static BooleanSetting O000000000O0 = new BooleanSetting("Поломка блоков", false);
   public static BooleanSetting O000000000O00 = new BooleanSetting("ЛКМ", false);
   public static BooleanSetting O000000000O000 = new BooleanSetting("ПКМ", false);
   public static BooleanSetting O000000000O00O = new BooleanSetting("Пузырьки опыта", true);
   public static NumberSetting O000000000O0O = new NumberSetting("Скорость прыжка", 0.0F, 0.0F, 10.0F, 1.0F, false).O00000000(() -> !O000000000O.O0000000000());
   public static NumberSetting O000000000O0O0 = new NumberSetting("Скорость поломки блока", 0.0F, 0.0F, 5.0F, 1.0F, false)
      .O00000000(() -> !O000000000O0.O0000000000());
   public static NumberSetting O000000000O0OO = new NumberSetting("ЛКМ задержка", 0.0F, 0.0F, 10.0F, 1.0F, false).O00000000(() -> !O000000000O00.O0000000000());
   public static NumberSetting O000000000OO = new NumberSetting("ПКМ задержка", 0.0F, 0.0F, 4.0F, 1.0F, false).O00000000(() -> !O000000000O000.O0000000000());

   public NoDelay() {
      this.O00000000(
         new Setting[]{O000000000O, O000000000O0O, O000000000O0, O000000000O0O0, O000000000O00, O000000000O0OO, O000000000O000, O000000000OO, O000000000O00O}
      );
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.player != null) {
         if (O000000000O0.O0000000000() && O0000000000.interactionManager != null) {
            ClientPlayerInteractionManagerAccessor var2 = (ClientPlayerInteractionManagerAccessor)O0000000000.interactionManager;
            if (var2.getBlockBreakingCooldown() > O000000000O0O0.O0000000000()) {
               var2.setBlockBreakingCooldown((int)O000000000O0O0.O0000000000());
            }
         }

         if (O000000000O00O.O0000000000()) {
            boolean var3 = O0000000000.player.getMainHandStack().getItem() == Items.EXPERIENCE_BOTTLE
               || O0000000000.player.getOffHandStack().getItem() == Items.EXPERIENCE_BOTTLE;
            if (var3) {
               ((MinecraftClientAccessor)O0000000000).setItemUseCooldown(0);
            }
         }
      }
   }

   @Override
   public void O000000000() {
      super.O000000000();
      if (O0000000000.interactionManager != null) {
         ((ClientPlayerInteractionManagerAccessor)O0000000000.interactionManager).setBlockBreakingCooldown(5);
      }
   }
}
