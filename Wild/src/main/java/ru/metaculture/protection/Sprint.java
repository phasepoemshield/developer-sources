package ru.metaculture.protection;

import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.text.Text;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "Sprint",
   O000000000 = "Сложна понять че за модуль",
   O0000000000 = Category.Movement
)
public class Sprint extends Module {
   public static BooleanSetting O000000000O = new BooleanSetting("Сохранять спринт", false);
   public static NumberSetting O000000000O0 = new NumberSetting("Сила сохранения", 0.6F, 0.2F, 1.0F, 0.1F, false).O00000000(() -> !O000000000O.O0000000000());
   public final BooleanSetting O000000000O00 = new BooleanSetting("Игнорировать голод", false);
   public static int O000000000O000 = 0;

   public Sprint() {
      this.O00000000(new Setting[]{O000000000O, O000000000O0, this.O000000000O00});
   }

   @EventHandler
   public void O00000000(O0000000O0O o0000000O0O) {
      if (O0000000000.player != null && !O0000000000.player.hasStatusEffect(StatusEffects.BLINDNESS)) {
         if (O000000000O.O0000000000()) {
            O0000000000.player
               .setVelocity(
                  O0000000000.player.getVelocity().x / O000000000O0.O0000000000(),
                  O0000000000.player.getVelocity().y,
                  O0000000000.player.getVelocity().z / O000000000O0.O0000000000()
               );
            O0000000000.player.setSprinting(true);
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.player != null && O0000000000.world != null) {
         if (O0000000000.player.hasStatusEffect(StatusEffects.BLINDNESS)) {
            O0000000000.player.setSprinting(false);
            O0000000000.options.sprintKey.setPressed(false);
         } else {
            boolean var2 = O0000000000.player.horizontalCollision && !O0000000000.player.collidedSoftly;
            if (O000000000O000 != 0) {
               O0000000000.player.setSprinting(false);
               O0000000000.options.sprintKey.setPressed(false);
               O000000000O000--;
            } else {
               if (O000000O00OOOO.O000000000(AttackAura.O00000000OO0, AttackAura.O000000000(AttackAura.O00000000OO0))) {
                  O0000000000.player.setSprinting(false);
                  O0000000000.options.sprintKey.setPressed(false);
               }

               if (!O0000000000.player.isSneaking() && !var2 && O0000000000.options.forwardKey.isPressed()) {
                  O0000000000.player.setSprinting(true);
                  O0000000000.options.sprintKey.setPressed(true);
               }
            }
         }
      }
   }

   @Override
   public void O000000000() {
      super.O000000000();
      if (O0000000000.player != null) {
         O0000000000.player.setSprinting(false);
      }
   }

   @Override
   public void O00000000() {
      super.O00000000();
      if (this.O000000000O00.O0000000000() && !O0000O00O0000O.O0000000000() && O0000000000.player != null) {
         O0000000000.player.sendMessage(Text.of("§cДанная настройка работает только на FunTime!"), true);
      }
   }
}
