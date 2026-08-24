package moscow.rockstar.module.player;

import lombok.Generated;
import moscow.rockstar.mixin.minecraft.client.IMinecraftClient;
import moscow.rockstar.module.api.ModuleCategory;
import moscow.rockstar.module.api.ModuleInfo;
import moscow.rockstar.module.impl.BaseModule;
import moscow.rockstar.config.settings.BooleanSetting;
import moscow.rockstar.config.settings.SliderSetting;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

@ModuleInfo(name = "No Delay", category = ModuleCategory.PLAYER, desc = "Удаление задержек между действиями")
public class NoDelay extends BaseModule {
   private final BooleanSetting jump = new BooleanSetting(this, "Прыжок", "Убирает задержку между прыжками").enable();
   private final BooleanSetting rightClick = new BooleanSetting(
      this, "Правый клик", "Убирает задержку между правыми кликами"
   );
   private final SliderSetting rightClickDelay = new SliderSetting(
         this, "Задержка правого клика", () -> !this.rightClick.isEnabled()
      )
      .min(1.0F)
      .max(100.0F)
      .step(1.0F)
      .currentValue(1.0F)
      .suffix(" мс");
   private final BooleanSetting exp = new BooleanSetting(this, "Опыт", () -> !this.rightClick.isEnabled());
   private final BooleanSetting potions = new BooleanSetting(this, "Зелья", () -> !this.rightClick.isEnabled());

   @Override
   public void tick() {
      if (mc.player == null) {
         return;
      }

      IMinecraftClient client = (IMinecraftClient) (Object) mc;
      if (this.rightClick.isEnabled()) {
         int delayTicks = Math.max(1, (int) Math.ceil(this.rightClickDelay.getCurrentValue() / 50.0F));
         if (client.getUseCooldown() > delayTicks) {
            client.setUseCooldown(delayTicks);
         }
      }

      if (this.exp.isEnabled()
         && (mc.player.getMainHandStack().isOf(Items.EXPERIENCE_BOTTLE) || mc.player.getOffHandStack().isOf(Items.EXPERIENCE_BOTTLE))) {
         client.setUseCooldown(0);
      }

      if (this.potions.isEnabled() && (this.isPotion(mc.player.getMainHandStack().getItem()) || this.isPotion(mc.player.getOffHandStack().getItem()))) {
         client.setUseCooldown(0);
      }

      super.tick();
   }

   private boolean isPotion(Item item) {
      return item == Items.POTION || item == Items.SPLASH_POTION || item == Items.LINGERING_POTION || item == Items.GLASS_BOTTLE;
   }

   @Generated
   public BooleanSetting getJump() {
      return this.jump;
   }

   @Generated
   public BooleanSetting getRightClick() {
      return this.rightClick;
   }
}
